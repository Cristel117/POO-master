public class MainPersona {
    public static void main(String[] args){
        Persona p1=new Persona();// creación de la instancia
        //configuración del abojeto(atributos)
        p1.nombre="Leonardo";
        p1.genero="maculino";
        p1.estatura=1.72;
        p1.peso=57;
        p1.edad=18;
        //metodos
        System.out.println(p1.obtenerDatos());
        Persona p2=new Persona();
        p2.nombre="Emiliano";
        p2.genero="masculino";
        p2.estatura=1.61;
        p2.edad=18;
        p2.peso=42.0;

        String res=p2.obtenerDatos();
        System.out.println(res);
        System.out.println(p1.calcularImc_imc());
        System.out.println(p2.calcularImc_imc());
    }
}
