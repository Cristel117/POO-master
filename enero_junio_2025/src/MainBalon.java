public class MainBalon {
    public static void main(String[] args) {
        Balon b1=new Balon();
        Balon b2=new Balon();
        b1.setTamanio("50cm");
        b1.setMaterial("caucho");
        b1.setPeso(250);

        b1.setTamanio("45cm");
        b1.setMaterial("cuero");
        b1.setPeso(300);

        System.out.println(b1);
        System.out.println(b2);

    }

    }
