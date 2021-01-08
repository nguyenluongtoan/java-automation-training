package Array;
import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        String[] username = new String[]{"sonhv1", "sonhv2", "sonhv3"};
        String[] password = new String[]{"123", "456", "789"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input username: ");
        String u = scanner.nextLine();
        System.out.println("Input password: ");
        String p = scanner.nextLine();
        checkLogin(u,p);

    }

    public static boolean checkLogin( String username, String password) {
        boolean check = false;
        String user = "";
        String pass = "";
        for (int i = 0; i < username.length(); i++) {
            for (int j = 0; j < password.length(); j++) {
                if(username.contains(user) && password.contains(pass)) {
                    System.out.println("Welcome");
                }
                    else {
                    System.out.println("Failed! ");

                }

            }
        }
        // check username and password

        return check;
        // function check username and password field
    }


}
