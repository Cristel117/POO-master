public class MainComputadora {
    public static void main(String[] args){
        Computadora c1 = new Computadora();
        Computadora c2 = new Computadora();

        c1.setProcesador("intel i5");
        c1.setAlmacenamiento(512);
        c1.setRam(16);

        c2.setProcesador("ryzen 7");
        c2.setAlmacenamiento(512);
        c2.setRam(32);

        System.out.println(c1);
        System.out.println(c2);
    }
}
