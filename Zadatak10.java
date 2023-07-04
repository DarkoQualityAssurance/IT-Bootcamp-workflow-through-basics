package domaci15;

import java.util.Scanner;

//10.	Napisati program koji ce nakon unosa sa tastature da ispisuje 3 puta u 3 reda IME sa razmakom.
public class Zadatak10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Uneti ime : ");
        String ime = input.nextLine();

        System.out.println(ime + " " + ime + " " + ime );
        System.out.println(ime + " " + ime + " " + ime );
        System.out.println(ime + " " + ime + " " + ime );
    }
}
