package ufc.cdh.sporte.torneio;

public class SingleElimination extends Tournament {
    
    public SingleElimination(boolean isSeeded){
        super(isSeeded);
    }
    public void generateBracket() {
		bracket = new Bracket();
                org.Ordenar();
                for(int i = 0; i < 7; i++){
                    Match m = new Match(i, bracket);
                    bracket.insertMatch(m);
                }
    }
	
}
