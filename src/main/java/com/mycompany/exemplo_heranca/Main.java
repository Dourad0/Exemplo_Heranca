package com.mycompany.exemplo_heranca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Professor prof = new Professor();
        Aluno alun = new Aluno();
        Funcionario func = new Funcionario();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do Professor:");
        prof.setNome(scan.next());
        
        System.out.println("Digite o nome do Funcionario:");
        func.setNome(scan.next());
        
        System.out.println("Digite o nome do Aluno:");
        alun.setNome(scan.next());
        
        //imprimir codigo
        System.out.println("");
        System.out.println("---------Nomes---------");
        prof.imprimirNome();
        func.imprimirNome();
        alun.imprimirNome();
        
        scan.close();

    }
    
}
