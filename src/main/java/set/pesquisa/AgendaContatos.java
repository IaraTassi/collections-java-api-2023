package main.java.set.pesquisa;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pequisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //Agenda contatos vazia
        agendaContatos.exibirContato();

        //Adicionando contatos à agenda
        agendaContatos.adicionarContato("Camila Linhares", 99998888);
        agendaContatos.adicionarContato("Mariana Cavalcante", 99997777);
        agendaContatos.adicionarContato("Manuela Fernandes", 99996666);
        agendaContatos.adicionarContato("Paula Guimarães", 99995555);
        agendaContatos.adicionarContato("Vinícius Carvalho", 99994444);
        agendaContatos.adicionarContato("José dos Santos", 99993333);
        agendaContatos.adicionarContato("Camila Lissote", 99992222);

        //Agenda com os contatos adicionados
        agendaContatos.exibirContato();

        //Pesquizando por nome
        System.out.println(agendaContatos.pequisarPorNome("Camila"));

        //Atualizando número contato
        agendaContatos.atualizarNumeroContato("Mariana Cavalcante", 77779999);
        System.out.println("Atualizando contato da Mariana: " + agendaContatos.pequisarPorNome("Mariana"));


    }


}
