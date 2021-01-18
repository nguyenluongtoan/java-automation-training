package Array;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) throws IOException {
        String greeting = "Hello";
        String username;
        String password;
        User loggedInUser = null;
        List<User> listOfUsers = new ArrayList<>();

        // Add 3 users to the list
        listOfUsers.add(new User("sonhv1", "123"));
        listOfUsers.add(new User("sonhv2", "456"));
        listOfUsers.add(new User("sonhv3", "789"));

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your username :");
        username = scanner.nextLine();
        System.out.println("Input your password :");
        password = scanner.nextLine();

        // Iterate through list of users to see if we have a match
        for (User user : listOfUsers) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    loggedInUser = user;
                    break;
                }
            }
        }

        // if loggedInUser was changed from null, it was successful
        if (loggedInUser != null) {
            System.out.println("User successfully logged in with account: " + loggedInUser.getUsername());
        } else {
            System.out.println("Invalid username or password");
        }
    }
}










