package br.com.bootcamp.exer8.contabancaria;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria{
    private BigDecimal taxaOperacao;

    public ContaPoupanca (BigDecimal saldo,
                          int numeroConta,
                          BigDecimal taxaOperacao) {
        super (saldo, numeroConta);
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public void sacar(BigDecimal valorSacado) {

        setSaldo(getSaldo().subtract(valorSacado.add(taxaOperacao)));

    }

    @Override
    public void depositar(BigDecimal valordepositado) {
        setSaldo(valordepositado.subtract(taxaOperacao));
    }
}
