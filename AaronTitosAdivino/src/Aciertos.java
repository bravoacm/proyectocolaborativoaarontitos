//Corregido por Adrian Bravo
import java.util.Scanner;

public class Aciertos {

    public static void main(String[] args) {
        int n = 0,cont = 0;
        /*Esta instrucci�n no incluye ni al 10 ni al 50.
         * 
         * int x = (int) (Math.random()*(10-50+1)+50);
         * 
         * A�ado a continuaci�n la correci�n*/ 
        int x = (int) (Math.random()*(10-50)+50);
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
