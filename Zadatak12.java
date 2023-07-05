package domaci15;

import java.util.Scanner;

//12.	Napisati program koji ce ispisati parne prirodne brojeve od 1 do 25 unete sa tastature.
// Kada korisnik unese 25 zavrsava se program. (while petlja).
public class Zadatak12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int parniBroj = 0;

        while (true) {
            System.out.println("Uneti broj od 1 do 25 : ");
            int unetiBroj = input.nextInt();
            if (unetiBroj == 25) {
                System.out.println("Program se zavrsava ! ");
                break;
            }
            if (unetiBroj > 0 && unetiBroj < 25) {
                if (unetiBroj % 2 == 0) {
                    parniBroj = unetiBroj;
                    System.out.println("Uneti broj je paran broj : " + parniBroj);
                }

            }
        }
    }
}
