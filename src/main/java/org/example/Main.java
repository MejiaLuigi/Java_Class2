package org.example;

import org.example.modelos.*;

public class Main {
    public static void main(String[] args) {

        Persona objeto=new Persona();
        Local objetoDos=new Local();
        Oferta objetoTres=new Oferta();
        Reserva objetoCuatro=new Reserva();

        //Creando Un obj de la class Samurai, //todo obj ES UNA VARIABLE
        Samurai objetoCinco=new Samurai(); //se supone solo los d4tos
        System.out.println(objetoCinco);

        Herramienta objetoSeis=new Herramienta();
        System.out.println(objetoSeis);

        Alimento objetoSiete=new Alimento();
        System.out.println(objetoSiete);

    }
}