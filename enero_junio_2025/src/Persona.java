public class Persona {
    String nombre;
    int edad;
    double estatura;
    double peso;
    String genero;

    double calcularImc_imc(){
        return peso/(estatura*estatura);
    }
    String obtenerDatos(){
        String cad=" ";
        cad=cad+"Persona{nombre: " + nombre+"; ";
        cad=cad+"Edad: "+edad+"; ";
        cad=cad+"Estatura: "+estatura+"; ";
        cad=cad+"Peso: "+peso+"; ";
        cad=cad+"Género: "+genero+"; ";

        return cad;
    }
}
