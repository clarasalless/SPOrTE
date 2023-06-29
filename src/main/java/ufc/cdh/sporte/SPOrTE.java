package ufc.cdh.sporte;
import ufc.cdh.sporte.organizadordetimes.participantes.Jogador;
import ufc.cdh.sporte.organizadordetimes.times.TimeSeeded;
public class SPOrTE {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        TimeSeeded time = new TimeSeeded("temptime", 10);
        Jogador jog = new Jogador("jodgarod", time,100);
        time.CadastrarJogador(jog);
        System.out.println(time.getJogadores().get(0).getNome());
        time.RemoverJogador(0);
        Jogador jog2 = new Jogador("jodgarod dois", time,200);
        time.CadastrarJogador(jog2);
        System.out.println(time.getJogadores().get(0).getNome());
    }
}
