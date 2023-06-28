package ufc.cdh.sporte.torneio;

public class InitMatch extends AbstractMatch {
	private Team teams[];
	
	public InitMatch(int number, Team teams[]) {
		super(number);
		this.teams = teams;
	}
	
	@Override
	public void setTeamA() {
		if(this.getNumber() == 1)
			this.teamA = teams[0];
		
		if(this.getNumber() == 2)
			this.teamA = teams[3];
		
		if(this.getNumber() == 3)
			this.teamA = teams[1];
		
		if(this.getNumber() == 4)
			this.teamA = teams[2];
	}

	@Override
	public void setTeamB() {
		if(this.getNumber() == 1)
			this.teamB = teams[7];
		
		if(this.getNumber() == 2)
			this.teamB = teams[4];
		
		if(this.getNumber() == 3)
			this.teamB = teams[6];
		
		if(this.getNumber() == 4)
			this.teamB = teams[5];

	}

}
