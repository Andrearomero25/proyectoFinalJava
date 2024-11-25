package com.company;

// Clase Corta
class Corta extends Arma {
    private boolean esAutomatica;

    public Corta(int canMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica) {
        super(canMuniciones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public boolean efectividadMito() {
        return alcance > 200;
    }

    @Override
    public String toString() {
        return super.toString() + ", Es Automática: " + esAutomatica;
    }
}


