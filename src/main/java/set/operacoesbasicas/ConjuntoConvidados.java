package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {

        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
   }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //Exibe a quantidade de convidados na lista
        System.out.println("Total de " + conjuntoConvidados.contarConvidados() + " convidados dentro da lista convidados");

        //Adiciona convidados na lista
        conjuntoConvidados.adicionarConvidado("Pato Donald 1" , 1234);
        conjuntoConvidados.adicionarConvidado("Tio Patinhas 2" , 1235);
        conjuntoConvidados.adicionarConvidado("Mickey Mouse 3" , 1235);//Este convite não foi salvo
        conjuntoConvidados.adicionarConvidado("Minnie Mouse 4" , 1237);

        //Exibe lista de convidados com o método equals and hash code; ele faz a comparação e não permite salvar códigos iguais
        System.out.println("Total de convidados após serem adicionados: " + conjuntoConvidados.contarConvidados() + " convidados dentro da lista");

        //Remove convidado código 1234
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Após remoção temos " + conjuntoConvidados.contarConvidados() + " dentro da lista convidado");

        //Exibe lista de convidados
        conjuntoConvidados.exibirConvidados();
    }
}
