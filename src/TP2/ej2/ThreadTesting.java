/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2.ej2;

/**
 *
 * @author Fernando Iraira <fmiraira@gmail.com>
 */
class ThreadTesting {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread miHilo = new MiEjecucion();
        miHilo.start();
        try {
            miHilo.join();
        } catch (Exception e) {

        }
        System.out.println("En el main");
    }
}
