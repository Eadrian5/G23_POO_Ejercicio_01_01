/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.g23_poo_ejercicio_01_01;

/**
 *
 * @author Adrian
 */
public class G23_POO_Ejercicio_01_01 {

    public static void main(String[] args) {
        var perro = new Perro ();
        perro.nombre= "Firulais";
        perro.raza="Husky";
        
        System.out.println("El nombre del perro es: "+perro.nombre);
        System.out.println("La raza es: "+perro.raza);
        
        var gato = new Gato ();
        gato.color="Gris";
        gato.edad=2;
        
        System.out.println("El color del gato es: "+gato.color);
        System.out.println("Tiene: "+gato.edad+" meses");
        
        var pais = new Pais ();
        pais.nombre= "Ecuador";
        pais.numCiudades=219;
        
        System.out.println("El nombre del pais es: "+pais.nombre);
        System.out.println("El numero de ciudades es: "+pais.numCiudades);
        
        var universidad = new Universidad ();
        universidad.nombre="Universidad Politecnica Salesiana";
        universidad.rector="Juan Cardenas";
        
        System.out.println("El nombre de la U es: "+universidad.nombre);
        System.out.println("El nombre del rector es: "+universidad.rector);
        
        var auto= new Auto ();
        
        auto.marca="Ford";
        auto.precio=40000;
        
        System.out.println("La marca es: "+auto.marca);
        System.out.println("Cuesta: "+auto.precio);
    }
}
