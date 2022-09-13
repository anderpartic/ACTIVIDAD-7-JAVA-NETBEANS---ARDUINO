package ec.edu.intsuperior.modelo;

import ec.edu.intsuperior.controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class consultasCliente extends Conexion {

    public boolean registrar(cliente cli) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO clientes (cliCedula, cliNombreCompleto, cliTelefono, cliDireccion, cliEmail) VALUES (?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getCed());
            ps.setString(2, cli.getNom());
            ps.setString(3, cli.getTel());
            ps.setString(4, cli.getDir());
            ps.setString(5, cli.getEmail());
            ps.execute();
            return true;
        } catch (SQLException e) {

            System.err.println(e);
            return false;

        } finally {
            try {
                con.close();

            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }

    public boolean modificar(cliente cli) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE clientes SET cliCedula=?, cliNombreCompleto=?, cliTelefono=?, cliDireccion=?, cliEmail=? WHERE idClientes=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getCed());
            ps.setString(2, cli.getNom());
            ps.setString(3, cli.getTel());
            ps.setString(4, cli.getDir());
            ps.setString(5, cli.getEmail());
            ps.setInt(6, cli.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {

            System.err.println(e);
            return false;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }

    public boolean eliminar(cliente cli) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM clientes WHERE idClientes=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cli.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {

            System.err.println(e);
            return false;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }

    public boolean buscar(cliente cli) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM clientes WHERE cliCedula=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getCed());
            rs = ps.executeQuery();

            if (rs.next()) {
                cli.setId(Integer.parseInt(rs.getString("idClientes")));
                cli.setCed(rs.getString("cliCedula"));
                cli.setNom(rs.getString("cliNombreCompleto"));
                cli.setTel(rs.getString("cliTelefono"));
                cli.setDir(rs.getString("cliDireccion"));
                cli.setEmail(rs.getString("cliEmail"));

                return true;
            }

            return false;
        } catch (SQLException e) {

            System.err.println(e);
            return false;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }
}
