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
public class Questao01 {
        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a velocidade máxima permitida: ");
        int velocidadeMaxima = entrada.nextInt();

        System.out.print("Digite a velocidade do motorista: ");
        int velocidadeMotorista = entrada.nextInt();

        int velocidadeExcedida = velocidadeMotorista - velocidadeMaxima;
        int multa = velocidadeExcedida * 5;

        if (velocidadeExcedida > 0) {
            System.out.println("O motorista excedeu a velocidade em " + velocidadeExcedida + " km/h e vai receber uma multa de R$ " + multa);
        } else {
            System.out.println("O motorista estava dentro do limite de velocidade, não há multa");
        }
    }
}
   
              

