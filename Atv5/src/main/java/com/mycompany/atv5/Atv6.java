/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atv6{


    public static void main(String[] args) {
        
        String meuSobrenome = "Ferreira De Brito";
        String sobrenome;
        
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite um sobrenome: ");
        sobrenome = ler.nextLine();
        
        if (!sobrenome.equalsIgnoreCase(meuSobrenome)) {
            System.out.println("O sobrenome digitado é diferente do seu.");
        } else {
            System.out.println("O sobrenome digitado é igual ao seu.");
        }
    }
}
