package com.mycompany.app;

import com.mycompany.vehiculos.*;


public class App {
    //Variable global: arreglo de vehiculos
    private static Vehiculo[] vehiculos=new Vehiculo[20];

    public static void main( String[] args ){
        ManejadorVehiculos runrun = new ManejadorVehiculos();
        System.out.println(" * * * * * Bienvenido al programa de Vehiculos * * * * * \n");
        runrun.crearVehiculo(vehiculos);
        runrun.verVehiculo(vehiculos);
    }
}
