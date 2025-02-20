public class Balon {
    private String tamanio;
    private String material;
    private double peso;


    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "tamanio='" + tamanio + '\'' +
                ", material='" + material + '\'' +
                ", peso=" + peso +
                '}';
    }
}
