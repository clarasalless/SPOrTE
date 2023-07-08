package ufc.cdh.sporte.controladores;

import java.util.Vector;

import ufc.cdh.sporte.times.*;
import ufc.cdh.sporte.times.excecao.TimeExistenteException;
import ufc.cdh.sporte.times.excecao.TimeInexistenteException;

public class ControladorTimes {
	private VectorTimes times;
	
	public ControladorTimes(VectorTimes times) {
		this.times = times;
	}
	
	public VectorTimes getTimes() {
		return this.times;
	}
	
	public void inserirTime(TimeAbstrato time) {
		try{
                    times.inserirTime(time);
		}
                catch(TimeExistenteException e){
                    System.out.println(e.getMessage());
                }
	}
	
	public void removerTime(TimeAbstrato time) {
		try{
                    times.removerTime(time);
		}
                catch(TimeInexistenteException e){
                    System.out.println(e.getMessage());
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