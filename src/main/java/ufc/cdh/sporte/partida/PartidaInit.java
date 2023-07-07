package ufc.cdh.sporte.partida;

import ufc.cdh.sporte.times.VectorTimes;

public class PartidaInit extends PartidaAbstrata {
	private VectorTimes times;
	
	public PartidaInit(int id, VectorTimes times) {
		super(id);
		this.times = times;
	}
	
	@Override
	//usa o vetor de times do campeonato para obter o time A dos primeiros jogos da chave pelo vetor de times
	public void setTimeA() {
		
		//jogo 1: timeA = seed #1
		if(this.getID() == 1)
			this.timeA = times.buscaTime(0);
		
		//jogo 2: timeA = seed #4
		if(this.getID() == 2)
			this.timeA = times.buscaTime(3);
		
		//jogo 3: timeA = seed #2
		if(this.getID() == 3)
			this.timeA = times.buscaTime(1);
		
		//jogo 4: timeA = seed #3
		if(this.getID() == 4)
			this.timeA = times.buscaTime(2);
	}

	@Override
	
	//usa o vetor de times do campeonato para obter o time B dos primeiros jogos da chave pelo vetor de times
	public void setTimeB() {

		//jogo 1: timeB = seed #8
		if(this.getID() == 1)
			this.timeB = times.buscaTime(7);
		
		//jogo 2: timeB = seed #5
		if(this.getID() == 2)
			this.timeB = times.buscaTime(4);
		
		//jogo 3: timeB = seed #7
		if(this.getID() == 3)
			this.timeB = times.buscaTime(6);
		
		//jogo 4: timeB = seed #6
		if(this.getID() == 4)
			this.timeB = times.buscaTime(5);

	}

}
