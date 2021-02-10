package ushtrime;

import java.util.Scanner;

public class ushtrime_7 {
    public static void main(String[] args) {
        String fjalia;

        Scanner input = new Scanner(System.in);
        System.out.println("Shkruani nje fjali: ");
        fjalia = input.nextLine();

        char first_char = fjalia.charAt(0);
        String last_char = fjalia.substring(fjalia.length()-1);


        if (Character.isUpperCase(first_char)){
            if (last_char.matches("\\d+")) {
                System.out.println("fjalia fillon me shkronje te madhe dhe perfundon me numer");
            }
            else{
                System.out.println("fjalia fillon me shkronje te madhe per nuk perfundon me numer");
            }
        }
        else{
            if (last_char.matches("\\d+")) {
                System.out.println("fjalia nuk fillon me shkronje te madhe por perfundon me numer");
            }
            else{
                System.out.println("fjalia nuk fillon me shkronje te madhe dhe nuk perfundon me numer");
            }

        }

    }
}
