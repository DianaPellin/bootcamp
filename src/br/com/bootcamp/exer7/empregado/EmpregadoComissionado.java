package br.com.bootcamp.exer7.empregado;

import br.com.bootcamp.exer7.empregado.Empregado;

public class EmpregadoComissionado extends Empregado {
    private double valorProdutosVendidos;
    private double percentualComissao;

    public EmpregadoComissionado (String nome,
                      String cpf,
                      double valorSalarioBase,
                      double valorImpostos,
                      double valorProdutosVendidos,
                      double percentualComissao) {
        super(nome, cpf, valorSalarioBase, valorImpostos);
        this.valorProdutosVendidos = valorProdutosVendidos;
        this.percentualComissao = percentualComissao;
    }

    private double getComissao (double valorProdutosVendidos, double percentualComissao) {
        return valorProdutosVendidos * (percentualComissao/100);
     }

     private double ValorSalarioBase() {return valorSalarioBase;}

    public double calculaValorTotalSalario() {
        return valorSalarioBase - valorImpostos;
    }

    public double calculaValorTotalSalario() {
        return getValorTotalSalarioBase() + valorComissao - getValorImpostos();
    }

    public double getValorTotalSalarioBase(valorSalarioBase) {

    }
}
