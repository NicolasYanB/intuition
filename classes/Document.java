package intuition.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Document {
  private LocalDate created;
  private LocalDate last_updated;
  private String text;
  private String filename;

  private static String path = "files";

  private Document() {};

  static Document open(String filename) {
    Document opened = new Document();
    String filepath = path + "/" + filename;
    return opened;
  }

  String getCreated() {
    return created.toString();
  }

  void save(String text) throws IOException{
    BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename, false));
    writer.write(text, 0, 0); 
    writer.close();
    this.last_updated = LocalDate.now();
  }
}
