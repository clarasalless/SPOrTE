package ufc.cdh.sporte.torneio;

public class Team {
	private String name;
	private int seed;
	//Participant members[];	
	public Team(String name, int seed) {
		this.name = name;
		this.seed = seed;
	}
	
	//retorna o nome do time
	public String getName() {
		return this.name;
	}
	
	//retorna a seed da classificação
	public int getSeed() {
		return this.seed;
	}
}
