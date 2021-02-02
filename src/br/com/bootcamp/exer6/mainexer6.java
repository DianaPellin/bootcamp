package br.com.bootcamp.exer6;

import br.com.bootcamp.exer6.empregado.EmpregadoComissionado;
import br.com.bootcamp.exer6.empregado.empregado;

public class mainexer6 {
    public static void main(String[] args) {
        empregado empregado = new empregado("Diana", "456733342", "100", "12");

        double salarioEmpregado = empregado.calculaValorTotalSalario();
        System.out.println(salarioEmpregado);

        EmpregadoComissionado = new EmpregadoComissionado("Diana",
                "14564211321",
                "100",
                "20",
                "500",
                "10");
        double salarioComisionado = EmpregadoComissionado.calculaValorTotalSalario();
        System.out.println("Salário comissionado: " + salarioComisionado);


    }
}
