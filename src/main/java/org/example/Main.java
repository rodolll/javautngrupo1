package org.example;

import Clases.Clientes;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


// Grupo 1 - Comision 120 - Entrega 1
// Integrantes:
//      Fabiana Zamboni
//      Daniel Luffi
//      Rodolfo Pusula
//      José González
//
public class Main {
    private  static List<Clientes> listaClientes;

    public static void main(String[] args) {

        listaClientes = Clientes.crearListaClientes();


        System.out.println("TP - Reporte de Incidentes");

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("  Menú de ABM de Clientes");
            System.out.println("---------------------------");
            System.out.println("  1. Alta de Cliente");
            System.out.println("  2. Modificación de Cliente");
            System.out.println("  3. Eliminación de Cliente");
            System.out.println("  4. Mostrar lista de Clientes");
            System.out.println("  0. Salir");
            System.out.print("         Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Eligió Salir del programa . . .");
                    break;
                case 1:
                    // Alta de cliente
                    altaCliente();
                    break;
                case 2:
                    // Modificación de cliente
                    modificarCliente();
                    break;
                case 3:
                    // Eliminación de cliente
                    eliminarCliente();
                    break;
                case 4:
                    // Eliminación de cliente
                    mostrarClientes();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);
    }

    private static void altaCliente() {
        System.out.println();
        System.out.println("Alta de Cliente");

        Scanner scanner = new Scanner(System.in);

        // Atributos: id_clientes, String cuit, String razonSocial, String emaill
        System.out.println("Ingrese el CUIT del cliente:");
        String cuit = scanner.nextLine();

        System.out.println("Ingrese Razon Social del cliente:");
        String razonSoc = scanner.nextLine();

        System.out.println("Ingrese el email del cliente:");
        String email = scanner.nextLine();
        int max = 0;
        for (Clientes c : listaClientes){
            if (c.getId_clientes()>max){
                max = c.getId_clientes();
            }
        }
        max++;
        Clientes nuevoCliente = new Clientes(max, cuit, razonSoc, email);
        listaClientes.add(nuevoCliente);

        System.out.println("Cliente agregado exitosamente.");
    }

    private static void modificarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Modificacion de Cliente");

        // Atributos: id_clientes, String cuit, String razonSocial, String emaill
        System.out.println("Ingrese el CUIT del cliente a modificar:");
        String cuit = scanner.nextLine();

        System.out.println("Ingrese Razon Social del cliente a modificar:");
        String razonSoc = scanner.nextLine();

        System.out.println("Ingrese el email del cliente a modificar:");
        String email = scanner.nextLine();

        boolean encontrado = false;

        for (Clientes cl : listaClientes){
            if (cl.getCuit().equals(cuit)){
                cl.setRazonSocial(razonSoc);
                cl.setEmaill(email);
                encontrado=true;
                break;
            }
        }
        if (encontrado){
            System.out.println("Cliente modificado correctamente . . .");
        }
        else {
            System.out.println("Cliente no encontrado . . .");
        }
    }

    private static void eliminarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Eliminar Cliente");

        System.out.println("Ingrese el CUIT del cliente que desea eliminar:");
        String cuit = scanner.nextLine();

        // con Iterator se hace una eliminacion segura y
        // actualiza directamente listaClientes
        Iterator<Clientes> iterator = listaClientes.iterator();
        while (iterator.hasNext()) {
            Clientes cliente = iterator.next();
            if (cliente.getCuit().equals(cuit)) {
                // Eliminar el cliente con el metodo remove()
                iterator.remove();
                break; // romper el recorrido
            }
        }
    }

    private static void mostrarClientes() {
        System.out.println();
        System.out.println("  Listado de Clientes");
        System.out.println("----------------------- ");
        for (Clientes cl : listaClientes){
            System.out.println(cl.toString());
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nOprima la tecla <Intro> / <Enter> para continuar . . . ");
        scanner.nextLine();
    }
}