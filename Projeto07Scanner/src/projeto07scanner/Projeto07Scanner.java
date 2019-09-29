/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto07scanner;

import java.util.Scanner;

/**
 *
 * @author yuril
 */
public class Projeto07Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		
        //Classe SCANNER deve ser importada de
        //dentro do pacote java.util.Scanner
        //Definir um objeto 'entrada' da classe Scanner
        //usando a palavra reservada NEW
        //que é responsavel pala instanciacao de objetos
        // de uma classe JAVA
        
        String nome = "Yuri";
        Scanner entrada = new Scanner(System.in);
        
        // criar um programa que receba Entrada de 
        // 2 (dois) valor (num1 e num2) e verifique
        // qual o maior e o menor numero entre os dois
        
        int num1, num2;
        System.out.println("Digite o Primeiro Numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o Segundo Numero: ");
        num2 = entrada.nextInt();
        //Valor atribuidos a num1 e num2
        System.out.println("Valor Num1: " + num1);
        System.out.println("Valor Num2: " + num2);
        if (num1 > num2){
            System.out.println("Maior numero é: " + num1);
            System.out.println("Menor numero é: " + num2);
        }
        else
        {
            System.out.println("Maior numero é: " + num2);
            System.out.println("Menor numero é: " + num1);
        }
    }
    
}
