/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bodega;
import model.DetInventario;

/**
 *
 * @author dev
 */
public class DetInventarioDAO {

    public static boolean registrar(DetInventario b) {
        try {
            String SQL = "INSERT INTO detinventarios(ide,codigo,producto,un,cantidad) VALUES (?,?,?,?,?);";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(SQL);
            st.setInt(1, b.getIde());
            st.setString(2, b.getCodigo());
            st.setString(3, b.getProducto());
            st.setString(4, b.getUn());
            st.setDouble(5, b.getCantidad());

            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("error:" + ex.getMessage().toString());
            return false;
        }

    }

    public static boolean actualizar(DetInventario b) {
        try {
            String SQL = "UPDATE detinventarios set codigo=?,producto=?,un=?,cantidad=?  WHERE id=?";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, b.getCodigo());
            st.setString(2, b.getProducto());
            st.setString(3, b.getUn());
            st.setDouble(4, b.getCantidad());
            st.setInt(5, b.getId());
            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("error:" + ex.getMessage().toString());
            return false;
        }

    }

    public static boolean eliminar(DetInventario b) {
        try {
            String SQL = "DELETE from detinventarios   WHERE id=?";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(SQL);
            st.setInt(1, b.getId());
            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("error:" + ex.getMessage().toString());
            return false;
        }

    }

    public static ArrayList<DetInventario> listar(String i) {
        try {
            String SQL = "SELECT * FROM detinventarios WHERE ide=" + i;
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(SQL);
            ResultSet resultado = st.executeQuery();
            ArrayList<DetInventario> lista = new ArrayList();

            while (resultado.next()) {
                DetInventario b0 = new DetInventario();
                b0.setId(resultado.getInt("id"));
                b0.setIde(resultado.getInt("ide"));
                b0.setCodigo(resultado.getString("codigo"));
                b0.setProducto(resultado.getString("Producto"));
                b0.setUn(resultado.getString("un"));
                b0.setCantidad(resultado.getDouble("cantidad"));
                lista.add(b0);

            }

            return lista;

        } catch (SQLException ex) {
            return null;
        }

    }

    public static DetInventario listarf(String id) {
        DetInventario b0 = new DetInventario();
        try {
            String SQL = "SELECT * FROM detinventarios where id=" + id;
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(SQL);
            ResultSet resultado = st.executeQuery();
            while (resultado.next()) {

                b0.setId(resultado.getInt("id"));
                b0.setIde(resultado.getInt("ide"));
                b0.setCodigo(resultado.getString("codigo"));
                b0.setProducto(resultado.getString("producto"));
                b0.setUn(resultado.getString("un"));
                b0.setCantidad(resultado.getDouble("cantidad"));

            }
        } catch (Exception e) {
        }
        return b0;
    }

}
