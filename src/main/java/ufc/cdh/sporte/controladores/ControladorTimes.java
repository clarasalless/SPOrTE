package ufc.cdh.sporte.controladores;

import java.util.Vector;

import ufc.cdh.sporte.times.*;

public class ControladorTimes {
	private VectorTimes times;
	
	public ControladorTimes(VectorTimes times) {
		this.times = times;
	}
	
	public VectorTimes getTimes() {
		return this.times;
	}
	
	public void inserirTime(TimeAbstrato time) {
		if(!times.timeExiste(time.getNome())){
			times.inserirTime(time);
		}
	}
	
	public void removerTime(TimeAbstrato time) {
		if(times.timeExiste(time.getNome())){
			times.removerTime(time);
		}
	}
	
	public TimeAbstrato buscaTime(int i) {
		return times.buscaTime(i);
	}
	
	public boolean timeExiste(String nome) {
		return times.timeExiste(nome);
	}
	
	public Vector<TimeAbstrato> embaralhaTimes(){
		return times.embaralhaTimes();
	}
	
	public void ordenaTimes() {
		times.ordenaTimes(times.getTimes());
	}
	
	public int numeroDeTimes(){
		return times.numeroDeTimes();
	}	
		
}