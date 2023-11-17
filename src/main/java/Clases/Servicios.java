package Clases;

public class Servicios {
    private int id_servicios;
    private String tipo;
    private String nombre;

    public Servicios(int id_servicios, String tipo, String nombre) {
        this.id_servicios = id_servicios;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public int getId_servicios() {
        return id_servicios;
    }

    public void setId_servicios(int id_servicios) {
        this.id_servicios = id_servicios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Servicios{ " +
                "id_servicios= '" + id_servicios + '\'' +
                ", tipo= '" + tipo + '\'' +
                ", nombre= '" + nombre + '\'' +
                '}';
    }
}
