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
public class Producto  implements Serializable{
    private int id;
    private String codigo;
    private String barra;
    private String producto;
    private String un;
    private String familia;

    public Producto() {
    }

    public Producto(int id, String codigo, String barra, String producto, String un, String familia) {
        this.id = id;
        this.codigo = codigo;
        this.barra = barra;
        this.producto = producto;
        this.un = un;
        this.familia = familia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getBarra() {
        return barra;
    }

    public void setBarra(String barra) {
        this.barra = barra;
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

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
  
    
    
    
}
