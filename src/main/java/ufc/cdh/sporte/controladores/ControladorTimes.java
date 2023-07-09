package ufc.cdh.sporte.controladores;

import java.util.Vector;

import ufc.cdh.sporte.times.*;

public class ControladorTimes {
	private VectorTimes times;
	
	public ControladorTimes(VectorTimes times) {
		this.times = times;
	}
	
	//retorna o vetor de times
	public VectorTimes getTimes() {
		return this.times;
	}
	
	//insere um time no vetor de times
	public void inserirTime(TimeAbstrato time) {
		if(!times.timeExiste(time.getNome())){
			times.inserirTime(time);
		}
	}
	
	//remove um time do vetor de times
	public void removerTime(TimeAbstrato time) {
		if(times.timeExiste(time.getNome())){
			times.removerTime(time);
		}
	}
	
	//busca um time pela posição no vetor
	public TimeAbstrato buscaTime(int i) {
		return times.buscaTime(i);
	}
	
	//utiliza o nome do time para verificar se ele ja foi cadstrado	
	public boolean timeExiste(String nome) {
		return times.timeExiste(nome);
	}
	
	//embaralha os times no vetor
	public Vector<TimeAbstrato> embaralhaTimes(){
		return times.embaralhaTimes();
	}
	
	public void ordenaTimes() {
		times.ordenaTimes(times.getTimes());
	}
	
	//ordena os times do vetor pelo seed
	public int numeroDeTimes(){
		return times.numeroDeTimes();
	}	
		
}