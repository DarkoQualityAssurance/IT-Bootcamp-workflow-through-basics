package domaci15;

import java.util.Scanner;

//1.	Napisati program za odredjivanje apsolutne vrednosti broja koji unesete sa tastature.
public class Zadatak1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Uneti broj : ");
        int broj = input.nextInt();
        int apsolutNumber = Math.abs(broj);
        System.out.println("Rezultat nakon upotrebe funkcije : " + apsolutNumber);
    }
}
