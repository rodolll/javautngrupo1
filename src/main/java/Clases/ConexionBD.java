package Clases;
import java.sql.*;
import java.util.Scanner;

public class ConexionBD {
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/db_mesadeayuda";
    private String username;
    private String password;

    public ConexionBD() {
        solicitarCredenciales();
    }

    private void solicitarCredenciales() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre de usuario: ");
        username = scanner.nextLine();

        System.out.print("Ingrese contraseña: ");
        password = scanner.nextLine();
    }

    public void abrirConexion() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexión establecida correctamente");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cerrarConexion() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexión cerrada correctamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarCliente(Clientes cliente) {
        try {
            System.out.println("Conexión cerrada correctamente");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

//    public List<> obtenerTabla(String sql){
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
