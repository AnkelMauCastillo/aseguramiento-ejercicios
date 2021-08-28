package com.gatoV1;

import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
	// write your code here
        Scanner entrada = new Scanner(System.in);
        //instancia operaciones
        Operaciones operaciones = new Operaciones();
        Tablero tablero = new Tablero();
        //inicializa el juego del Gato
        operaciones.inicioJuego(tablero);
        entrada.next();





    }
}
