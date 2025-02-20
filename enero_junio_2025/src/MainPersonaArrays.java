import java.util.ArrayList;
import java.util.Scanner;
public class MainPersonaArrays {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        ArrayList<String> lista = new ArrayList();
        String frase=" ";
        System.out.println("Escribe aquí para salir");
        while(true){
            System.out.println("Dame una frase: ");
            frase=teclado.nextLine();
            if(frase.equals("quit"))
                break;
            lista.add(frase);
        }
        for (String s: lista){
            System.out.println(s);
        }
    }
}
