package com.bryanZavala.FastDelivery.models;

public class CargaValiosa extends Envio implements Asegurable{
    private double valorDeclarado;
    private double porcentaje=10;

    public CargaValiosa(String ciudad, double peso, Integer codigo, double tasaBase, double valorDeclarado) {
        super(ciudad, peso, codigo, tasaBase);
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public double calcularTarifaEnvio() {
        double tarifaBase=peso*tasaBase;
        double recargo=valorDeclarado * porcentaje / 100.0;
        return tarifaBase+recargo;
    }

    @Override
    public void contratarSeguro() {

    }
}
