package domaci15;
//5.	Napisati program koji sabira parne prirodne brojeve do 100.
public class Zadatak5 {

    public static void main(String[] args) {
        int sum = 0 ;
        for (int i = 0 ; i < 100 ; i++){
            if (i%2==0){
                sum += i ;
                System.out.println(sum);
            }
        }
    }
}
