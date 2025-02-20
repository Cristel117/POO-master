public class MainProfesional {
    public static void main(String[] args) {
        Profesional p1 = new Profesional();
        Profesional p2 = new Profesional();
        p1.setNombre("Cristel Lara");
        p1.setCarrera("Ingeniería en sistemas computacionales");
        p1.setCedula("SADC8133");
        p1.setAntiguedad(10);

        p2.setNombre("Leonardo García");
        p2.setCarrera("Ingeniería en sistemas computacionales");
        p2.setCedula("415LACDGG");
        p2.setAntiguedad(5);

        System.out.println(p1);
        System.out.println(p2);
         }

    }
