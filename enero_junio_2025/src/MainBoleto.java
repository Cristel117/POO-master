public class MainBoleto {
    public static void main(String[] args) {
        Boleto b1=new Boleto();
        Boleto b2=new Boleto();

        b1.setAsiento("F9");
        b1.setFecha("15/02/2025");
        b1.setPrecio(150.00);
        b2.setAsiento("b3");
        b2.setFecha("20/02/2025");
        b2.setPrecio(90.00);
        System.out.println(b1);
        System.out.println(b2);

    }

    }
