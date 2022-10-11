/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.construccion.entidades;

/**
 *
 * @author Enrique Gonzalez
 */
public class Material {

    /**
     * @return the nombre
     * Valor nombre de Material que sera retornado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     * Parametro nombre que sera colocado como nombre del Material
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private String nombre;
    
    
}
