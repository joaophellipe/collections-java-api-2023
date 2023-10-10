package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vaiza!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                double valorAtual = i.getPreco() * i.getQuantidade();
                valorTotal = valorAtual + valorTotal;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if (!itemList.isEmpty()) {
            System.out.println(itemList);
        }else {
            System.out.println("Lista vazia!");
        }
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Leite", 5.0, 2);
        carrinhoDeCompras.adicionarItem("Carne", 10, 1);

        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());;
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Carne");
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());;


    }
}
