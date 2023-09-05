package main.java.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getPreco(), getQuantidade());
    }

    @Override
    public String toString() {
        return nome + ",  código: " + codigo + ",  R$ " + preco + ",  Quantidade " + quantidade;
    }
}

class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

class ComparatorPorCodigo implements Comparator<Produto> {
     @Override
        public int compare(Produto c1, Produto c2) {
        return Long.compare(c1.getCodigo(), c2.getCodigo());
     }
}

class ComparatorPorQuantidade implements Comparator<Produto> {
     @Override
     public int compare(Produto q1, Produto q2) {
            return Integer.compare(q1.getQuantidade(), q2.getQuantidade());
     }
}




