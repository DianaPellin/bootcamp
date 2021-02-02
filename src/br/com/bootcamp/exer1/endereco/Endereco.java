package br.com.bootcamp.exer1.endereco;

public class Endereco{
      private String endereco;
      private Integer numero;
      private String bairro;

      public Endereco (String endereco,
                       Integer numero,
                       String bairro) {

          this.endereco = endereco;
          this.numero = numero;
          this.bairro = bairro;
      }

      public void setEndereco(String endereco) {
            this.endereco = endereco;
      }

      public String getEndereco() {
            return endereco;
      }

      public void setBairro(String bairro) {
            this.bairro = bairro;
      }

      public String getBairro() {
            return bairro;
      }

      public void setNumero(Integer numero) {
            this.numero = numero;
      }

      public Integer getNumero() {
            return numero;
      }

      @Override
      public String toString() {
            return "Endereco{" +
                    "endereco='" + endereco + '\'' +
                    ", numero=" + numero +
                    ", bairro='" + bairro + '\'' +
                    '}';
      }
}
