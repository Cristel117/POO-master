import java.util.Arrays;

public class MainDemoConstructor {
    public static void main(String[] args){
        //aqui se esta invocando al constructor
        DemoConstuctor obj=new DemoConstuctor();
        System.out.println(obj.atributo1);
        obj.atributo1="nuevo valor";
        DemoConstuctor obj2=new DemoConstuctor("Este es mi valor");
        System.out.println(obj2.atributo1);

        DemoConstuctor obj3=new DemoConstuctor("Valor String",20.5);
        //Demo contstructor de double String

    }
}
