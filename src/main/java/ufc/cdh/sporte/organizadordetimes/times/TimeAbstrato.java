package ufc.cdh.sporte.organizadordetimes.times;

import java.util.Vector;
import ufc.cdh.sporte.organizadordetimes.participantes.Coach;
import ufc.cdh.sporte.organizadordetimes.participantes.Jogador;

public abstract class TimeAbstrato implements iTime{
    String nome;
    Vector<Jogador> jogadores;
    Coach coach;
    
    public TimeAbstrato(String nome){
        this.nome = nome;
        jogadores = new Vector();
        coach = null;
    }
    public void CadastrarJogador(Jogador jogador){
        jogadores.add(jogador);
    }
    public void RemoverJogador(int i){
        jogadores.remove(i);
    }
    public Jogador getJogador(int i){
        return jogadores.get(i);
    }
    public Vector<Jogador> getJogadores(){
        return jogadores;
    }
    public void CadastrarCoach(Coach coach){
        this.coach = coach;
    }
    public void RemoverCoach(){
        coach = null;
    }
    public Coach getCoach(){
        return coach;
    }
    public int getTamanho(){
        return jogadores.size();
    }
    public String getNome(){
        return nome;
    }
}
