package intuition.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.io.File;

public class Document {
  private LocalDate created;
  private String text;
  private String filename;
  private String path;

  public Document(String filename, String path) {
    this.filename = filename;
    this.path = path;
  }

  String getCreated() {
    return created.toString();
  }

  void save(String text) throws IOException{
    BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename, false));
    writer.write(text, 0, 0); 
    writer.close();
  }

  void delete() {
    File f = new File(path + "/" + filename);
    f.delete();
  }

  String getFilename() {
    return this.filename;
  }

  String getText() {
    return this.text;
  }
}
