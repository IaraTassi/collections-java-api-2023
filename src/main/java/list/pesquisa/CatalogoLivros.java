package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
           for(Livro l : livroList) {
               if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
               }
           }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando itens ao catalogo de livros
        catalogoLivros.adicionarLivro("Orgulho e Preconceito", "Jane Austen", 1813);
        catalogoLivros.adicionarLivro("O Cavaleiro de Bronze", "Paulinna Simons", 1833);
        catalogoLivros.adicionarLivro("Tatiana & Alexander", "Paulinna Simons", 2016);
        catalogoLivros.adicionarLivro("A menina que roubava livros", "Markus Zuzak", 2005);
        catalogoLivros.adicionarLivro("Entre duas alma", "M. Delly", 1932);
        catalogoLivros.adicionarLivro("A Cabana", "Willian P. Young", 2007);

        // Exibindo livros do mesmo autor
        System.out.println("Lista de livros por mesmo autor: " + catalogoLivros.pesquisarPorAutor("Paulinna Simons"));

        //Exibindo livros pelo intervalo de anos
        System.out.println("Lista de livros por interlalo do ano 1813 e 1932: " + catalogoLivros.pesquisarPorIntervaloAnos(1813, 1932));

        //Exibindo livros por titulo
        System.out.println("Lista de livros por título: " + catalogoLivros.pesquisarPorTitulo("A Cabana"));
    }
}
