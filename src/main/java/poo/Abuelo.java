package poo;

public class Abuelo {

    private String nombre;
    private String genero;
    private short edad;
    private String lugarResidencia;

    public Abuelo() {
    }

    public Abuelo(String nombre, String genero, short edad, String lugarResidencia) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.lugarResidencia = lugarResidencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    @Override
    public String toString() {
        return "Abuelo{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                ", lugarResidencia='" + lugarResidencia + '\'' +
                '}';
    }

    public void devuelvaInformacion(){
        System.out.println("Soy el abuelo y estoy leyendo periodico");
    }

}
