package br.com.bootcamp.exer5;

import br.com.bootcamp.exer5.empregado.empregado;

public class exer5main {

    br.com.bootcamp.exer5.pessoa.pessoa pessoa = new empregado("Debora","45672832067");
    double valor1 = ((empregado)pessoa).calculaValorTotalSalario();
    //System.out
    empregado empregado = new empregado("Debora", "45672832067");
    double valor2 = empregado.calculaValorTotalSalario();
}
