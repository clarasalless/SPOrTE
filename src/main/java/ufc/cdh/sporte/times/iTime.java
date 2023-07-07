package ufc.cdh.sporte.times;
import java.util.Vector;

import ufc.cdh.sporte.participantes.*;
public interface iTime {
    public void CadastrarJogador(Jogador jogador);
    public void RemoverJogador(int i);
    public Jogador getJogador(int i);
    public Vector<Jogador> getJogadores();
    public void CadastrarCoach(Coach coach);
    public void RemoverCoach();
    public Coach getCoach();
    public int getTamanho();
    public String getNome();
}
