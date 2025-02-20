public class MainBoletaDeCalificacion {
    public static void main(String[] args){
        BoletaDeCalificacion b1=new BoletaDeCalificacion();
        //configuracion del objeto
        b1.semestre=1;
        b1.nombre="Cristel Ismerai Lara García";
        b1.cm1= 89.3;
        b1.cm2= 90.5;
        b1.cm3= 87.5;
        b1.cm4= 98.6;
        b1.cm5= 80.6;
        b1.cm6= 83.5;
        b1.cm7= 100.0;
        b1.ndc=24020265;

        BoletaDeCalificacion b2=new BoletaDeCalificacion();
        b2.semestre=2;
        b2.nombre="Mariana Rojas Vicario";
        b2.cm1= 80.6;
        b2.cm2= 74.6;
        b2.cm3= 85.6;
        b2.cm4= 98.3;
        b2.cm5= 80.6;
        b2.cm6= 83.5;
        b2.cm7= 100.0;
        b2.ndc=24020267;

        BoletaDeCalificacion b3=new BoletaDeCalificacion();
        b3.semestre=3;
        b3.nombre="Leonardo García Ponce";
        b3.cm1= 92.5;
        b3.cm2= 74.6;
        b3.cm3= 91.2;
        b3.cm4= 98.3;
        b3.cm5= 80.6;
        b3.cm6= 82.5;
        b3.cm7= 90.0;
        b3.ndc=24020311;
        System.out.println(b1.obtenerDatos());
        System.out.println(b1.promedioSemestre());
        String res=b2.obtenerDatos();
        System.out.println(res);
        System.out.println(b2.promedioSemestre());
        System.out.println(b3.obtenerDatos());
        System.out.println(b3.promedioSemestre());
    }
}
