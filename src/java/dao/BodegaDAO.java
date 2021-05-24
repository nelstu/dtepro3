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

/**
 *
 * @author dev
 */
public class BodegaDAO {
    
    public static boolean registrar(Bodega b){
        try {
            String SQL="INSERT INTO bodegas(bodega) VALUES (?);";
            Connection con=Conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setString(1, b.getBodega());
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
    
    public static boolean actualizar(Bodega b){
        try {
            String SQL="UPDATE bodegas set bodega=?  WHERE id=?";
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
    
        public static boolean eliminar(Bodega b){
        try {
            String SQL="DELETE from bodegas   WHERE id=?";
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
    
    
        public static ArrayList<Bodega> listar(){
        try {
            String SQL="SELECT * FROM bodegas";
            Connection con=Conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            ResultSet resultado=st.executeQuery();
            ArrayList<Bodega> lista=new ArrayList();
           
            while (resultado.next()){
               Bodega b0 =new Bodega();
               b0.setId(resultado.getInt("id"));
               b0.setBodega(resultado.getString("bodega"));
              lista.add(b0);
             
           }
            
           return lista; 
            
        } catch (SQLException ex) {
           return null;
        }
        
        
 
        
        
    }
    
     
    public static Bodega listarf(String id) {
        Bodega b0 =new Bodega();
        try {
                String SQL="SELECT * FROM bodegas where id="+id;
            Connection con=Conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            ResultSet resultado=st.executeQuery();
            while(resultado.next()){                
               
               b0.setId(resultado.getInt("id"));
               b0.setBodega(resultado.getString("bodega"));
                
            }
        } catch (Exception e) {
        }
        return b0;
    }
            
    
}
