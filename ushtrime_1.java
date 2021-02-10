package ushtrime;

import java.util.Scanner;

public class ushtrime_1 {
    public static void main(String[] args) {
        double a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosini 2 numra decimal");
        System.out.print("Numri i pare: ");
        a = input.nextDouble();
        System.out.print("Numri i dyte: ");
        b = input.nextDouble();

        System.out.println("Prodhimi i " + a + " dhe " + b + " eshte " + (a*b));
        System.out.println("Prodhimi i numrave te rrumbullaksuar " + Math.round(a) + " dhe " + Math.round(b) + " eshte " + (Math.round(a) * Math.round(b)));
    }
}
