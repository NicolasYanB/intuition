package intuition.classes;

import java.util.Vector;
import java.util.HashMap;
import java.io.File;

public class Folder {
  private String name;
  private Vector<Folder> subFolders;
  private Vector<Document> docs;
  private String path;
  private Folder parent;
  
  public Folder(String name, Folder parent, String path) {
    this.name = name;
    this.path = path;
    this.parent = parent;
    this.docs = new Vector<>();
    this.subFolders = new Vector<>();

    File f = new File(path + "/" + name);

    File[] ls = f.listFiles();
    for (File content : ls) {
      if (content.isFile()) {
        docs.add(new Document(content.getName(), path + "/" + name));
      }
      if (content.isDirectory()) {
        subFolders.add(new Folder(content.getName(), this, path + "/" + name));
      }
    }
  }

  void addSubfolder(Folder new_folder) {
    this.subFolders.add(new_folder);
  }

  void addDocument(Document new_doc) {
    this.docs.add(new_doc);
  }

  String getName() {
    return this.name;
  }

  void delete() throws Exception {
    if (subFolders.size() != 0 || docs.size() != 0) {
      throw new Exception("Folder is not empty");
    }
  }

  void deleteRecursive() {
    for (Folder folder : subFolders) {
      folder.deleteRecursive();
    }

    for (Document doc : docs) {
      doc.delete();
    }

    File f = new File(path + "/" + name);
    f.delete();
  }

  HashMap<Integer, String> showDocuments() {
    HashMap<Integer, String> doc_list = new HashMap<>();
    for (Integer i = 0; i < this.docs.size(); i++) {
      doc_list.put(i, this.docs.get(i).getFilename());
    }
    return doc_list;
  }

  HashMap<Integer, String> showSubFolders() {
    HashMap<Integer, String> folder_list = new HashMap<>();
    for (Integer i = 0; i < this.subFolders.size(); i++) {
      folder_list.put(i, this.subFolders.get(i).getName());
    }
    return folder_list;
  }
}
