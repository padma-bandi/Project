package thirdproject;
// This line declares the package "thirdproject" for the current Java file.

public class User {
// Declaration of the User class.

    private String username;
    private String password;
    private String name;
    private String email;

    // Constructor to initialize user properties (username, password, name, email).
    public User(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    // Getter method for retrieving the username.
    public String getUsername() {
        return username;
    }

    // Setter method for setting the username.
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter method for retrieving the password.
    public String getPassword() {
        return password;
    }

    // Setter method for setting the password.
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter method for retrieving the name.
    public String getName() {
        return name;
    }

    // Setter method for setting the name.
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for retrieving the email.
    public String getEmail() {
        return email;
    }

    // Setter method for setting the email.
    public void setEmail(String email) {
        this.email = email;
    }

    // Getters for user properties.
}
