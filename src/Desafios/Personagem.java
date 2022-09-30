package Desafios;

import java.time.LocalDate;

public class Personagem {
    String nome;
    Referencia referencia;
    Integer idade;
    LocalDate dataDeCadastro;
    public String toString(){
        return nome + ' ' + referencia + ' ' + idade + " anos " + dataDeCadastro;
    }
    public String obterEmMaiusculo(){
        return toString().toUpperCase();

    }

    public Personagem(String nome, Referencia referencia, Integer idade) {
        this.nome = nome;
        this.referencia = referencia;
        this.idade = idade;
        this.dataDeCadastro = LocalDate.now();
    }

    public String obterTresPrimeirasLetrasDoNome(){
        return nome.substring(0,3);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Referencia getReferencia() {
        return referencia;
    }

    public void setReferencia(Referencia referencia) {
        this.referencia = referencia;
    }

    public LocalDate getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
