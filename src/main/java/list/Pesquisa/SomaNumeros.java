package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

/*
  2. Soma de Números
  Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

  - adicionarNumero(int numero): Adiciona um número à lista de números.
  - calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
  - encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
  - encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
  - exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
*/
public class SomaNumeros {
    private List<Integer> listaNumerica;

    public SomaNumeros(){
        this.listaNumerica = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaNumerica.add(numero);
    }
    public int calcularSoma(){
        int somaNumeros = 0;
        if(!listaNumerica.isEmpty()){
            for (int num : listaNumerica){
                somaNumeros += num;
            }
        }
        return somaNumeros;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!listaNumerica.isEmpty()){
            for (int num : listaNumerica){
                if(num >= maiorNumero){
                    maiorNumero = num;
                }
            }
            return maiorNumero;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!listaNumerica.isEmpty()){
            for (int num : listaNumerica){
                if(num <= menorNumero){
                    menorNumero = num;
                }
            }
            return menorNumero;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listaNumerica.isEmpty()) {
            System.out.println(this.listaNumerica);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(-2);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());


    }


}
