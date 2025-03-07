import java.util.ArrayList;

class Vehiculo {
    String marca;
    String modelo;
    String anio;
    String motor;
    String nm_ruedas;
    String tipo_combustible;
    String matricula;
    String cilindrada;
}
class Motociclecta extends Vehiculo{
    String cc;

}

class Coche extends Vehiculo{
    int num_puertas;
}
public class Algo {
    public static void main(String[] args) {
        ArrayList<Vehiculo> motos =new ArrayList<>();
        Motociclecta motito= new Motociclecta();
        Coche carrito=new Coche();
        motos.add(motito);
        motos.add(carrito);


    }
}