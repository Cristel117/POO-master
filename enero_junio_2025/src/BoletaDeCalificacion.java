
public class BoletaDeCalificacion {
    String nombre;
    int semestre;
    double cm1;
    double cm2;
    double cm3;
    double cm4;
    double cm5;
    double cm6;
    double cm7;
    double promedio;
    int ndc;
    double promedioSemestre(){
        return promedio=(cm1+cm2+cm3+cm4+cm5+cm6+cm7)/7;
    }
    String obtenerDatos(){
            String cad=" ";
            cad=cad+"Alumno: " + nombre+"; ";
            cad=cad+"Semestre: "+semestre+"; ";
            cad=cad+"No de control: "+ndc+";";

        return cad;
    }
}
