package ufc.cdh.sporte.times.excecao;

import ufc.cdh.sporte.times.TimeAbstrato;

public class TimeExistenteException extends Exception {
	private TimeAbstrato time; 
	
	public TimeExistenteException(TimeAbstrato time) {
		super("Ja existe um time com este nome!");
		this.time = time;
	}
	
	public TimeAbstrato getTime() {
		return this.time;
	}
}
