package ufc.cdh.sporte.torneio;

public class Match extends AbstractMatch {
	private Bracket bracket;
	
	public Match(int id, Bracket bracket) {
		super(id);
		this.bracket = bracket;
	}
	
	@Override
	public void setTeamA() {
		if(this.getID() == 5) 
			this.teamA = this.bracket.searchMatch(1).getWinner();
		
		if(this.getID() == 6) 
			this.teamA = this.bracket.searchMatch(3).getWinner();
		
		if(this.getID() == 7) 
			this.teamA = this.bracket.searchMatch(5).getWinner();
	}

	@Override
	public void setTeamB() {
		if(this.getID() == 5) 
			this.teamA = this.bracket.searchMatch(2).getWinner();
		
		if(this.getID() == 6) 
			this.teamA = this.bracket.searchMatch(4).getWinner();
		
		if(this.getID() == 7) 
			this.teamA = this.bracket.searchMatch(6).getWinner();
	}

}
