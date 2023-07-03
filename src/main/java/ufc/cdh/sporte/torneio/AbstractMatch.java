package ufc.cdh.sporte.torneio;

public abstract class AbstractMatch {
	protected Team teamA = null;
	protected Team teamB = null;
	private Team winner = null;
	private Team loser = null;
	private int scoreA = 0;
	private int scoreB = 0;
	private int id;
	
	
	public AbstractMatch(int id) {
		this.id = id;
	}
	
	
	//retorna o time A do jogo
	public Team getTeamA() {
		return this.teamA;
	}
	
	//retorna o time B do jogo
	public Team getTeamB() {
		return this.teamB;
	}
	
	//retorna o vencedor do jogo
	public Team getWinner() {
		return this.winner;
	}
	
	//retorna perdedor do jogo
	public Team getLoser() {
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
	public abstract void setTeamA(); 
	
	//determina o time B
	public abstract void setTeamB(); 
	
	//determina o time vencedor do jogo
	public void setWinner(Team team) {
		this.winner = team;
	}
	
	//determina o time perdedor do jogo
	public void setLoser(Team team) {
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
