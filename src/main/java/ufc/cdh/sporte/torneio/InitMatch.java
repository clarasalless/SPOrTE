package ufc.cdh.sporte.torneio;

public class InitMatch extends AbstractMatch {
	private TeamArray teams;
	
	public InitMatch(int id, TeamArray teams) {
		super(id);
		this.teams = teams;
	}
	
	@Override
	public void setTeamA() {
		if(this.getID() == 1)
			this.teamA = teams.searchTeam(0);
		
		if(this.getID() == 2)
			this.teamA = teams.searchTeam(3);
		
		if(this.getID() == 3)
			this.teamA = teams.searchTeam(1);
		
		if(this.getID() == 4)
			this.teamA = teams.searchTeam(2);
	}

	@Override
	public void setTeamB() {
		if(this.getID() == 1)
			this.teamB = teams.searchTeam(7);
		
		if(this.getID() == 2)
			this.teamB = teams.searchTeam(4);
		
		if(this.getID() == 3)
			this.teamB = teams.searchTeam(6);
		
		if(this.getID() == 4)
			this.teamB = teams.searchTeam(5);

	}

}
