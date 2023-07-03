package ufc.cdh.sporte.torneio;

public class Match extends AbstractMatch {
	private Bracket bracket;
	
	public Match(int id, Bracket bracket) {
		super(id);
		this.bracket = bracket;
	}
	
	
	@Override
	//obtém o time A do jogo a partir o vencedor do jogo anterior
	public void setTeamA() {
		
		//jogo 5: time A = vencedor jogo 1
		if(this.getID() == 5) 
			this.teamA = this.bracket.searchMatch(1).getWinner();
		
		//jogo 6: time A = vencedor jogo 3
		if(this.getID() == 6) 
			this.teamA = this.bracket.searchMatch(3).getWinner();
		
		//jogo 7: time A = vencedor jogo 5
		if(this.getID() == 7) 
			this.teamA = this.bracket.searchMatch(5).getWinner();
	}

	@Override
	//obtém o time B do jogo a partir o vencedor do jogo anterior
	public void setTeamB() {
		
		//jogo 5: time A = vencedor jogo 2
		if(this.getID() == 5) 
			this.teamA = this.bracket.searchMatch(2).getWinner();
		
		//jogo 6: time A = vencedor jogo 4
		if(this.getID() == 6) 
			this.teamA = this.bracket.searchMatch(4).getWinner();
		
		//jogo 7: time A = vencedor jogo 6
		if(this.getID() == 7) 
			this.teamA = this.bracket.searchMatch(6).getWinner();
	}

}
