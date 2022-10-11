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
public class Contratista {
    
    private String nombre;
    private String compañia;
    private String campo;
    

    /**
     * @return the nombre
     * Valor de nombre que sera retornado al definirse
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     * Valor nombre que sera colocado como nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the compañia
     * Valor de compañia que sera retornado al definirse
     */
    public String getCompañia() {
        return compañia;
    }

    /**
     * @param compañia the compañia to set
     * Parametro compañia que sera colocado como compañia
     */
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    /**
     * @return the campo
     * Dato campo que sera retornado al definirse
     */
    public String getCampo() {
        return campo;
    }

    /**
     * @param campo the campo to set
     * parametro campo que sera colocado como campo
     */
    public void setCampo(String campo) {
        this.campo = campo;
    }
    
}
