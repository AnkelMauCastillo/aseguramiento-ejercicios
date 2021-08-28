package com.gatoV1;

import java.util.Scanner;

//creación clase Tablero
public class Tablero {
    //Atriibutos privados
    //Atributo que genera el tablero de 3x3
    private char[][] posiciones = new char[3][3];


    //Construir objeto Tablero que inicializa el tablero
    public Tablero() {
        int posicion = 1;
        for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 3; columnas++) {
                posiciones[filas][columnas] = Integer.toString(posicion).charAt(0);
                posicion++;
            }
        }
    }

    //metodos get´s  set´s
    public char[][] getPosiciones() {
        return posiciones;
    }
    Scanner entrada = new Scanner(System.in);

    public void setPosiciones(char[][] posiciones) {
        this.posiciones = posiciones;
    }

    public void asignarCaracter (int numeroPosición, char caracter){
        switch (numeroPosición) {
            case 1:
                if(posiciones [0][0] == 'X' || posiciones[0][0] == 'O'){

                    casillaOcupada(numeroPosición,caracter);
                }else {
                    posiciones [0][0] = caracter;
                    setPosiciones(posiciones);
                }

                break;
            case 2:
                if (posiciones [0][1] == 'X' || posiciones [0][1] == 'O'){

                    casillaOcupada(numeroPosición,caracter);
                }else {
                    posiciones [0][1] = caracter;
                    setPosiciones(posiciones);
                }

                break;
            case 3:
                if (posiciones [0][2] == 'X' || posiciones [0][2] == 'O'){
                    casillaOcupada(numeroPosición,caracter);
                }else {
                    posiciones [0][2] = caracter;
                    setPosiciones(posiciones);
                }

                break;
            case 4:
                if (posiciones [1][0] == 'X' || posiciones [1][0] == 'O'){
                    casillaOcupada(numeroPosición,caracter);
                }else {
                    posiciones [1][0] = caracter;
                    setPosiciones(posiciones);
                }

                break;
            case 5:
                if (posiciones [1][1] == 'X' || posiciones [1][1] == 'O'){
                    casillaOcupada(numeroPosición,caracter);
                }else {
                    posiciones [1][1] = caracter;
                    setPosiciones(posiciones);
                }

                break;
            case 6:
                if (posiciones [1][2] == 'X' || posiciones [1][2] == 'O'){
                    casillaOcupada(numeroPosición,caracter);
                }else {
                    posiciones [1][2] = caracter;
                    setPosiciones(posiciones);
                }

                break;
            case 7:
                if (posiciones [2][0] == 'X' || posiciones [2][0] == 'O'){
                    casillaOcupada(numeroPosición,caracter);
                }else {
                    posiciones [2][0] = caracter;
                    setPosiciones(posiciones);
                }

                break;
            case 8:
                if (posiciones [2][1] == 'X' || posiciones [2][1] == 'O'){
                    casillaOcupada(numeroPosición,caracter);
                }else {
                    posiciones [2][1] = caracter;
                    setPosiciones(posiciones);
                }

                break;
            case 9:
                if (posiciones [2][2] == 'X' || posiciones [2][2] == 'O'){
                    casillaOcupada(numeroPosición,caracter);
                }else {
                    posiciones [2][2] = caracter;
                    setPosiciones(posiciones);
                }
                break;
            default:
                System.out.println("Opcion no valida");

                break;
        }
    }

    public char validaEstrategia (){
        for (int i = 0; i < 9; i++){
            String linea = " ";
            switch (i) {
                case 1 :
                    linea = String.valueOf(posiciones[0][0]) +
                            String.valueOf(posiciones[0][1]) +
                            String.valueOf(posiciones[0][2]);
                    break;
                case 2 :
                    linea = String.valueOf(posiciones[0][0]) +
                            String.valueOf(posiciones[1][1]) +
                            String.valueOf(posiciones[2][2]);
                    break;

                case 3 :
                    linea = String.valueOf(posiciones[0][0]) +
                            String.valueOf(posiciones[1][0]) +
                            String.valueOf(posiciones[2][0]);
                    break;

                case 4 :
                    linea = String.valueOf(posiciones[0][1]) +
                            String.valueOf(posiciones[1][1]) +
                            String.valueOf(posiciones[2][1]);
                    break;

                case 5 :
                    linea = String.valueOf(posiciones[0][2]) +
                            String.valueOf(posiciones[1][2]) +
                            String.valueOf(posiciones[2][2]);
                    break;

                case 6 :
                    linea = String.valueOf(posiciones[1][0]) +
                            String.valueOf(posiciones[1][1]) +
                            String.valueOf(posiciones[1][2]);
                    break;

                case 7 :
                    linea = String.valueOf(posiciones[2][0]) +
                            String.valueOf(posiciones[2][1]) +
                            String.valueOf(posiciones[2][2]);
                    break;
                case 8 :
                    linea = String.valueOf(posiciones[0][2]) +
                            String.valueOf(posiciones[1][1]) +
                            String.valueOf(posiciones[2][0]);


                    break;
                default:
                    linea = "1";
                    break;
            }

            if (linea.equals("XXX")){
                return 'X';
            }
            else if (linea.equals("OOO")){
                return 'O';
            }

        }
        return '0';
    }

    public void casillaOcupada(int numeroPosición, char caracter){
        System.out.println("Casilla Ocupada");
        System.out.println("Ingrese de nuevo la posicion de una casilla libre");
        numeroPosición = entrada.nextInt();
        asignarCaracter(numeroPosición,caracter);
    }





    //metodo de impresión del tablero.
    @Override
    public String toString() {
        return posiciones [0][0] + "|" + posiciones [0][1] + "|" + posiciones [0][2]  + "\n_____\n" + "\n" +
                posiciones [1][0] + "|" + posiciones [1][1] + "|" + posiciones [1][2]  + "\n_____\n" + "\n" +
                posiciones [2][0] + "|" + posiciones [2][1] + "|" + posiciones [2][2]  + "\n_____\n";
    }
}


