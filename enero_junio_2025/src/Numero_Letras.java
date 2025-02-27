import java.text.DecimalFormat;
import java.util.Scanner;

public class Numero_Letras {
    public static void main(String[] args) {
        int n;
        System.out.println("Ingresa un numero del 0 al 9999");
        Scanner numero = new Scanner(System.in);
        n = numero.nextInt();
        switch (n){
            case 1:
                System.out.println("cero");
                break;
            case 2:
                System.out.println("uno");
                break;
        }
    }
}
