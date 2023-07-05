package domaci15;

import java.util.Scanner;

//16.	Napisati program koji ce učitati elemente niza i ispisati elemente niza u obrnutom redosledu.
public class Zadatak16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] niz = new int[6];

        for(int i = 0 ; i < niz.length ; i++){
            System.out.println("Uneti brojeve : ");
            niz[i] = input.nextInt();
        }

        for (int i = niz.length-1;i>=0;i--){
            System.out.println("Elementi niza u obrnutom redosledu : " + niz[i]);
        }

    }
}
