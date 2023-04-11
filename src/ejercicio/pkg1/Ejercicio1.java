/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Titulo\n Autor\n Numero de páginas");

        Libro L1 = new Libro((int) (Math.random() * 10), scanner.nextLine(), scanner.nextLine(), scanner.nextInt());

       // L1.getIsnb();
        // System.out.println(L1.getIsnb());
        System.out.println(L1.toString());

    }

}
