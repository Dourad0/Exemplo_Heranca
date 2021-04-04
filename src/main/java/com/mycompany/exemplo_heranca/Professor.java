package com.mycompany.exemplo_heranca;

public class Professor extends Pessoa{
    private double salario; 
    private String disciplina;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void imprimirNome(){
        System.out.println("Nome do Professor: " + super.getNome());
    }
    
}
