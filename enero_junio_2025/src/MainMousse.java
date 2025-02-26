public class MainMousse {
    public static void main(String[] args){
        Mousse m1=new Mousse("Hp"); //instanciamiento
        Mousse m2=new Mousse(250.00);
        Mousse m3=new Mousse(345.80, "Logitech");
        Mousse m4=new Mousse("8952B", 352.5);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        m4.setMarca("Dell");
        System.out.println(m4);//objeto
    }
}
