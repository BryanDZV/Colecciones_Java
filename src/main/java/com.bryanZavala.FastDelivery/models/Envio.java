package com.bryanZavala.FastDelivery.models;

public abstract class Envio {
    protected Integer codigo;
    protected   String ciudad;
    protected double peso;
    protected double tasaBase;

    protected Envio(String ciudad, double peso, Integer codigo, double tasaBase) {
        this.ciudad = ciudad;
        this.peso = peso;
        this.codigo=codigo;
        this.tasaBase=tasaBase;
    }
    public abstract  double calcularTarifaEnvio();


}
