package ufc.cdh.sporte.torneio.partida;

import ufc.cdh.sporte.torneio.Chave;

public class PartidaSingleElimination extends PartidaAbstrata {
	private Chave chave;
	
	public PartidaSingleElimination(int id, Chave chave) {
		super(id);
		this.chave = chave;
	}
	
	@Override
	public void setTimeA() {
		//jogo 5: timeA = vencedor jogo 1
		if(this.getID() == 5) 
			this.timeA = chave.buscaPartida(1).getVencedor();
				
		//jogo 6: timeA = vencedor jogo 3
		if(this.getID() == 6) 
			this.timeA = chave.buscaPartida(3).getVencedor();
				
		//jogo 7: timeA = vencedor jogo 5
		if(this.getID() == 7) 
			this.timeA = chave.buscaPartida(5).getVencedor();		
	}

	@Override
	public void setTimeB() {
		//jogo 5: timeB = vencedor jogo 2
		if(this.getID() == 5) 
			this.timeA = chave.buscaPartida(2).getVencedor();
						
		//jogo 6: timeB = vencedor jogo 4
		if(this.getID() == 6) 
			this.timeA = chave.buscaPartida(4).getVencedor();
						
		//jogo 7: timeB = vencedor jogo 6
		if(this.getID() == 7) 
			this.timeA = chave.buscaPartida(6).getVencedor();	
	}

}
