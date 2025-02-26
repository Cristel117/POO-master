public class Pizza {
    private String especialidad;
    private double precio;
    private String tamanio;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    public Pizza(String especialidad, String tamanio, double precio){
        this.especialidad=especialidad;
        this.tamanio=tamanio;
        this.precio=precio;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "especialidad='" + especialidad + '\'' +
                ", precio=" + precio +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
}
