package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public Integer pesquisarPorTelefone(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("Contato não encontrado na agenda.");
            }
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joana", 9998989);
        agendaContatos.adicionarContato("Camila", 9998888);
        agendaContatos.adicionarContato("Jhonatan", 9998787);
        agendaContatos.adicionarContato("Carolina", 9998686);
        agendaContatos.adicionarContato("Carolina Gomes", 9998585);
        agendaContatos.adicionarContato("Alexandra", 9998484);

        agendaContatos.exibirContatos();

        //Removendo um contato
        agendaContatos.removerContato("Joana");
        agendaContatos.exibirContatos();

        //Pesquisando telefone por nome
        System.out.println("Telefone da Carolina é  " + agendaContatos.pesquisarPorTelefone("Carolina"));
    }
}
