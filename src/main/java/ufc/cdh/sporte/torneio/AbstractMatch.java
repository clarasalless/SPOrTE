package ufc.cdh.sporte.torneio;

import ufc.cdh.sporte.organizadordetimes.times.TimeAbstrato;

public abstract class AbstractMatch {
	protected TimeAbstrato teamA = null;
	protected TimeAbstrato teamB = null;
	private TimeAbstrato winner = null;
	private TimeAbstrato loser = null;
	private int scoreA = 0;
	private int scoreB = 0;
	private int id;
	
	
	public AbstractMatch(int id) {
		this.id = id;
	}
	
	//retorna o time A do jogo
	public TimeAbstrato getTeamA() {
		return this.teamA;
	}
	
	//retorna o time B do jogo
	public TimeAbstrato getTeamB() {
		return this.teamB;
	}
	
	//retorna o vencedor do jogo
	public TimeAbstrato getWinner() {
		return this.winner;
	}
	
	//retorna perdedor do jogo
	public TimeAbstrato getLoser() {
		return this.loser;
	}
	
	//retorna o placar do time A
	public int getScoreA() {
		return this.scoreA;
	}
	
	//retorna o placar do time B
	public int getScoreB() {
		return this.scoreB;
	}
	
	//retorna o id (número) do jogo 
	public int getID() {
		return this.id;
	}
	
	//determina o time A 
	public abstract void setTeamA(TimeAbstrato time); 
	
	//determina o time B
	public abstract void setTeamB(TimeAbstrato time); 
	
	//determina o time vencedor do jogo
	public void setWinner(TimeAbstrato team) {
		this.winner = team;
	}
	
	//determina o time perdedor do jogo
	public void setLoser(TimeAbstrato team) {
		this.loser = team;
	}
	
	//determina o placar do time A
	public void setScoreA(int score) {
		this.scoreA = score;
	}
	
	//determina o placar do time B
	public void setScoreB(int score) {
		this.scoreB = score;
	}
}
