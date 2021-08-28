package com.gatoV1;

import java.util.Scanner;

public class Caracter {
    //atributo privado tipo char
    private char caracter;
    //creacion del objeto entrada de la clase Scanner
    Scanner entrada = new Scanner(System.in);

    //Constructor de la clase Caracter
    public Caracter() {

    }
    //metodos get´s y set´s
    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    //metodo que seleccion que caracter se ha introducido.
    public char seleccionarCaracter(int insignia){

        if (insignia == 1){
            return 'X';
        }
        else if (insignia == 2){
            return  'O';
        }else
            return '\u0000';
    }
    //metodo que valida una opción correcta.
    public char validarCaracter (){

        //interruptor
        boolean centinela = false;
        //inicialización del atributo insignia
        int insignia = -1;



        do {
            try {
                System.out.println("Oprime 1 para seleccionar 'X' o 2 para seleccionar 'O'");
                insignia = entrada.nextInt();
                if (seleccionarCaracter(insignia) == 'X' || seleccionarCaracter(insignia) == 'O')  {
                    centinela = false;
                }else {
                    System.out.println("No es una opcion valida");
                    centinela = true;
                }

            }
            catch (Exception e){
                centinela = true;
                System.out.println("No me diste un valor numerico");
                entrada.next();

            }
        }while (centinela != false );

        return seleccionarCaracter(insignia);//regresa un caracter
    }


}
