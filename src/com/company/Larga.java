package com.company;

// Clase Larga
class Larga extends Arma implements Comparable<Larga> {
    private String justitUso;
    private int nivelArma;
    private boolean tieneSello;

    public Larga(int canMuniciones, double alcance, String marca, int calibre, String estado, String justitUso, int nivelArma, boolean tieneSello) {
        super(canMuniciones, alcance, marca, calibre, estado);
        this.justitUso = justitUso;
        this.nivelArma = nivelArma;
        this.tieneSello = tieneSello;
    }
/*
Comento esta parte del codigo, ya que la misma me genera error, opte por cambiar este fragmento
    @Override
    public int compareTo(Larga otraArma) {
        return Integer.compare(this.nivelArma, otraArma.nivelArma);
    }
*/


    @Override
    public int compareTo(Larga otraArma) {
        if (this.nivelArma < otraArma.nivelArma) {
            return -1;
        } else if (this.nivelArma > otraArma.nivelArma) {
            return 1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", Justificación de Uso: " + justitUso + ", Nivel: " + nivelArma + ", Tiene Sello: " + tieneSello;
    }
}

