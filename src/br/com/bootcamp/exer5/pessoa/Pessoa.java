package br.com.bootcamp.exer5.pessoa;

public class pessoa {
    String nome;
    String cpf;

public pessoa(String nome,
              String cpf) {
    this.nome = nome;
    this.cpf = cpf;
}

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
