package ufc.cdh.sporte.torneio;

public class TeamArray {
	private Team teams[];
	private int number;
	
	public TeamArray(int number) {
		this.number = number;
		this.teams = new Team[number];
	}
	
	//insere um novo time no repositorio
	public void insertTeam(Team team) {
		if(team != null) {
			teams[team.getSeed()-1] = team;
		}
	}
	
	//retorna uma lista de times 
	public Team[] listTeams() {
		Team[] list = null;
	    if (this.numberOfTeams() > 0) {
	      list = new Team[this.numberOfTeams()];
	      for (int i = 0; i < this.numberOfTeams(); i++) {
	        list[i] = this.teams[i];
	      }
	    }
	    return list;
	}
	
	//retorna o numero de times do torneio
	public int numberOfTeams() {
		return this.number;
	}
}
