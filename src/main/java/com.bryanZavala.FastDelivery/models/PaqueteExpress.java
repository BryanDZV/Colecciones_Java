package com.bryanZavala.FastDelivery.models;

import java.util.Date;

public class PaqueteExpress extends Envio implements Asegurable{
    private double horasMaxEntrega;


    public PaqueteExpress(String ciudad, double peso, Integer codigo, double horasMaxEntrega,double tasaBase) {
        super(ciudad, peso, codigo,tasaBase);
        this.horasMaxEntrega = horasMaxEntrega;
    }

    @Override
    public double calcularTarifaEnvio() {
        double tarifa=tasaBase*peso;
        double urgencia=24/horasMaxEntrega;
        double recargo =Math.pow(2, urgencia);
        return tarifa+recargo;

    }

    @Override
    public void contratarSeguro() {

    }
}
