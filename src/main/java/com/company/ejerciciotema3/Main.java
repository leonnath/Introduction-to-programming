package com.company.ejerciciotema3;

public class Main{

    public static void main(String[] args) {
        suma(20, 40, 60);

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("El número de puertas es: " + miCoche.numeroDePuertas);
    }

    public static  int suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    return(resultado);
    }
}

class Coche {
    public  int numeroDePuertas = 4;

    public void sumarPuertas(){

        this.numeroDePuertas++;
    }
}

