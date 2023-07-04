package domaci15;

import java.util.Scanner;

//15.	Napisati program koji ce učitati elemente niza i ispisati elemente niza sa neparnim indeksom.
public class Zadatak15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite brojeve :");
        int[] niz = new int[] {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
//na ovaj nacin unosimo iz Scannera podatke u niz kada ih ima vise
        for (int i = 0 ; i < niz.length ; i++ ){
            if(i % 2 != 0 ){//index svakog elementa u nizu delimo sa 2 da vidimo da li je neparan
                System.out.println("Elementi sa naparnim indexom su : " + niz[i]);
            }
        }



    }


    }

