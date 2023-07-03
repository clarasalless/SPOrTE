package ufc.cdh.sporte;
import ufc.cdh.sporte.organizadordetimes.OrganizadorSeeded;
import ufc.cdh.sporte.organizadordetimes.participantes.Jogador;
import ufc.cdh.sporte.organizadordetimes.times.TimeSeeded;
import ufc.cdh.sporte.torneio.SingleElimination;
import ufc.cdh.sporte.torneio.Tournament;
public class SPOrTE {

    public static void main(String[] args) {
        SingleElimination t = new SingleElimination(true);
        ((OrganizadorSeeded)t.getOrg()).CadastrarTime("seed1",1);
        ((OrganizadorSeeded)t.getOrg()).CadastrarTime("seed2",2);
        ((OrganizadorSeeded)t.getOrg()).CadastrarTime("seed3",3);
        ((OrganizadorSeeded)t.getOrg()).CadastrarTime("seed4",4);
        ((OrganizadorSeeded)t.getOrg()).CadastrarTime("seed5",5);
        ((OrganizadorSeeded)t.getOrg()).CadastrarTime("seed6",6);
        ((OrganizadorSeeded)t.getOrg()).CadastrarTime("seed7",7);
        ((OrganizadorSeeded)t.getOrg()).CadastrarTime("seed8",8);
        t.generateBracket();
        System.out.println(t.getOrg().getTamanho());
        System.out.println(t.getBracket().getMatches().size());
        
    }
}
