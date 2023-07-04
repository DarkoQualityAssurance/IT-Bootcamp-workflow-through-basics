package domaci15;

import java.util.Scanner;

// 8.	Napisati program koji ce izračunati aritmetičku sredinu parnih brojeva unetih sa tastature od k do n.
public class Zadatak8 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Uneti prvi broj :");
        int k = input.nextInt();
        System.out.println("Uneti drugi broj : ");
        int n = input.nextInt();

        int sum = 0;
        int count = 0;
        if (k < n) {
            for (int i = k; i <= n; i++) {

                if (i % 2 == 0) {
                   sum += i ;
                    count++;

                }

            }
            System.out.println("Aritmeticka sredina parnih brojeva je :  " + (double)sum/count );
        } else if (k>n) {
            for (int i = k; i >= n; i--){
                sum += i ;
                count++;
            }
            System.out.println("Aritmeticka sredina parnih brojeva je :  " + (double)sum/count );
        }

    }

}



