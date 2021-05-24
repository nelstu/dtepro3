/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author dev
 */
public class DetInventario implements Serializable{
     private int id;
     private int ide;
     private String codigo;
     private String producto;
     private String un;
     private Double cantidad;

    public DetInventario() {
    }

    public DetInventario(int id, int ide, String codigo, String producto, String un, Double cantidad) {
        this.id = id;
        this.ide = ide;
        this.codigo = codigo;
        this.producto = producto;
        this.un = un;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
     
     
     
     
    
    
}
