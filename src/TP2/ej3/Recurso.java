/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2.ej3;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Recurso {

    static void uso() {
        Thread t = Thread.currentThread();

        System.out.println("en Recurso: Soy" + t.getName());
    }

}