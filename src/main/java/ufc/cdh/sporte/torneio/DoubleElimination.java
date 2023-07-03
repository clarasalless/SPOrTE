package ufc.cdh.sporte.torneio;

public class DoubleElimination extends Tournament {
	
	Bracket upperBracket;
	Bracket lowerBracket;
	
	public DoubleElimination(boolean isSeeded){
            super(isSeeded);
            this.upperBracket = new Bracket();
            this.lowerBracket = new Bracket();
	}
}
