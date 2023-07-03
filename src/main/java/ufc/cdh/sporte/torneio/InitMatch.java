package ufc.cdh.sporte.torneio;

public class InitMatch extends AbstractMatch {
	private TeamArray teams;
	
	public InitMatch(int id, TeamArray teams) {
		super(id);
		this.teams = teams;
	}
	
	@Override
	//usa o vetor de times do campeonato para obter o time A dos primeiros jogos da chave pelo seed
	public void setTeamA() {
		
		//jogo 1: timeA = seed #1
		if(this.getID() == 1)
			this.teamA = teams.searchTeam(1);
		
		//jogo 2: timeA = seed #4
		if(this.getID() == 2)
			this.teamA = teams.searchTeam(4);
		
		//jogo 3: timeA = seed #2
		if(this.getID() == 3)
			this.teamA = teams.searchTeam(2);
		
		//jogo 4: timeA = seed #3
		if(this.getID() == 4)
			this.teamA = teams.searchTeam(3);
	}

	@Override
	//usa o vetor de times do campeonato para obter o time B dos primeiros jogos da chave pelo seed
	public void setTeamB() {

		//jogo 1: timeB = seed #8
		if(this.getID() == 1)
			this.teamB = teams.searchTeam(8);
		
		//jogo 2: timeB = seed #5
		if(this.getID() == 2)
			this.teamB = teams.searchTeam(5);
		
		//jogo 3: timeB = seed #7
		if(this.getID() == 3)
			this.teamB = teams.searchTeam(7);
		
		//jogo 4: timeB = seed #6
		if(this.getID() == 4)
			this.teamB = teams.searchTeam(6);

	}

}
