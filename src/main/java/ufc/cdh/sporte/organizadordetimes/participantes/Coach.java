package ufc.cdh.sporte.organizadordetimes.participantes;

import ufc.cdh.sporte.organizadordetimes.times.TimeAbstrato;

public class Coach extends Participante{
    public Coach(String nome, TimeAbstrato time, int idade){
        super(nome, time, idade);
    }
}
