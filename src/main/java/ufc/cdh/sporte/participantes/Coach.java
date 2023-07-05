package ufc.cdh.sporte.participantes;

import ufc.cdh.sporte.times.TimeAbstrato;

public class Coach extends Participante{
    public Coach(String nome, TimeAbstrato time, int idade){
        super(nome, time, idade);
    }
}
