package com.company;

// Clase abstracta Arma
abstract class Arma {
    protected int canMuniciones;
    protected double alcance;
    protected String marca;
    protected int calibre;
    protected String estado;

    public Arma(int canMuniciones, double alcance, String marca, int calibre, String estado) {
        this.canMuniciones = canMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public boolean enCondicion() {
        return estado.equals("EN USO") && calibre >= 9;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Calibre: " + calibre + ", Estado: " + estado;
    }
}


