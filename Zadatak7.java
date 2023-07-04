package domaci15;

import java.util.Scanner;

//7.	Napisati program koji ce da nađe proizvod prirodnih brojeva unetih sa tastature od a do b djeljivih sa 5 i koliko ih ima.
public class Zadatak7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Uneti prvi broj : ");
        int a = input.nextInt();
        System.out.println("Uneti drugi broj : ");
        int b = input.nextInt();
        int count = 0 ;
        int sum = 1 ;

        if (a<b){
        for (int i = a ; i <= b ; i++ ){
            if (i%5==0){
                sum *= i ;
                count ++;
            }
        }

    }else {for (int i = b ; i <= a ; i++ ){
            if (i%5==0){
                sum *= i ;
                count ++;
            }
        }

        }
        System.out.println(sum + " " + count);
}

}
