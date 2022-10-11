/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.construccion.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.construccion.entidades.Contratista;
import mx.itson.construccion.entidades.Edificio;
import mx.itson.construccion.entidades.Material;
import mx.itson.construccion.entidades.Proceso;
import mx.itson.construccion.enumeradores.Tamaño;

/**
 * Ejemplo de clases de entidad.
 * @author Enrique Gonzalez
 */
public class Main {

    /**
     * Toma las entidades de las demas clases ya definidas y las enlista
     * @param  args the command line arguments
     * @return Las entidades en un orden
     */
    public static void main(String[] args) {
        // El metodo se encarga de obtener los argumentos para su uso en el programa
        
        Edificio edificio = new Edificio();
        edificio.setNombre("Consultorio medico");
        edificio.setDescripcion("Se encargo la construccion de un consultorio medico particular de 24 metros cuadrados");
        edificio.setMetros(24);
        edificio.setTiempo(1);
        
        /**
         * El metodo List<Material> se encarga de enlistar los objetos del arreglo llamados Material
         * regresa los martiales enlistados con sus cantidades y/o especificaciones
         */
        
        List<Material> materiales = new ArrayList<Material>();
        
        Material material1 = new Material();
        material1.setNombre("1- 20 sacos de cemento de 50 KG");
        materiales.add(material1);
        
        Material material2 = new Material();
        material2.setNombre("2- 1500 bloques de ladrillo");
        materiales.add(material2);
        
        Material material3 = new Material();
        material3.setNombre("3- 4 metros de piedra");
        materiales.add(material3);
        
        Material material4 = new Material();
        material4.setNombre("4- 12 armex de 5 metros");
        materiales.add(material4);
        
        Material material5 = new Material();
        material5.setNombre("5- 30 varillas de 3/8");
        materiales.add(material5);
        
        Material material6 = new Material();
        material6.setNombre("6- 8 metros de grava");
        materiales.add(material6);
        
        Material material7 = new Material();
        material7.setNombre("7- Una manguera naranja de 1/2 de ancho de 20 metros");
        materiales.add(material7);
        
        Material material8 = new Material();
        material8.setNombre("8- 8 metros de piso firme");
        materiales.add(material8);
        
        Material material9 = new Material();
        material9.setNombre("9- 8 metros de arena");
        materiales.add(material9);
        
        Material material10 = new Material();
        material10.setNombre("10- 2 puertas");
        materiales.add(material10);
        
        Material material11 = new Material();
        material11.setNombre("11- 2 ventanas");
        materiales.add(material11);
        
        /**
         * Permite recivir los objetos material al imprimir
         */
        edificio.setMaterial(materiales);
        
        /**
         * El metodo List<Proceso> permite enlistar los objetos del arreglo Proceso
         */
        
        List<Proceso> procesos = new ArrayList<Proceso>();
        
        Proceso proceso1 = new Proceso();
        proceso1.setOrden(1);
        proceso1.setDescripcion("Se hace un rectangulo de 4x6 en el area");
        procesos.add(proceso1);
        
        Proceso proceso2 = new Proceso();
        proceso2.setOrden(2);
        proceso2.setDescripcion("Se marcan las medidas y se tiran los niveles");
        procesos.add(proceso2);
        
        Proceso proceso3 = new Proceso();
        proceso3.setOrden(3);
        proceso3.setDescripcion("Se hace una zanja de 50 centimetros de profundidad y 40 de ancho");
        procesos.add(proceso3);
        
        Proceso proceso4 = new Proceso();
        proceso4.setOrden(4);
        proceso4.setDescripcion("Se coloca la piedra");
        procesos.add(proceso4);
        
        Proceso proceso5 = new Proceso();
        proceso5.setOrden(5);
        proceso5.setDescripcion("Se colocan los armex para castillo");
        procesos.add(proceso5);
        
        Proceso proceso6 = new Proceso();
        proceso6.setOrden(6);
        proceso6.setDescripcion("Colocar con cemento los castillos despues de colocar la cimbra de madera");
        procesos.add(proceso6);
        
        Proceso proceso7 = new Proceso();
        proceso7.setOrden(7);
        proceso7.setDescripcion("Pegar el ladrillo con la mezcla de cemento, grava y arena hasta la altura de dala");
        procesos.add(proceso7);
        
        Proceso proceso8 = new Proceso();
        proceso8.setOrden(8);
        proceso8.setDescripcion("Se colocan los armex de la parte superior en los muros");
        procesos.add(proceso8);
        
        Proceso proceso9 = new Proceso();
        proceso9.setOrden(9);
        proceso9.setDescripcion("Se cimbra y se coloca la mezcla en la parte superior en los muros");
        procesos.add(proceso9);
        
        Proceso proceso10 = new Proceso();
        proceso10.setOrden(10);
        proceso10.setDescripcion("Se cimbra el techo y se colocan las varillas, se instala el cable naranja");
        procesos.add(proceso10);
        
        Proceso proceso11 = new Proceso();
        proceso11.setOrden(11);
        proceso11.setDescripcion("Se hace el colado de losa del techo");
        procesos.add(proceso11);
        
        Proceso proceso12 = new Proceso();
        proceso12.setOrden(12);
        proceso12.setDescripcion("Se colocan las puertas");
        procesos.add(proceso12);
        
        Proceso proceso13 = new Proceso();
        proceso13.setOrden(13);
        proceso13.setDescripcion("Se colocan las ventanas");
        procesos.add(proceso13);
        
        /**
         * Permite obtener los objetos Proceso al imprimir
         */
        edificio.setProceso(procesos);
        
        /**
         * Permite obtener el enumerador Tamaño al imprimir
         */
        edificio.setTamaño(Tamaño.MEDIANO);
        
        /**
         * Son los datos del @param Contratista
         */
        Contratista contratista = new Contratista();
        contratista.setNombre("Gus");
        contratista.setCompañia("Construcciones brazo fuerte");
        contratista.setCampo("Obra Civil");
        
        /**
         * Permite obtener los objetos del Contratista 
         */
        edificio.setContratista(contratista);
        
        /**
         * Imprime los entidades ordenadas
         */      
        System.out.println("Construccion");
        System.out.println("Nombre del contratista: " + edificio.getContratista().getNombre());
        System.out.println(edificio.getNombre());
        System.out.println(edificio.getDescripcion());
        System.out.println(edificio.getMetros() + " Metros cuadrados");
        System.out.println("Tiempo de construccion: " + edificio.getTiempo() + " Meses");
        System.out.println("Lista de materiales: ");
        for (Material m : edificio.getMaterial()){
        System.out.println(".-" + m.getNombre());
        }
        System.out.println("Lista de pasos ordenados a seguir: ");
        for (Proceso p : edificio.getProceso()){
            System.out.println(".-" + p.getOrden() + p.getDescripcion());
        }
        System.out.println("Tamaño del edificio: " + edificio.getTamaño());
    }     
}
   