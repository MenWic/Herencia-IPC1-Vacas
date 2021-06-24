package com.mycompany.vehiculos;

import com.mycompany.interfaces.TransporteMaterial;

//Heredar de Vehiculo e implementar TransportarMaterial, sobreescribir metodos de Super 
public class DeCarga extends Vehiculo implements TransporteMaterial{

    public DeCarga(String combustible, int cantidadGalones, int cantidadPasajeros, double velocidadMaxima,
            double aceleracionBase) {
        super(combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    //Soreescribir metodos de Super Vehiculo
    @Override
    public void acelerar() {
        System.out.println("El Vehiculo de carga esta acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("El Vehiculo de carga ha sido apagado");
    }

    @Override
    public void avanzar() {
        System.out.println("El Vehiculo de carga esta avanzando");
    }

    @Override
    public void encender() {
        System.out.println("El Vehiculo de carga ha sido encendido");
    }

    @Override
    public void frenar() {
        System.out.println("El Vehiculo de carga esta frenando");
    }

    public void girarIizquierda() {
        System.out.println("El Vehiculo de carga esta girando a la izquierda");
    }

    public void girarDerecha(){
        System.out.println("El Vehiculo de carga esta girando a la derecha");
    }

    public void transportarMaterial() {
        System.out.println("Transportando el material");
    }  
}
