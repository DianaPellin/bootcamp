package br.com.bootcamp.exer6.empregado;

import br.com.bootcamp.exer5.pessoa.pessoa;

public class empregado extends pessoa {

    private double valorSalarioBase;
    private double valorImpostos;

    public empregado (String nome,
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
