package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.ejercicio.Ejercicio;
import com.generation.paquete2.Animal;

public class Main {

        public static int numerador = 10;
        public static int denominador = 0;
        public static float division;

    public static void main(String[] args) {

        System.out.println("Antes de hacer la división");
        //Excepciones
        try {
            division = numerador / denominador;
        } catch (NullPointerException ex){
            System.out.println("NullPointer");
            System.out.println(ex.getMessage());
        }catch ( Exception ex){
            System.out.println("Exception");
            System.out.println(ex.getMessage());
        }
        System.out.println("Después de la división");

//        Ejercicio person= new Ejercicio("Santiago", 33, "102045455");
////        person.setName("Santiago");
////        person.setAge(33);
////        person.setId("102045455");
//        System.out.println( "Name: " + person.getName());
//        System.out.println( "Age: "+ person.getAge());
//        System.out.println( "Id: " +  person.getId());



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
