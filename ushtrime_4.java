package ushtrime;

import java.util.Scanner;

public class ushtrime_4 {
    public static void main(String[] args) {
        final String username = "milot";
        final String password = "Milot22";

        String user_username,user_password;

        Scanner input = new Scanner(System.in);

        System.out.print("Vendoseni Username:");
        user_username = input.next();
        System.out.print("Vendoseni Password:");
        user_password = input.next();

        user_username = user_username.toLowerCase();

        if (username.equals(user_username)){
            if (password.equals(user_password)){
                System.out.println("Fjal kalimi eshte i sakte");
            }
            else{
                System.out.println("Password eshte i pasakte");
            }
        }
        else {
            if (password.equals(user_password)){
                System.out.println("Username eshte i pasakte");
            }
            else{
                System.out.println("Username dhe password jane te pa sakte");
            }
        }
    }
}
