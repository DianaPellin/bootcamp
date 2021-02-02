package br.com.bootcamp.exer3;

import br.com.bootcamp.exer3.GrupoPessoas.GrupoPessoa;
import br.com.bootcamp.exer3.Pessoas.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainExer3 {
    public static void main(String[] args) {
        GrupoPessoa grupoPessoas = new GrupoPessoa();
        Pessoa diana = new Pessoa ("Diana", "09832134537", LocalDate.of(2003,12,01));
        Pessoa michel = new Pessoa ("Michel", "6957423545", LocalDate.of(1999,10,21));
        Pessoa vinicius = new Pessoa ("Vinícius", "42532423543", LocalDate.of(2004,07,9));

        GrupoPessoa.adicionar(diana);
        GrupoPessoa.adicionar(michel);
        GrupoPessoa.adicionar(vinicius);
    }
}
