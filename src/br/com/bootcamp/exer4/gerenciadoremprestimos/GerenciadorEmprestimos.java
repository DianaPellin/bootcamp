package br.com.bootcamp.exer4.gerenciadoremprestimos;

import br.com.bootcamp.exer4.emprestimo.Emprestimo;
import br.com.bootcamp.exer4.livros.Livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorEmprestimos {
    private final List<Emprestimo> EmprestimoList = new ArrayList<>();
    private final List<Livro> LivroList = new ArrayList<>();
    private LocalDate dataAtual = LocalDate.now();

    public List<Emprestimo> emprestimoList() {
        return EmprestimoList;
    }

    public void adicionaRegistro(Emprestimo emprestimo) {
        //if
        EmprestimoList.add(emprestimo);
        System.out.println("Empréstimo registrado!");

    }


    private boolean LivroEmprestado (LocalDate dataEmprestimo); {
        LocalDate dataEmprestimo = getDataEmprestimo(dataEmprestimo);
        return !dataEmprestimo.isEqual(dataAtual) && !dataEmprestimo.isBefore(dataAtual);

    }

    private LocalDate getDataEmprestimo() {
    }

}



