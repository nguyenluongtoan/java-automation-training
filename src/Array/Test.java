package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String username;
        String password;
        User user = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input username: ");
        username = scanner.nextLine();
        System.out.println("Input password: ");
        password = scanner.nextLine();

        List<User> list = new ArrayList<>(3);
        list.add(new User("son1", "123"));

        for (User u : list) {
            if(u.getUsername().equals(username)) {
                if(u.getPassword().equals(password)) {
                    user = u;
                }
            }
        }

        if(user != null) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

}
