package ufc.cdh.sporte.times.excecao;

import ufc.cdh.sporte.times.TimeAbstrato;

public class TimeInexistenteException extends Exception {
	private String nome; 
	
	public TimeInexistenteException(String nome) {
		super("Não existe um time cadastrado com esse nome!");
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
