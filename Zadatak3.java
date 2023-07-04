package domaci15;

import java.util.Scanner;

//3.	Napisati program za ispis uspeha za uneti broj sa tastature, prema sledećoj tabeli:
public class Zadatak3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Uneti ocenu : ");
        int ocena = input.nextInt();

        switch (ocena){
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlo dobar");
                break;
            case 5:
                System.out.println("Odlican");
                break;
            default:
                System.out.println("Unet je pogresan unos !");
        }
    }
}
