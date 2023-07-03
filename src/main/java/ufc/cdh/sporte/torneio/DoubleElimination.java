package ufc.cdh.sporte.torneio;

public class DoubleElimination extends Tournament {
	
	Bracket upperBracket;
	Bracket lowerBracket;
	
	public DoubleElimination(boolean isSeeded){
            super(isSeeded);
            this.upperBracket = new Bracket();
            this.lowerBracket = new Bracket();
	}
        
        public void generateBracket() {
                org.Ordenar();
                for(int i = 0; i < 8; i++){
                    Match m = new Match(i, upperBracket);
                    upperBracket.insertMatch(m);
                }
                for(int i = 0; i < 6; i++){
                    Match m = new Match(i, lowerBracket);
                    lowerBracket.insertMatch(m);
                }
    }
}
