package com.mycompany.vehiculos;

import com.mycompany.interfaces.TransportePersonas;

//Heredar de Vehiculo e implementar TransportarPersonas, sobreescribir metodos de Super 
public class Camioneta extends Vehiculo implements TransportePersonas{

    public Camioneta(String combustible, int cantidadGalones, int cantidadPasajeros, double velocidadMaxima,
            double aceleracionBase) {
        super(combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    //Soreescribir metodos de Super Vehiculo
    @Override
    public void acelerar() {
        System.out.println("La Camioneta esta acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("La Camioneta ha sido apagada");
        
    }

    @Override
    public void avanzar() {
        System.out.println("La camioneta esta avanzando");
    }

    @Override
    public void encender() {
        System.out.println("La camioneta se ha encendido");   
    }

    @Override
    public void frenar() {
        System.out.println("La camioneta esta frenando");
    }

    public void girarIizquierda() {
        System.out.println("La camioneta esta girando a la izquierda");
    }

    public void girarDerecha(){
        System.out.println("La camioneta esta girando a la derecha");
    }

    public void trasportarPersonas() {
        System.out.println("Transportando a Pasajeros");
    }
}
