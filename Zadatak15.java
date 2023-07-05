package domaci15;

import java.util.Scanner;

//15.	Napisati program koji ce učitati elemente niza i ispisati elemente niza sa neparnim indeksom.
public class Zadatak15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite brojeve :");
        int[] niz = new int[] {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        for (int i = 0 ; i < niz.length ; i++ ){
            if(i % 2 != 0 ){
                System.out.println("Elementi sa naparnim indexom su : " + niz[i]);
            }
        }



    }


    }

