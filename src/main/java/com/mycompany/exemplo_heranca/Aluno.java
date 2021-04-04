package com.mycompany.exemplo_heranca;

public class Aluno extends Pessoa {
    private String matricula; 
    private String notas;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    public void imprimirNome(){
        System.out.println("Nome do Aluno: " + super.getNome());
    }
}
