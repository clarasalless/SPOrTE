package ufc.cdh.sporte.organizadordetimes;

import ufc.cdh.sporte.organizadordetimes.times.TimeAbstrato;
import ufc.cdh.sporte.organizadordetimes.times.TimeSeeded;


public class OrganizadorSeeded extends OrganizadorAbstrato {
    public OrganizadorSeeded(){
        super();
    }
    public void Ordenar(){
        if(times.size() >= 2){
            TimeAbstrato aux;
            for (int i = 0; i < times.size() - 1; i++){
                if(((TimeSeeded)times.get(i)).getSeed() >= ((TimeSeeded)times.get(i+1)).getSeed()){
                    aux = times.get(i+1);
                    times.set(i + 1, times.get(i));
                    times.set(i, aux);
                }
            }
        }
    }
    public void CadastrarTime(String nome, int seed){
        TimeSeeded time = new TimeSeeded(nome, seed);
        times.add(time);
    }
}
