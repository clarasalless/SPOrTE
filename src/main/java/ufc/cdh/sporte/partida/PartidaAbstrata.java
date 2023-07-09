package ufc.cdh.sporte.partida;

import java.io.Serializable;
import ufc.cdh.sporte.times.TimeAbstrato;

public abstract class PartidaAbstrata implements Serializable{
	protected TimeAbstrato timeA = null;
	protected TimeAbstrato timeB = null;
	private TimeAbstrato vencedor = null;
	private TimeAbstrato perdedor = null;
	private int placarA = 0;
	private int placarB = 0;
	private int id;
	
	
	public PartidaAbstrata(int id) {
		this.id = id;
	}
	
	//retorna o time A do jogo
	public TimeAbstrato getTimeA() {
		return this.timeA;
	}
	
	//retorna o time B do jogo
	public TimeAbstrato getTimeB() {
		return this.timeB;
	}
	
	//retorna o vencedor do jogo
	public TimeAbstrato getVencedor() {
		return this.vencedor;
	}
	
	//retorna perdedor do jogo
	public TimeAbstrato getPerdedor() {
		return this.perdedor;
	}
	
	//retorna o placar do time A
	public int getPlacarA() {
		return this.placarA;
	}
	
	//retorna o placar do time B
	public int getPlacarB() {
		return this.placarB;
	}
	
	//retorna o id (número) do jogo 
	public int getID() {
		return this.id;
	}
	
	//determina o time A 
	public abstract void setTimeA(); 
	
	//determina o time B
	public abstract void setTimeB(); 
	
	//determina o time vencedor do jogo
	public void setVencedor(TimeAbstrato team) {
		this.vencedor = team;
	}
	
	//determina o time perdedor do jogo
	public void setPerdedor(TimeAbstrato team) {
		this.perdedor = team;
	}
	
	//determina o placar do time A
	public void setPlacarA(int score) {
		this.placarA = score;
	}
	
	//determina o placar do time B
	public void setPlacarB(int score) {
		this.placarB = score;
	}
}
