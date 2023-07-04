package domaci15;

import java.util.Scanner;

//2.	Napisati program koji od dva učitana broja (a, b) sa tastature nalazi veći.
public class Zadatak2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Uneti broj 1 : ");
        int a = input.nextInt();
        System.out.println("Uneti broj 2 : ");
        int b = input.nextInt();

        if (a>b){
            System.out.println("Uneti broj : " + a + " je veci od broja : " + b );
        }else {
            System.out.println("Uneti broj : " + b + " je veci od broja : " + a );
        }
        System.out.println("");
    }
}
