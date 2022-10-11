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
public class Proceso {

    
    private int orden;
    private String descripcion;
    
    /**
     * @return the orden
     * Orden en el que regresan los datos
     */
    public int getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     * Orden en el que los datos son colocados al imprimirlos
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }

    /**
     * @return the descripcion
     * Valor del objeto descripcion que regresa al ser definido
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     * Valor obtenido de descripcion al imprimir
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
