package domaci15;
//18.	Metod povrsina računa i vraća u main povrsinu pravougaonika (a*b).
// Main poziva metod povrsina(a,b) i ispisuje površine pravougaonika. Pozvati 3 puta metod sa razlicitim vrednostima.
public class Zadatak18 {

    public static void main(String[] args) {

        int result = povrsina(3,7);
        System.out.println("Povrsina pravougla je " + result);
        result = povrsina(5,8);
        System.out.println("Povrsina pravougla je " + result);
        result = povrsina(2,6);
        System.out.println("Povrsina pravougla je " + result);
    }

        public static int povrsina(int a,int b){
            return a*b;
        }

    }


