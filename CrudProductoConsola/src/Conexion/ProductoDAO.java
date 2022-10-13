package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();

    public void listar() {

        String sql = "select * from producto";
        try {
            //Inicializa la base de datos
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("");
                System.out.println("******************************");
                System.out.println("Codigo: " + rs.getInt(1));
                System.out.println("Nombre: " + rs.getString(2));
                System.out.println("Cantidad: " + rs.getInt(3));
                System.out.println("Lugar de Fabricacion: " + rs.getString(4));
                System.out.println("Fecha de ingreso: " + rs.getString(5));

            }
        } catch (SQLException e) {
        }
    }

    public void crear(int codigo, String nombre, int cantidad, String lugar, String ingreso) {

        String sql = "insert into producto (codigo,nombre,cantidad,lugar_de_fabricacion,fecha_de_ingreso) values (?,?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, cantidad);
            ps.setString(4, lugar);
            ps.setString(5, ingreso);
            ps.executeUpdate();

        } catch (SQLException e) {
        }
    }

    public void modificar(int codigo, String nombre, int cantidad, String lugar, String ingreso) {
        String sql = "update producto set nombre=?,cantidad=?,lugar_de_fabricacion=?,fecha_de_ingreso=? where codigo = ?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setInt(2, cantidad);
            ps.setString(3, lugar);
            ps.setString(4, ingreso);
            ps.setInt(5, codigo);
            ps.executeUpdate();

        } catch (SQLException e) {
        }
    }

    public void eliminar(int codigo) {
        String sql = "delete from producto where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

}
