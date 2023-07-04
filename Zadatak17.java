package domaci15;

import java.util.Scanner;

//17.	Napisati program koji ce učitati elemente i naći najveći element niza.
public class Zadatak17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Uneti brojeve : ");
        int[] niz = new int[]{input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int element = 0 ;

        for (int i =0 ;i < niz.length ; i ++ ){
            if (niz[i]>element){
                element = niz[i];
            }

        }
        System.out.println("Najveci element u nizu je : " + element);
    }
}


