package br.com.bootcamp.exer8.contabancaria;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria{

    private BigDecimal limite;

    public ContaCorrente (BigDecimal saldo,
        int numeroConta,
        BigDecimal limite) {
        super(saldo,numeroConta);
        this.limite = limite;
        }

    @Override
    public void sacar(BigDecimal valorSacado) {
        setSaldo(getSaldo().subtract(valorSacado));
        }

    @Override
    public void depositar(BigDecimal valorDepositado) {
         setSaldo (getSaldo().add(valorDepositado));
    }

}
