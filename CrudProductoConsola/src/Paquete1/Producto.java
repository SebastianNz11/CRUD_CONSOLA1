package Paquete1;

import Conexion.ProductoDAO;
import java.io.IOException;
import java.util.Scanner;

public class Producto {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner en = new Scanner(System.in);
        ProductoDAO pr = new ProductoDAO();

        int var;
        int cod, cantidad;
        String nombre, lugar, fecha;

        do {
            System.out.println("BIENVENIDO AL SISTEMA DE MANEJO DE PRODUCTOS");
            System.out.println("1. - LISTAR PRODUCTOS");
            System.out.println("2. - CREAR PRODUCTO");
            System.out.println("3. - MODIFICAR PRODUCTO");
            System.out.println("4. - ELIMINAR PRODUCTO");
            System.out.println("SELECCIONE SU OPERACION");
            var = en.nextInt();
            switch (var) {
                case 1:
                    System.out.println("LISTA DE PRODUCTOS");
                    pr.listar();
                    System.out.println("");
                    System.out.println("");
                    break;

                case 2:

                    System.out.println("INGRESE NUEVO PRODUCTO");
                    System.out.println("");
                    System.out.println("INGRESE CODIGO");
                    cod = en.nextInt();
                    en.nextLine();
                    System.out.println("INGRESE NOMBRE");
                    nombre = en.nextLine();
                    System.out.println("INGRESE CANTIDAD");
                    cantidad = en.nextInt();
                    en.nextLine();
                    System.out.println("INGRESE LUGAR DE FABRICACION");
                    lugar = en.nextLine();
                    System.out.println("INGRESE FECHA DE INGRESO");
                    fecha = en.nextLine();
                    pr.crear(cod, nombre, cantidad, lugar, fecha);
                    break;

                case 3:

                    System.out.println("MODIFICAR PRODUCTO");
                    System.out.println("");
                    System.out.println("INGRESE CODIGO");
                    cod = en.nextInt();
                    en.nextLine();
                    System.out.println("INGRESE NOMBRE");
                    nombre = en.nextLine();
                    System.out.println("INGRESE CANTIDAD");
                    cantidad = en.nextInt();
                    en.nextLine();
                    System.out.println("INGRESE LUGAR DE FABRICACION");
                    lugar = en.nextLine();
                    System.out.println("INGRESE FECHA DE INGRESO");
                    fecha = en.nextLine();
                    pr.modificar(cod, nombre, cantidad, lugar, fecha);
                    break;

                case 4:
                    System.out.println("ELIMINAR PRODUCTO");
                    System.out.println("");
                    System.out.println("INGRESE CODIGO DE PRODUCTO A ELIMINAR");
                    cod = en.nextInt();
                    pr.eliminar(cod);
                    break;

                case 5:
                    System.out.println("SALIENDO...");
                    break;

                default:
                    System.out.println("OPCION INVALIDA!");
                    System.out.println("");
            }

        } while (var != 5);

    }

}
