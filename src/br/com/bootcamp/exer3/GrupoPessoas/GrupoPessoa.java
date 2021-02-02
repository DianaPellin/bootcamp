package br.com.bootcamp.exer3.GrupoPessoas;

import br.com.bootcamp.exer3.Pessoas.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GrupoPessoa {
   private final List<Pessoa> pessoaList = new ArrayList<>();
   private final LocalDate dataAtual = LocalDate.now();

   public GrupoPessoa() {
   }

   public List<Pessoa> pessoaList() {return pessoaList;}

   private boolean MaiorIdade(LocalDate dataNascimento) {
      LocalDate Aniversario18 = getAniversario18(dataNascimento);
      return !Aniversario18.isEqual(dataAtual) && Aniversario18.isBefore(dataAtual);
   }

   private LocalDate getAniversario18 (LocalDate dataNascimento){
      return dataNascimento.plusYears(18);
   }

   private boolean MenorDeIdade(LocalDate dataNascimento) {
      LocalDate Aniversario18 = getAniversario18(dataNascimento);
      return !Aniversario18.isEqual(dataAtual) && !Aniversario18.isBefore(dataAtual);
   }

   public void adicionar(Pessoa pessoas) {
     if (MenorDeIdade(pessoas.getDataNasc())) {
        System.out.println("Não é possível adicionar: " + pessoas.getNome());
     } else {
         pessoaList.add(pessoas);
        System.out.println("Pessoa adicionada!");
     }
   }
}