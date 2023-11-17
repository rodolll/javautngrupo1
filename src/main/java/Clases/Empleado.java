package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;

public class Empleado {
    // Crear una clase empleado,
    // que es quien recibe el llamado del cliente, y consulta toda la info en el sistema para asignar el técnico,
    // cargar el incidente y luego enviar las notificaciones.

    // Nota: deberia chequear si el cliente que está llamando existe o no (para desviar a la carga del cliente)

    private List<Clientes> listaClientes;
    public Empleado() {
        // Cargar datos de ejemplo para no tener la lista vacia
        listaClientes = crearListaClientes();;
    }

    // Método para buscar un cliente por cuit
    private static Clientes buscarClientePorCuit(List<Clientes> listaClientes, String cuitABuscado) {
        for (Clientes cliente : listaClientes) {
            if (cliente.getCuit().equals(cuitABuscado)) {
                return cliente;
            }
        }
        // Si no se encuentra el cliente retornar nulo
        return null;
    }

    // Crear lista de clientes
    private static List<Clientes> crearListaClientes() {
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

//    private static List<Clientes> cargarClientes(){
//        List<Clientes> listaClientes = new ArrayList<>();
//        // ... obtener de la bbdd
//
//        // Conexión a la bbdd,
//        // despues mover el logueo a Clase ConexionBD
//        String url = "jdbc:mysql://localhost:3306/mesa_ayudabd";
//        String usr = "root";
//        String pass = "";
//
//        // Consulta SQL para obtener los datos de la tabla 'clientes'
//        String sql = "SELECT id_clientes, cuit, razon_social, email FROM clientes;";
//
//        try {
//            // Establecer la conexión a la base de datos
//            Connection conexion = DriverManager.getConnection(url, usr, pass);
//
//            // Crear un objeto Statement para ejecutar la consulta SQL
//            Statement statement = conexion.createStatement();
//
//            // Ejecutar la consulta SQL y obtener los resultados
//            ResultSet rs = statement.executeQuery(sql);
//
//            // Recorrer los resultados y crear objetos Clientes
//            while (rs.next()) {
//                int id = rs.getInt("id_clientes");
//                String cuit = rs.getString("cuit");
//                String razonSocial = rs.getString("razon_social");
//                String email = rs.getString("email");
//
//                Clientes cliente = new Clientes(id, cuit, razonSocial, email);
//                listaClientes.add(cliente);
//            }
//
//            // Cerrar los recursos
//            rs.close();
//            statement.close();
//            conexion.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return listaClientes;
//    }

}
