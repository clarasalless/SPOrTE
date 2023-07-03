package ufc.cdh.sporte.torneio;

public class SingleElimination extends Tournament {
    
    public SingleElimination(boolean isSeeded){
        super(isSeeded);
    }
    public void generateBracket() {
		bracket = new Bracket();
                org.Ordenar();
                for(int i = 0; i < org.getTamanho()/2; i++){
                    Match m = new Match(i, bracket);
                    m.setTeamA(org.getTimes().get(i));
                    m.setTeamB(org.getTimes().get(org.getTamanho()-i-1));
                    bracket.insertMatch(m);
                }
    }
	
}
