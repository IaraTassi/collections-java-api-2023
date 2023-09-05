package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        //Adicionando pessoas na lista
        ordenacaoPessoa.adicionarPessoa("George Jetson", 40, 1.75);
        ordenacaoPessoa.adicionarPessoa("Jane Jetson", 33, 1.71);
        ordenacaoPessoa.adicionarPessoa("Judy Jetson", 15, 1.70);
        ordenacaoPessoa.adicionarPessoa("Elroy Jetson", 11, 1.56);

        //Lista inicial asicionada
        System.out.println("lista inicial: " + ordenacaoPessoa.pessoaList);

        //Ordenando por idade
        System.out.println("Lista ordenada por idade: " + ordenacaoPessoa.ordenarPorIdade());

        //Ordenando por altura
        System.out.println("Lista ordenada por altura: " + ordenacaoPessoa.ordenarPorAltura());


    }

    static class ComparatorPorAltura implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }
}
