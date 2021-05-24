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
public class Bodega implements Serializable{
    private int id;
    private String bodega;

    public Bodega() {
        this.id=0;
        this.bodega="";
    }

    public Bodega(int id, String bodega) {
        this.id = id;
        this.bodega = bodega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }
    
    
    
}
