package com.company;

public class Main {
    public static void main(String[] args) {
        Policia policia1 = new Policia("Juan", "Perez", 12345);
        Policia policia2 = new Policia("Maria", "Gomez", 67890);

        Corta armaCorta1 = new Corta(15, 180, "Glock", 9, "EN USO", true);
        Larga armaLarga1 = new Larga(30, 500, "Remington", 12, "EN USO", "Uso en patrullas", 4, true);

        System.out.println(armaCorta1);
        System.out.println("¿Puede disparar a más de 200m? " + armaCorta1.efectividadMito());
        System.out.println("¿Está en condiciones? " + armaCorta1.enCondicion());

        System.out.println(armaLarga1);
        System.out.println("¿Está en condiciones? " + armaLarga1.enCondicion());

        Larga armaLarga2 = new Larga(25, 400, "Winchester", 10, "EN USO", "Uso en operaciones especiales", 3, true);
        System.out.println("Comparación de armas largas: " + armaLarga1.compareTo(armaLarga2));
    }
}

