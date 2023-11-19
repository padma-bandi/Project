package thirdproject;
// This line declares the package "thirdproject" for the current Java file.

import java.util.ArrayList;
import java.util.List;

public class UserAuthentication {
// Declaration of the UserAuthentication class.

    private List<User> users;
    // Declaration of a private list to store user objects.

    // Constructor to initialize the list of users.
    public UserAuthentication() {
        this.users = new ArrayList<>();
    }

    // Method to register a new user.
    public void registerUser(String username, String password, String name, String email) {
        // Check if the username is already in use
        if (isUsernameTaken(username)) {
            System.out.println("Username is already taken. Please choose a different one.");
            return;
        }

        // Create a new user and add them to the list of users
        User newUser = new User(username, password, name, email);
        users.add(newUser);
        System.out.println("User registered successfully!");
    }

    // Method to log in a user based on provided username and password.
    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // User found, return the user object
            }
        }
        return null; // User not found
    }

    // Private method to check if a username is already taken.
    private boolean isUsernameTaken(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true; // Username is already in use
            }
        }
        return false; // Username is available
    }

    // Placeholder method to check if a password is valid (TODO: To be implemented).
    public boolean isValidPassword(String password) {
        // TODO Auto-generated method stub
        return false;
    }

    // Placeholder method to check if a username is valid (TODO: To be implemented).
    public boolean isValidUsername(String username) {
        // TODO Auto-generated method stub
        return false;
    }
}
