package ufc.cdh.sporte.torneio;

public class DoubleElimination extends Tournament {
	
	Bracket upperBracket[];
	Bracket lowerBracket[];
	
	public DoubleElimination(Bracket upperBracket[], Bracket lowerBracket[]) {
		
		this.upperBracket = upperBracket;
		this.lowerBracket = lowerBracket;
	}
}
