package br.com.bootcamp.exer3.Pessoas;

import java.time.LocalDate;

public class Pessoa {
     private String nome;
     private String sobrenome;
     private String cpf;
     private String email;
     private LocalDate dataNasc;

     public Pessoa (String nome,
                    String cpf,
                    LocalDate dataNasc) {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNasc(LocalDate data_nasc) {
        this.dataNasc = data_nasc;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", dataNasc=" + dataNasc +
                '}';
    }
}
