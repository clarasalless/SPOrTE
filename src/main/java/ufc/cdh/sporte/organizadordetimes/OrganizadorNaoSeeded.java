package ufc.cdh.sporte.organizadordetimes;

import java.util.Vector;
import java.util.Collections;
import ufc.cdh.sporte.organizadordetimes.times.TimeNaoSeeded;

public class OrganizadorNaoSeeded extends OrganizadorAbstrato{
    public OrganizadorNaoSeeded(){
        super();
    }
    public void Ordenar(){
        Collections.shuffle(times);
    }
    public void CadastrarTime(String nome){
        TimeNaoSeeded time = new TimeNaoSeeded(nome);
        times.add(time);
    }
}
