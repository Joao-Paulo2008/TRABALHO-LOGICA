/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Questao03 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite quantas pessoas são: ");
        int n = entrada.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = entrada.next();
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = entrada.nextInt();
        }

        int indicePessoaMaisVelha = 0;
        for (int i = 1; i < n; i++) {
            if (idades[i] > idades[indicePessoaMaisVelha]) {
                indicePessoaMaisVelha = i;
            }
        }

        System.out.println("A pessoa mais velha é: " + nomes[indicePessoaMaisVelha]);
    }
}