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
import model.Producto;

/**
 *
 * @author dev
 */
public class ProductoDAO {
      
    public static boolean registrar(Producto b){
        try {
            String SQL="INSERT INTO productos(producto) VALUES (?);";
            Connection con=Conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setString(1, b.getProducto());
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
    
    public static boolean actualizar(Producto b){
        try {
            String SQL="UPDATE productos set producto=?  WHERE id=?";
            Connection con=Conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setString(1, b.getProducto());
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
    
        public static boolean eliminar(Producto b){
        try {
            String SQL="DELETE from productos   WHERE id=?";
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
    
    
        public static ArrayList<Producto> listar(){
        try {
            String SQL="SELECT * FROM productos";
            Connection con=Conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            ResultSet resultado=st.executeQuery();
            ArrayList<Producto> lista=new ArrayList();
           
            while (resultado.next()){
               Producto b0 =new Producto();
               b0.setId(resultado.getInt("id"));
               b0.setCodigo(resultado.getString("codigo"));
               b0.setBarra(resultado.getString("barra"));
               b0.setProducto(resultado.getString("producto"));
               b0.setUn(resultado.getString("un"));
               b0.setFamilia(resultado.getString("familia"));
               
              lista.add(b0);
             
           }
            
           return lista; 
            
        } catch (SQLException ex) {
           return null;
        }
        
    }
    
    
}
