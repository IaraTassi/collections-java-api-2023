package main.java.set.pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object c) {
        if (this == c) return true;
        if (!(c instanceof Contato)) return false;
        Contato contato = (Contato) c;
        return getNome().equals(contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return nome + " - " + numero;
    }
}
