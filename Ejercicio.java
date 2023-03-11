package com.example.tema8;

public class Ejercicio {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setNombre("Filippo");
        System.out.println("Su nombre es " + persona.getNombre());
        persona.setEdad(27);
        System.out.println("La edad de " + persona.getNombre() + " es " + persona.getEdad() );
        persona.setTelefono(84768718);
        System.out.println("Su número de teléfono es " + persona.getTelefono());
    }
}
class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
    return telefono;
    }
}
