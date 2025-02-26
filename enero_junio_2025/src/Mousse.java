public class Mousse {
    private String marca;
    private String modelo;
    private double precio;
    //private es un modificador de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public Mousse(String marca){
        this.marca=marca;
    }
    public Mousse(String modelo, double precio){
        this.modelo=modelo;
        this.precio=precio;
    }
    public Mousse(double precio, String marca){
        this.precio=precio;
        this.marca=marca;
    }
    public Mousse(double precio){
        this.precio=precio;
    }

    @Override
    public String toString() {
        return "Mousse{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
