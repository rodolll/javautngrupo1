package Clases;

public class Especialidades {
    private  int id_especialidades;
    private  String nombre;
    private  String descripcion;

    public Especialidades(int id_especialidades, String nombre, String descripcion) {
        this.id_especialidades = id_especialidades;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId_especialidades() {
        return id_especialidades;
    }

    public void setId_especialidades(int id_especialidades) {
        this.id_especialidades = id_especialidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Especialidades{ " +
                "id_especialidades= " + id_especialidades +
                ", nombre= '" + nombre + '\'' +
                ", descripcion= '" + descripcion + '\'' +
                '}';
    }
}
