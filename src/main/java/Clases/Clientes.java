package Clases;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    private int id_clientes;
    private String cuit;
    private String razonSocial;
    private String emaill;

    public Clientes(int id_clientes, String cuit, String razonSocial, String emaill) {
        this.id_clientes = id_clientes;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.emaill = emaill;
    }


    public int getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    @Override
    public String toString() {
        return "Clientes{ " +
                "id_clientes= '" + id_clientes + '\'' +
                ", cuit= '" + cuit + '\'' +
                ", razonSocial= '" + razonSocial + '\'' +
                ", emaill= '" + emaill + '\'' +
                '}';
    }

    public static List<Clientes> crearListaClientes() {
        List<Clientes> listaClientes = new ArrayList<>();

        // 3 Clientes de ejemplo
        Clientes cliente1 = new Clientes(1, "2123456789", "Cliente 1", "cliente1@google.com");
        Clientes cliente2 = new Clientes(2, "6987654321", "Cliente 2", "cliente2@google.com");
        Clientes cliente3 = new Clientes(3, "2456789123", "Cliente 3", "cliente3@google.com");

        // Agregar clientes
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        return listaClientes;
    }
}
