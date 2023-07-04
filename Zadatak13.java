package domaci15;

import java.util.Scanner;

//13.	Napisati program za ispis kvadrata prirodnih brojeva do n unetih sa tastature (while petlja).
public class Zadatak13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a = 1;
        double b = 1;
        double kvadratBrojeva = 0 ;
        while(a>0 && b >0){
            System.out.println("Uneti prvi broj : ");
            a = input.nextDouble();
            System.out.println("Uneti drugi broj : ");
            b = input.nextDouble();
            if((int) a==0 ||(int) b==0)
            {
                System.out.println("Program se gasi !");break;
            }
            kvadratBrojeva = Math.pow(a,b);
            System.out.println("Kvadrat dva uneta broja je : " + kvadratBrojeva);
        }

    }
}
