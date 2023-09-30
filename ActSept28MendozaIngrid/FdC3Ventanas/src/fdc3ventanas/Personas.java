//Clase Contenedora
package fdc3ventanas;

public class Personas {
    
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    
    //constructor
    public Personas(int id, String nom, String ap, int edad) {
        this.id = id;
        this.nombre = nom;
        this.apellido = ap;
        this.edad = edad;
    }
    
    //setters
    public void setID(int id) {
        this.id = id;
    }
    
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public void setApellido(String ap) {
        this.apellido = ap;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //setters
    public int getID(){
        return this.id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
}
