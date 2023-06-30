package ufc.cdh.sporte.torneio;

import java.util.Vector;

public class Bracket {
	private Vector<AbstractMatch> matches;
	
	public Bracket() {
		this.matches = new Vector<AbstractMatch>();
	}
	
	
	
	public void insertMatch(AbstractMatch match) {
		this.matches.add(match.getID()-1,match);
	}
	
	public AbstractMatch searchMatch(int number) {
		for(AbstractMatch match : this.matches) {
			if(match.getID() == number)
				return match;
		}
		return null;
	}
	
}
