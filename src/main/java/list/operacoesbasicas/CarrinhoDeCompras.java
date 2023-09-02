package main.java.list.operacoesbasicas;
/*Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online.
 O carrinho deve ser implementado como uma lista de itens.
 Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade.
  Implemente os seguintes métodos:

adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
removerItem(String nome): Remove um item do carrinho com base no seu nome.
calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.*/

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
        List<Item> itemRemovido = new ArrayList<>();
           for (Item i : itemList) {
             if (i.getNome().equalsIgnoreCase(nome)) {
                    itemRemovido.add(i);
           }
        }
        itemList.removeAll(itemRemovido);
    }

    public double calcularValorTotal() {
        double valorCalculado = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorCalculado += valorItem;
            }
        }
        return valorCalculado;
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Laranja", 6.7d, 1);
        carrinhoDeCompras.adicionarItem("Morango", 12.9d, 2);
        carrinhoDeCompras.adicionarItem("Melão", 9.6d, 1);
        carrinhoDeCompras.adicionarItem("Ameixa", 11.2d, 1);

        // Exibindo os itens adicionados ao carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo "Ameixa" do carrinho
        carrinhoDeCompras.removerItem("Ameixa");

        // Exibindo nova lista de itens
        carrinhoDeCompras.exibirItens();

        // Exibindo valor calculado
        System.out.println("O valor total da compra é R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}