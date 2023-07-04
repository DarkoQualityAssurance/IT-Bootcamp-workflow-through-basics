package domaci15;

import java.util.Scanner;

//19.	Napisati metod za nalaženje minimuma od dva učitana broja (a, b) sa tastature.
// Izvršiti dodeljivanje vrednosti metoda varijabli c.
public class Zadatak19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Uneti broj : ");
        int a = input.nextInt();
        System.out.println("Uneti broj : ");
        int b = input.nextInt();
        int result = minimumDvaBroja(a,b);
        System.out.println("Uneti broj " + result + " je manji od drugog unetog broja ");

    }

        public static int minimumDvaBroja(int a , int b ){
        int c = Math.min(a,b) ;
     return c;
    }
}
