package com.mycompany.exemplo_heranca;

public class Funcionario extends Pessoa{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void imprimirNome(){
        System.out.println("Nome do Funcionario: " + super.getNome());
    }
}
