package br.com.bootcamp.exer1.Pessoa;

import br.com.bootcamp.exer1.endereco.Endereco;
import br.com.bootcamp.exer1.telefone.Telefone;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private LocalDate data_nascimento;
    private List<Endereco> enderecoList;
    private List<Telefone> telefoneList;

    //O set só atribui o valor e o get retorna
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

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
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

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", data_nascimento=" + data_nascimento +
                ", enderecoList=" + enderecoList +
                ", telefoneList=" + telefoneList +
                '}';
    }
}