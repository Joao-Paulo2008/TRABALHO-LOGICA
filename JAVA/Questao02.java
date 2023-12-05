/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Questao02 { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        int nota1 = entrada.nextInt();
        System.out.print("Digite a segunda nota: ");
        int nota2 = entrada.nextInt();

        int media = (nota1 + nota2) / 2;

        if (media >= 70) {
            System.out.println("O aluno está aprovado com uma média de " + media);
        } else if (media >= 40 && media <= 69) {
            System.out.println("O aluno está em exame final. Digite a nota do exame: ");
            int notaExame = entrada.nextInt();
            int mediaFinal = (media + notaExame) / 2;
            if (mediaFinal >= 100) {
                System.out.println("O aluno foi aprovado no exame final com uma média de " + mediaFinal);
            } else {
                System.out.println("O aluno foi reprovado no exame final com uma média de " + mediaFinal);
            }
        } else {
            System.out.println("O aluno foi reprovado com uma média de " + media);
        }
    }
}
    
    

