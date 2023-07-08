package ufc.cdh.sporte.times;

import java.util.Collections;
import java.util.Vector;
import ufc.cdh.sporte.times.excecao.TimeExistenteException;
import ufc.cdh.sporte.times.excecao.TimeInexistenteException;

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
	public void inserirTime(TimeAbstrato time) throws TimeExistenteException{
		if(time != null && !timeExiste(time.getNome())){ 
			this.times.add(time);
                }
                else{
                    throw new TimeExistenteException(time);
                }
	}
	
	//remove um time do repositório
	public void removerTime(TimeAbstrato time) throws TimeInexistenteException{
            if(!timeExiste(time.getNome())){
                throw new TimeInexistenteException(time.getNome());
            }
            this.times.remove(time);
	}
	
	//busca um time pela sua posição no vet 
	public TimeAbstrato buscaTime(int i) {
		return times.get(i);
	}
	
	//verifica se existe algum time com o nome passado no repositório
	public boolean timeExiste(String nome) {
		for(TimeAbstrato time : times) {
			if(time.getNome().equals(nome))
				return true;
		}
		return false;
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