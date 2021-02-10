package ushtrime;

import java.util.Scanner;

public class ushtrime_6 {
    public static void main(String[] args) {
        System.out.println("Vendoseni nje numer");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num%2 == 0){
            if (num >=50 && num <=250){
                System.out.println("numri " + num + " eshte tek dhe ka vleren ne mes 50 dhe 250");
            }else{
                System.out.println("numri " + num + " eshte tek por nuk e ka vleren ne mes 50 dhe 250");
            }
        }
        else {
            if (num >=50 && num <=250){
                System.out.println("numri " + num + " nuk eshte tek dhe ka vleren ne mes 50 dhe 250");
            }else{
                System.out.println("numri " + num + " nuk eshte tek dhe nuk e ka vleren ne mes 50 dhe 250");
            }
        }
    }
}
