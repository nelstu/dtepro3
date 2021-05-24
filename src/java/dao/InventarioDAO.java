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
import model.Inventario;

/**
 *
 * @author dev
 */
public class InventarioDAO {
    
    public static boolean registrar(Inventario b){
        try {
            String SQL="INSERT INTO inventarios(bodega,fecha,observacion) VALUES (?,?,?);";
            Connection con=Conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setString(1, b.getBodega());
            st.setString(2, b.getFecha() );
            st.setString(3, b.getObservacion() );
            if (st.executeUpdate()>0){
            return true;
            }else{
            return false;    
            }
        } catch (SQLException ex) {
            System.out.println("error:"+ex.getMessage().toString());
           return false;
        }
        
    }
    
    public static boolean actualizar(Inventario b){
        try {
            String SQL="UPDATE inventarios set bodega=?  WHERE id=?";
            Connection con=Conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setString(1, b.getBodega());
            st.setInt(2, b.getId());
            if (st.executeUpdate()>0){
            return true;
            }else{
            return false;    
            }
        } catch (SQLException ex) {
            System.out.println("error:"+ex.getMessage().toString());
           return false;
        }
        
    }
    
        public static boolean eliminar(Inventario b){
        try {
            String SQL="DELETE from inventarios   WHERE id=?";
            Connection con=Conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, b.getId());
            if (st.executeUpdate()>0){
            return true;
            }else{
            return false;    
            }
        } catch (SQLException ex) {
            System.out.println("error:"+ex.getMessage().toString());
           return false;
        }
        
    }
    
    
        public static ArrayList<Inventario> listar(){
        try {
            String SQL="SELECT * FROM inventarios ORDER BY id DESC";
            Connection con=Conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            ResultSet resultado=st.executeQuery();
            ArrayList<Inventario> lista=new ArrayList();
           
            while (resultado.next()){
               Inventario b0 =new Inventario();
               b0.setId(resultado.getInt("id"));
               b0.setBodega(resultado.getString("bodega"));
               b0.setFecha(resultado.getString("fecha"));
               b0.setObservacion(resultado.getString("observacion"));
               b0.setEstado(resultado.getString("estado"));
               lista.add(b0);
             
           }
            
           return lista; 
            
        } catch (SQLException ex) {
           return null;
        }
        
    }
    
    
            
    
}
