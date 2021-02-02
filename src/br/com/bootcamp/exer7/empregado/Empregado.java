package br.com.bootcamp.exer7.empregado;

import br.com.bootcamp.exer7.pessoa.Pessoa;

public class Empregado extends Pessoa {

    private double valorSalarioBase;
    private double valorImpostos;

    public Empregado (String nome,
                      String cpf,
                      double valorSalarioBase,
                      double valorImpostos) {

        //o super chama o constructor da classe pessoa.
        super(nome, cpf);

        this.valorImpostos = valorImpostos;
        this.valorSalarioBase = valorSalarioBase;
    }

    public double calculaValorTotalSalario() {
        return valorSalarioBase - valorImpostos;
    }
}
