package intuition.classes;

public class User {
  private String username;
  private String email;
  private String password;

  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }

  void setPassword(String new_pass) {
    this.password = new_pass;
  }

  String getUsername() {
    return this.username;
  }

  String getEmail() {
    return this.email;
  }

  void setUsername(String new_username) {
    this.username = new_username;
  }

  void setEmail(String new_email) {
    this.email = new_email;
  }
}