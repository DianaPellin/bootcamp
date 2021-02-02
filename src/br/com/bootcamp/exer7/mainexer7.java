package br.com.bootcamp.exer7;

import br.com.bootcamp.exer7.empregado.Empregado;

public class mainexer7 {
    public static void main(String[] args) {
        Empregado empregado = new Empregado(
                "Diana",
                "0778579757",
                100,
                10);

    }

    public double salarioEmpregado = Empregado.calculaValorTotalSalario();{
        System.out.println(salarioEmpregado);
    }

}
