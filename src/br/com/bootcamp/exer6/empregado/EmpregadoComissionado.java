package br.com.bootcamp.exer6.empregado;

public class EmpregadoComissionado extends empregado{

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
      private double getComissao(double valorProdutosVendidos,
                                 double percentualComissao) {
        return valorProdutosVendidos * percentualComissao/100;
      }

      public double calculaValorTotalSalario() {
        return valorSalarioBase - valorImpostos;
      }

    public double ValorSalarioBase() {
        return ValorSalarioBase;
    }


    public double calculaValorTotalSalario() {
        return getValorTotalSalarioBase() + valorComissao - getValorImpostos();
    }

    public double getValorTotalSalarioBase(empregado.valorSalarioBase) {

    }
}
