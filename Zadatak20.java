package domaci15;
//20.	Kreirati metodu koja računa prizvod dva broja, vraća rezultat u main, duplira i ispisuje.
public class Zadatak20 {

    public static void main(String[] args) {

        int a = 8;
        int b = 10;
        int result = proizvodDvaBroja(a,b);
        System.out.println(proizvodDvaBroja(a,b) * 2);
    }

    public static int proizvodDvaBroja(int a , int b){
        int c = a*b;
        return c;
    }
}
