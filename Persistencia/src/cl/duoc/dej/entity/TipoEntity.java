/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej.entity;

/**
 *
 * @author boyarce
 */
public class TipoEntity {
    private int codigo;
    private String nombre;


    public TipoEntity(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;

    }
    
    public TipoEntity() {
        this.codigo = 0;
        this.nombre = "";

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    
    
}
