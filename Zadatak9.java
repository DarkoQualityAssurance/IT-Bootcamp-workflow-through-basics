package domaci15;

import java.util.Scanner;

//9.	Napisati program koji ce učitati sa tastature visine za n osoba. Ispisati prosečnu i najveću visinu.
public class Zadatak9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        double maxVisina = 0;


            while (true) {

                System.out.println("Unesite vasu visinu u suprotnom unesite broj 0 za gasenje programa : ");

                double visina = input.nextDouble();
                if (visina == 0) {
                    System.out.println("Program se gasi!");break;
                }
                if (visina > maxVisina) {
                    maxVisina = visina;
                }
                sum += visina;
                count++;
                System.out.println("Prosecna visina je : " + sum / count + " a maksimalna visina je :  " + maxVisina);

            }
        }
    }

