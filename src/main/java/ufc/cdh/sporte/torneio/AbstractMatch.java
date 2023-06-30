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
	
	public Team getTeamA() {
		return this.teamA;
	}
	
	public Team getTeamB() {
		return this.teamB;
	}
	
	public Team getWinner() {
		return this.winner;
	}
	
	public Team getLoser() {
		return this.loser;
	}
	
	public int getScoreA() {
		return this.scoreA;
	}
	
	public int getScoreB() {
		return this.scoreB;
	}
	
	public int getID() {
		return this.id;
	}
	
	public abstract void setTeamA(); 
	
	public abstract void setTeamB(); 
	
	public void setWinner(Team team) {
		this.winner = team;
	}
	
	public void setLoser(Team team) {
		this.loser = team;
	}
	
	public void setScoreA(int score) {
		this.scoreA = score;
	}
	
	public void setScoreB(int score) {
		this.scoreB = score;
	}
}
