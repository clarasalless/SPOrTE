package ufc.cdh.sporte.times;
import java.util.Vector;

import ufc.cdh.sporte.participantes.*;
import ufc.cdh.sporte.participantes.exceptions.CoachExistenteException;
import ufc.cdh.sporte.participantes.exceptions.JogadorInexistenteException;
import ufc.cdh.sporte.participantes.exceptions.JogadorRepetidoException;
public interface iTime {
    public void CadastrarJogador(Jogador jogador) throws JogadorRepetidoException;
    public void RemoverJogador(int i) throws JogadorInexistenteException;
    public Jogador getJogador(int i);
    public Vector<Jogador> getJogadores();
    public void CadastrarCoach(Coach coach) throws CoachExistenteException;
    public void RemoverCoach();
    public Coach getCoach();
    public int getTamanho();
    public String getNome();
}
