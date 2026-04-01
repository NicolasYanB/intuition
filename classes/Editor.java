package intuition.classes;

import java.util.HashMap;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.File;

public class Editor {
  private Document opened;
  private Folder currFolder;
  private User user;

  public Editor(User user) {
    this.user = user;
    this.currFolder = new Folder(user.getUsername(), null, "");

    if (!Files.exists(Paths.get(user.getUsername()))) {
      new File(user.getUsername()).mkdir();
    }

    this.opened = null;
  }

  void list() {
    HashMap
  }
}
