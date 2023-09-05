package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo ,double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
            return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorCodigo() {
        Set<Produto> produtosPorCodigo = new TreeSet<>(new ComparatorPorCodigo());
        produtosPorCodigo.addAll(produtoSet);
        return produtosPorCodigo;
    }

    public Set<Produto> exibirProdutosPorQuantidade() {
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtosPorQuantidade.addAll(produtoSet);
        return produtosPorQuantidade;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        //Adicionando ao cadastro os produtos, produto mesmo código não salva
        cadastroProdutos.adicionarProduto("Talheres descartável", 2321, 25.9, 3);
        cadastroProdutos.adicionarProduto("Talheres descartável",2321, 25.9, 4);
        cadastroProdutos.adicionarProduto("Guardanapo",2323, 9.9, 6);
        cadastroProdutos.adicionarProduto("Copo descartável",2324, 15.9d, 9);
        cadastroProdutos.adicionarProduto("Bandeija descartável",2324, 24.9, 6);

        //Exibindo os produtos cadastrado
        System.out.println("Exibindo os produtos adicionados: " + cadastroProdutos.exibirProdutosPorNome());

        //Exibindo produtos ordenados por nome
        System.out.println("Exibindo produtos por nome: " + cadastroProdutos.exibirProdutosPorNome());

        //Exibindo produtos ordenados por preço
        System.out.println("Exibindo produtos por preço: " + cadastroProdutos.exibirProdutosPorPreco());

        //Exibindo produtos ordenados por código
        System.out.println("Exibindo produtos por código: " + cadastroProdutos.exibirProdutosPorCodigo());

        //Exibindo produtos ordenados por quantidade
        System.out.println("Exibindo produtos por quantidade: " + cadastroProdutos.exibirProdutosPorQuantidade());
    }
}
