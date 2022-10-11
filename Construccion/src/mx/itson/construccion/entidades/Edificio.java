/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.construccion.entidades;

import java.util.List;
import mx.itson.construccion.enumeradores.Tamaño;

/**
 *
 * @author Enrique Gonzalez
 */
public class Edificio {
 
    private String nombre;
    private String descripcion;
    private int metros;
    private int tiempo;
    private Contratista contratista;
    private List<Material> materiales;
    private List<Proceso> proceso;
    private Tamaño tamaño;
    
    /**
     * @return the nombre
     * Dato nombre a retornar
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     * El nombre obtenido que será colocado al ser retornado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     * Objeto descripcion a retornar
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     * Objeto descripcion obtenido que sera colocado al ser retornado
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the metros
     * Objeto metros a retornar
     */
    public int getMetros() {
        return metros;
    }
    
    /**
     * @param metros the metros to set
     * Valor obtenido del objeto metros retornado que se coloca al imprimir
     */
    public void setMetros(int metros) {
        this.metros = metros;
    }

    /**
     * @return the tiempo
     * Valor del objeto tiempo que retorna
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     * Valor obtenido del objeto tiempo retornado que se coloca al imprimir
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the contratista
     * Datos del objeto contratista a retornar
     */
    public Contratista getContratista() {
        return contratista;
    }

    /**
     * @param contratista the contratista to set
     * Dato retornado obtenido del objeto contratista al imprimir
     */
    public void setContratista(Contratista contratista) {
        this.contratista = contratista;
    }

    /**
     * @return the materiales
     * Lista de los objetos Material a retornar
     */
    public List<Material> getMaterial() {
        return materiales;
    }

    /**
     * @param materiales the materiales to set
     * Datos retronados de la Lista Material obtenidos que se colocan al imprimir
     */
    public void setMaterial(List<Material> materiales) {
        this.materiales = materiales;
    }

    /**
     * @return the proceso
     * Datos de la Lista Proceso a retornar
     */
    public List<Proceso> getProceso() {
        return proceso;
    }

    /**
     * @param proceso the proceso to set
     * Datos retornados de la Lista Proceso obtenidos que se coloca al imprimir
     */
    public void setProceso(List<Proceso> proceso) {
        this.proceso = proceso;
    }
    
    /**
     * @return the tamaño
     * Valor del objeto tamaño a retornar
     */
    public Tamaño getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     * Valor retornado obtenido del objeto tamaño que se coloca al imprimir
     */
    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
