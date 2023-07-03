package ufc.cdh.sporte.organizadordetimes.participantes;

import ufc.cdh.sporte.organizadordetimes.times.TimeAbstrato;

public abstract class Participante {
    String nome;
    TimeAbstrato time;
    int idade;
    public Participante(String nome, TimeAbstrato time, int idade){
        this.nome = nome;
        this.time = time;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public TimeAbstrato getTime(){
        return time;
    }
    public int getIdade(){
        return idade;
    }
}
