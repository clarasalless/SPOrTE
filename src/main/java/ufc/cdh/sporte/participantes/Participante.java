package ufc.cdh.sporte.participantes;

import java.io.Serializable;
import ufc.cdh.sporte.times.TimeAbstrato;

public abstract class Participante implements Serializable{
    String nome;
    TimeAbstrato time;
    int idade;
    public Participante(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
