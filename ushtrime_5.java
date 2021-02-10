package ushtrime;

import java.util.Scanner;

public class ushtrime_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fjalia;
        System.out.println("Shkruani nje fjali: ");
        fjalia = input.nextLine();
        fjalia = fjalia.replaceAll(" ","");

        int num = fjalia.length();
        //Te gjejme se a ka numer cift apo tek te karaktereve
        if (num%2 == 0){
            System.out.println("Ka numer cift te karaktereve");
        }else{
            System.out.println("Ka numer tek te karaktereve");
        }
        //Te gjejme se a egziston fjala ata ne fjali
        if (fjalia.toLowerCase().contains("ata")){
            System.out.println("e permban fjalen ata");
        }else{
            System.out.println("Nuk e permban fjalen ata");
        }
        //te gjejme se a perfundon fjalia me Java
        //if (fjalia.endsWith("Java")) ose
        if (fjalia.substring(fjalia.length()-4).equals("Java")){
            System.out.println("Perfundon me Java");
        }
        else{
            System.out.println("Nuk perfundon me Java");
        }
    }
}
