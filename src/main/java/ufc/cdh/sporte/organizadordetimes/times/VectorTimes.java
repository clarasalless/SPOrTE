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
	
	//ordena os times pelo seed (bubble sort)
	public void ordenaTimes(Vector<TimeAbstrato> times) {
        int n = times.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (((TimeSeeded)times.get(j)).getSeed() > ((TimeSeeded)times.get(j + 1)).getSeed()) {
                    TimeSeeded temp = ((TimeSeeded)times.get(j));
                    times.set(j, times.get(j + 1));
                    times.set(j + 1, temp);
                }
            }
        }
    }

	//retorna o numero de times do torneio
	public int numeroDeTimes() {
		return this.times.size();
	}
}