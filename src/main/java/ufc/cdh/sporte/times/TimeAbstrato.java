package ufc.cdh.sporte.times;

import java.io.Serializable;
import java.util.Vector;

import ufc.cdh.sporte.participantes.Coach;
import ufc.cdh.sporte.participantes.Jogador;
import ufc.cdh.sporte.participantes.exceptions.CoachExistenteException;
import ufc.cdh.sporte.participantes.exceptions.JogadorInexistenteException;
import ufc.cdh.sporte.participantes.exceptions.JogadorRepetidoException;

public abstract class TimeAbstrato implements iTime, Serializable{
    String nome;
    Vector<Jogador> jogadores;
    Coach coach;
    
    public TimeAbstrato(String nome){
        this.nome = nome;
        jogadores = new Vector<Jogador>();
        coach = null;
    }
    
    public void CadastrarJogador(Jogador jogador) throws JogadorRepetidoException{
        if(!JogadorExiste(jogador.getNome())){
            jogadores.add(jogador);
        }
        else{
            throw new JogadorRepetidoException(jogador);
        }
    }
    
    public void RemoverJogador(int i) throws JogadorInexistenteException{
        if(jogadores.size()-1 < i){
            throw new JogadorInexistenteException(i);
        }
        jogadores.remove(i);
    }
    
    public Jogador getJogador(int i){
        return jogadores.get(i);
    }
    
    public Vector<Jogador> getJogadores(){
        return jogadores;
    }
    
    public void CadastrarCoach(Coach coach) throws CoachExistenteException{
        if(coach.getNome().equals("null")){
            throw new CoachExistenteException(coach);
        }
        this.coach = coach;
    }
    
    public void RemoverCoach(){
        coach = null;
    }
    
    public boolean JogadorExiste(String nome){
        for(int i = 0; i < getTamanho(); i++){
            if(jogadores.get(i).getNome().equals(nome)){
                return true;
            }
        }
        return false;
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
