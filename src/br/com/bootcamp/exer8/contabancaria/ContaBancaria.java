package br.com.bootcamp.exer8.contabancaria;

import java.math.BigDecimal;

public abstract class ContaBancaria {
    private BigDecimal saldo;
    private int numeroConta;

    public ContaBancaria(BigDecimal saldo,
                         int numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public abstract void sacar(BigDecimal valorSacado);

    public abstract void depositar(BigDecimal valorDepositado);

}

