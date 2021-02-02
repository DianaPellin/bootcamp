package br.com.bootcamp.exer7.empregado;

import java.util.List;

public class Gerente extends EmpregadoComissionado {

    private double ajudaCusto;
    private List<Empregado> empregadoList;

    public Gerente(String nome,
                   String cpf,
                   double valorSalarioBase,
                   double valorImpostos,
                   double valorProdutosVendidos,
                   double percentualComissao) {
        super (nome, cpf, valorSalarioBase, valorImpostos, valorProdutosVendidos, percentualComissao);
        this.ajudaCusto = ajudaCusto;

    }

    public double valorTotalSalarioEmpregados() {
        for (int i = 0; empregadoList.size(); i++) {
            valorTotalSalarioEmpregados() = getValorTotalSalarioBase() - valorImpostos;
        }
        return valorTotalSalarioEmpregados();
    }

    public double valorSalarioGerente() {
        return valorTotalSalarioEmpregados() + valorSalarioBase + ajudaCusto;
    }
}
