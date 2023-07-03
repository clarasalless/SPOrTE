package ufc.cdh.sporte.organizadordetimes;

import java.util.Vector;
import ufc.cdh.sporte.organizadordetimes.participantes.Coach;
import ufc.cdh.sporte.organizadordetimes.participantes.Jogador;
import ufc.cdh.sporte.organizadordetimes.times.TimeAbstrato;

public abstract class OrganizadorAbstrato{
    Vector<TimeAbstrato> times;
    public OrganizadorAbstrato(){
        times = new Vector();   
    }
    public void RemoverTime(int i){
        times.remove(i);
    }
    
    public void CadastrarJogador(String nome, int idade, int i){
        Jogador jogador = new Jogador(nome, times.get(i), idade);
        times.get(i).CadastrarJogador(jogador);
    }
    
    public void RemoverJogador(int j, int i){
        times.get(i).RemoverJogador(j);
    }
    
    public void CadastrarCoach(String nome, int idade, int i){
        Coach coach = new Coach(nome, times.get(i), idade);
        times.get(i).CadastrarCoach(coach);
    }
    
    public void RemoverCoach(int i){
        times.get(i).RemoverCoach();
    }
    
    public abstract void Ordenar();
    
    public TimeAbstrato getTime(int i){
        return times.get(i);
    }
    
    public Vector<TimeAbstrato> getTimes(){
        return times;
    }
    
    public int getTamanho(){
        return times.size();
    }
}
