package ushtrime;

import java.util.Scanner;

public class ushtrime_2 {
    public static void main(String[] args) {
        int a,b,shuma;
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosini 2 numra te plote pozitiv");
        System.out.print("Numri i pare: ");
        a = input.nextInt();
        System.out.print("Numri i dyte: ");
        b = input.nextInt();

        shuma = a + b;

        if (shuma % 2 == 0){
            System.out.println("Shuma e numrave " + a +" dhe " + b + " eshte numer çift");
        }else{
            System.out.println("Shuma e numrave " + a +" dhe " + b + " eshte numer tek");
        }

    }
}
