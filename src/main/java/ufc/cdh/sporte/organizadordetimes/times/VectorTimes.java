package ufc.cdh.sporte.organizadordetimes.times;

import java.util.Collections;
import java.util.Vector;


public class VectorTimes {
	private Vector<TimeAbstrato> times;
	
	public VectorTimes() {
		this.times = new Vector<TimeAbstrato>();
	}
	
	//retorna o vetor de times 
	public Vector<TimeAbstrato> getTimes() {
		return this.times;
	}
	
	//insere um novo time no repositorio
	public void inserirTime(TimeAbstrato time) {
		if(time != null) 
			this.times.add(time);
	}
	
	//remove um time do repositório
	public void removerTime(TimeAbstrato time) {
		this.times.remove(time);
	}
	
	//busca um time 
	public TimeAbstrato buscaTime(int i) {
		return times.get(i);
	}
	
	//ordena os times de forma aleatória
	public Vector<TimeAbstrato> embaralhaTimes(){
		Collections.shuffle(this.times);
		return this.times;
	}
	
	//ordena os times pelo seed
	public Vector<TimeAbstrato> ordenaTimes(){
		if(times.size() >= 2){
            TimeAbstrato aux;
            for (int i = 0; i < times.size() - 1; i++){
                if(((TimeSeeded)times.get(i)).getSeed() >= ((TimeSeeded)times.get(i+1)).getSeed()){
                    aux = times.get(i+1);
                    times.set(i + 1, times.get(i));
                    times.set(i, aux);
                }
            }
            return this.times;
        }
		else 
			return this.times;
	}
	
	//retorna o numero de times do torneio
	public int numeroDeTimes() {
		return this.times.size();
	}
}