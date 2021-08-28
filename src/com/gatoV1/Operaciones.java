package com.gatoV1;

import java.util.Scanner;

public class Operaciones {


    //metodo estatico que lanza el juego del Gato
    public void inicioJuego (Tablero tablero){
        Caracter caracter = new Caracter();
        char jugador1;
        jugador1 = caracter.validarCaracter();


        char jugador2;
        if (jugador1 == 'X'){
            jugador2 = 'O';
        }else {
            jugador2 = 'X';
        }

        System.out.println("Jugador 1 Ha seleccionado: "+ jugador1);
        System.out.println("Jugador 2 le corresponde: "+ jugador2);
        System.out.println(tablero.toString());
        turnos(jugador1,jugador2,tablero);


    }

    public static void turnos(char usuario1, char usuario2, Tablero tablero){
        char validarLineDeTresUser1 = '1';
        char validarLineDeTresUser2 = '1';
        int turnos = 0;
        int posicionmatrix;


        do {

            if ((usuario1 == 'X') && (usuario2 == 'O')){
                turnos++;
                System.out.println("Turno: "+ turnos);
                posicionmatrix = asignarPosicion(usuario1, 1);
                tablero.asignarCaracter(posicionmatrix, usuario1);
                validarLineDeTresUser1 = tablero.validaEstrategia();
                //System.out.println("valida :" + validarLineDeTres);
                System.out.println(tablero);
                if (turnos < 9 && (validarLineDeTresUser1 == '1' || validarLineDeTresUser1 == '0')){
                    turnos++;
                    System.out.println("Turno: "+ turnos);
                    posicionmatrix = asignarPosicion(usuario2, 2);
                    tablero.asignarCaracter(posicionmatrix,usuario2);
                    validarLineDeTresUser2 = tablero.validaEstrategia();

                    System.out.println(tablero);
                }

            }
            else if ((usuario1 == 'O') && (usuario2 == 'X')){
                turnos++;
                System.out.println("Turno: "+ turnos);
                posicionmatrix = asignarPosicion(usuario2, 2);
                tablero.asignarCaracter(posicionmatrix, usuario2);
                validarLineDeTresUser2 = tablero.validaEstrategia();
                System.out.println(tablero);
                if (turnos < 9 && (validarLineDeTresUser1 == '1' || validarLineDeTresUser1 == '0')){
                    turnos++;
                    System.out.println("Turno: "+ turnos);
                    posicionmatrix = asignarPosicion(usuario1, 1);
                    tablero.asignarCaracter(posicionmatrix, usuario1);
                    validarLineDeTresUser1 = tablero.validaEstrategia();
                    System.out.println(tablero);
                }


            }

            if ( (validarLineDeTresUser1 == 'X') || (validarLineDeTresUser2 == 'O')|| (validarLineDeTresUser2 == 'X') || (validarLineDeTresUser1 == 'O')){
                System.out.println("FELICIDADES, Ha ganado EL: " + validarLineDeTresUser1);
                turnos = 9;

            }
            else if (turnos == 9){
                System.out.println("EMPATE");
            }
        } while ( turnos != 9 );



    }

    public static int asignarPosicion(char usuarioAll, int idUser){
        Scanner entrada = new Scanner(System.in);
        int idPosicion = -1;
        boolean continua = false;
        boolean centinela = false;

        do {
            try {
                do {
                    System.out.println("Turno Jugador "+ idUser +" :" + usuarioAll+", Ingresa en que posicion colocas el caracter");
                    idPosicion = entrada.nextInt();
                    continua = false;
                    if (idPosicion > 0 && idPosicion < 10){
                        centinela = true;
                    }else{
                        System.out.println("Numero no valido");
                    }
                }while (centinela == false);

            }
            catch (Exception ex){
                System.out.println("Ingrese un valor numerico entre 1 y 9");
                entrada.next();
                continua = true;
            }
        } while (continua);

        return idPosicion;
    }











}
