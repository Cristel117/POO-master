public class Profesional {
    private String cedula;
    private String nombre;
    private int antiguedad;
    private String carrera;


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", antiguedad=" + antiguedad +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
