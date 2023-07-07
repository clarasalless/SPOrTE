package ufc.cdh.sporte.times.excecao;

import ufc.cdh.sporte.times.VectorTimes;

public class TimesInsuficientesException extends Exception {
	private VectorTimes times;

	public TimesInsuficientesException(VectorTimes times) {
		super("Numero de times cadastrados insuficiente!");
		this.times = times;
	}

	public VectorTimes getTimes() {
		return this.times;
	}
}
