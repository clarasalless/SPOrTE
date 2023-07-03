package ufc.cdh.sporte.torneio;

import ufc.cdh.sporte.organizadordetimes.times.TimeAbstrato;

public class Match extends AbstractMatch {
	private Bracket bracket;
	public Match(int id, Bracket bracket) {
		super(id);
		this.bracket = bracket;
	}
	
	public void setTeamA(TimeAbstrato time) {
		teamA = time;
	}

	public void setTeamB(TimeAbstrato time) {
		teamB = time;
	}

}
