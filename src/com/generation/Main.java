package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.ejercicio.Ejercicio;
import com.generation.paquete2.Animal;

public class Main {

    public static void main(String[] args) {
        Ejercicio person= new Ejercicio("Santiago", 33, "102045455");
//        person.setName("Santiago");
//        person.setAge(33);
//        person.setId("102045455");
        System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());



//          Encapsulamiento
//        CuentaBancaria cuenta = new CuentaBancaria();
//        cuenta.setNombre("Frida Rodriguez");
//        cuenta.setClave("d56f4sd47f");
//        cuenta.setSaldo(50000);
//
//        System.out.println(cuenta.getNombre());
//        cuenta.mostrarsaldo();



//        Persona persona = new Persona();
//        persona.nombre = "Frida";
//        persona.edad = 23;

//Default no permite ver los atributos en otro paquete
//        Animal animal = new Animal();
//        animal.nombre = "iguana";

    }
}
