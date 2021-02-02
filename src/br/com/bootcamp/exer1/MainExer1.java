package br.com.bootcamp.exer1;

import br.com.bootcamp.exer1.Pessoa.Pessoa;
import br.com.bootcamp.exer1.endereco.Endereco;
import br.com.bootcamp.exer1.telefone.Telefone;
import br.com.bootcamp.exer1.telefone.TipoTelefone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainExer1 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Diana"); //Recebe o nome.
        pessoa.getNome();//Retorna o nome.
        pessoa.setSobrenome("Pellin");
        pessoa.getSobrenome();
        pessoa.setCpf("45672356789");
        pessoa.getCpf();
        pessoa.setEmail("Dianapellin@hotmail.com");
        LocalDate datanascimento = LocalDate.of(2003, 12, 01);
        pessoa.setData_nascimento(datanascimento);
        List<Endereco> enderecoList = new ArrayList<>();
        Endereco endereco = new Endereco("R. Tupi", 123, "Centro");
        enderecoList.add(endereco);
        pessoa.setEnderecoList(enderecoList);
        Telefone telefone = new Telefone();
        telefone.setTipoTelefone(TipoTelefone.CELULAR);
        telefone.setDdd(46);
        telefone.setNumero(991346789);
        pessoa.setTelefoneList(new ArrayList<>());
        pessoa.getTelefoneList().add(telefone);
        System.out.println(pessoa);
    }
}