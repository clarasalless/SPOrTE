package ufc.cdh.sporte.controladores;

import java.io.Serializable;
import java.util.Vector;

import ufc.cdh.sporte.times.*;
import ufc.cdh.sporte.times.excecao.TimeExistenteException;
import ufc.cdh.sporte.times.excecao.TimeInexistenteException;

public class ControladorTimes implements Serializable{
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
		try{
                    times.inserirTime(time);
		}
                catch(TimeExistenteException e){
                    System.out.println(e.getMessage());
                }
	}
	
	//remove um time do vetor de times
	public void removerTime(TimeAbstrato time) {
		try{
                    times.removerTime(time);
		}
                catch(TimeInexistenteException e){
                    System.out.println(e.getMessage());
                }
	}
	
	//busca um time pela posição no vetor
	public TimeAbstrato buscaTime(int i) {
		return times.buscaTime(i);
	}
	
        public TimeAbstrato getTime(String nome) {
		return times.getTime(nome);
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