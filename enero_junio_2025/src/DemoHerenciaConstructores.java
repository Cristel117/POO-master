public class DemoHerenciaConstructores {
    public static void main(String[] args) {
        Elefante dumbo= new Elefante("Mamifero", "Elephantidae", "Asiatica", 150.02);
        System.out.println(dumbo);
        Animal animal=new Animal("Canis lupus", "Mamifero");
        System.out.println(animal);
    }
}
class Animal{
    private String especie;
    private String tipo_nacimiento;


    public Animal(){}

    public Animal(String tipo_nacimiento, String especie) {
        this.setTipo_nacimiento(tipo_nacimiento);
        this.setEspecie(especie);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo_nacimiento() {
        return tipo_nacimiento;
    }

    public void setTipo_nacimiento(String tipo_nacimiento) {
        this.tipo_nacimiento = tipo_nacimiento;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + getEspecie() + '\'' +
                ", tipo_nacimiento='" + getTipo_nacimiento() + '\'' +
                '}';
    }
}

class Elefante extends Animal{
    private String raza;
    private double peso;

    public Elefante(){}

    public Elefante(String tipo_nacimiento, String especie, String raza, double peso) {
        super(tipo_nacimiento, especie);
        this.setPeso(peso);
        this.setRaza(raza);
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "especie= " + super.getEspecie() +
                "tipo_nacimiento= " + super.getTipo_nacimiento() +
                "peso=" + peso +
                ", raza='" + raza + '\'' +
                '}';
    }
}