package ufc.cdh.sporte.participantes;

import java.io.Serializable;
import ufc.cdh.sporte.times.TimeAbstrato;

public abstract class Participante implements Serializable{
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
