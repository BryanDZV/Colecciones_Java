package com.bryanZavala.FastDelivery.models;

public class PaqueteEstandar extends Envio{

    public PaqueteEstandar(String ciudad, double peso, Integer codigo, double tasaBase) {
        super(ciudad, peso, codigo,tasaBase);

    }

    @Override
    public double calcularTarifaEnvio() {
        return this.tasaBase*peso;
    }
}
