public class MainAsignatura {;
    public static void main (String[] args){
        Asignatura poo=new Asignatura();
        poo.setNombre("Programación Orientada a Objetos");
        poo.setClave("AED-1286");
        poo.setCreditos(5);
        poo.setTeoricas(2);
        poo.setPracticas(3);

        //imprimir datos del objeto

        System.out.println(poo);




    }
}
