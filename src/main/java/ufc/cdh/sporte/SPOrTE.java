package ufc.cdh.sporte;
import ufc.cdh.sporte.organizadordetimes.OrganizadorSeeded;
import ufc.cdh.sporte.organizadordetimes.participantes.Jogador;
import ufc.cdh.sporte.organizadordetimes.times.TimeSeeded;
public class SPOrTE {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        OrganizadorSeeded org = new OrganizadorSeeded();
        org.CadastrarTime("timetemp", 0);
        org.CadastrarJogador("nome", 3545645, 0);
        org.CadastrarJogador("nomedois", 3645, 0);
        org.CadastrarJogador("nometres", 35, 0);
        org.CadastrarJogador("nomedois", 3645, 0);
        org.CadastrarJogador("nometres", 35, 0);
        org.CadastrarJogador("nomedois", 3645, 0);
        org.CadastrarJogador("nometres", 35, 0);
        org.CadastrarCoach("caoch", 01, 0);
        org.CadastrarTime("timedois", 1);
        org.CadastrarJogador("\naaaaaaanome", 3545645, 1);
        org.CadastrarJogador("nomedowqetres", 35, 1);
        org.CadastrarJogador("nomedoqweqweis", 3645, 1);
        org.CadastrarJogador("nometweqres", 35, 1);
        org.CadastrarJogador("nomeewqeqwdois", 3645, 1);
        org.CadastrarJogador("nometrqes", 35, 1);
        org.CadastrarCoach("cahisderawrefd", 2023, 1);
        org.RemoverJogador(0,0);
        org.RemoverCoach(1);
        org.CadastrarCoach("cdsaaffffdn", 23, 1);
        for(int i = 0; i < org.getTime(0).getTamanho(); i++){
            System.out.println(org.getTime(0).getJogadores().get(i).getNome() + " ");
        }
        for(int i = 0; i < org.getTime(1).getTamanho(); i++){
            System.out.println(org.getTime(1).getJogadores().get(i).getNome() + " ");
        }
    }
}
