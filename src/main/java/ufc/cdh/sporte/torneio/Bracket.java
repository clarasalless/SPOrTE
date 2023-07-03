package ufc.cdh.sporte.torneio;

import java.util.Vector;

public class Bracket {
	private Vector<AbstractMatch> matches;
	
	public Bracket() {
		this.matches = new Vector<AbstractMatch>();
	}
	
	//insere um jogo na chave
	public void insertMatch(AbstractMatch match) {
		this.matches.add(match);
	}
	
	//busca um jogo pela id (numero)
	public AbstractMatch searchMatch(int number) {
		for(AbstractMatch match : this.matches) {
			if(match.getID() == number)
				return match;
		}
		return null;
	}
	
        public Vector<AbstractMatch> getMatches(){
            return matches;
        }
}
