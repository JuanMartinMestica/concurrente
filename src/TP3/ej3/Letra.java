/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ej3;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Letra implements Runnable {

    private char letra;
    private Coordinador coordinador;

    public Letra(char letra, Coordinador coordinador) {
        this.letra = letra;
        this.coordinador = coordinador;
    }

    public Letra(char letra) {
        this.letra = letra;
    }

    public void run() {
        while (!coordinador.esTurno(letra)) {
            System.out.println(letra);
        }
    }

}
