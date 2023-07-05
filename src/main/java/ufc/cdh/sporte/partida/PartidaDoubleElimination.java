package ufc.cdh.sporte.partida;

import ufc.cdh.sporte.torneio.Chave;

public class PartidaDoubleElimination extends PartidaAbstrata {
	private Chave chave;
	public PartidaDoubleElimination(int id, Chave chave) {
		super(id);
		this.chave = chave;
	}
	
	@Override
	//usa a chave de partidas do campeonato para obter o time A dos jogos seguintes
	public void setTimeA() {
		//jogo 5: timeA = perdedor jogo 1
		if(this.getID() == 5) 
			this.timeA = chave.buscaPartida(1).getPerdedor();
		
		//jogo 6: timeA = perdedor jogo 3
		if(this.getID() == 6) 
			this.timeA = chave.buscaPartida(3).getPerdedor();
		
		//jogo 7: timeA = vencedor jogo 1
		if(this.getID() == 7) 
			this.timeA = chave.buscaPartida(1).getVencedor();
		
		//jogo 8: timeA = vencedor jogo 3
		if(this.getID() == 8) 
			this.timeA = chave.buscaPartida(3).getVencedor();
		
		//jogo 9: timeA = perdedor jogo 8
		if(this.getID() == 9) 
			this.timeA = chave.buscaPartida(8).getPerdedor();
		
		//jogo 10: timeA = perdedor jogo 7
		if(this.getID() == 10) 
			this.timeA = chave.buscaPartida(7).getPerdedor();
		
		//jogo 11: timeA = vencedor jogo 9
		if(this.getID() == 11) 
			this.timeA = chave.buscaPartida(9).getVencedor();
		
		//jogo 12: timeA = vencedor jogo 7
		if(this.getID() == 12) 
			this.timeA = chave.buscaPartida(7).getVencedor();
		
		//jogo 13: timeA = perdedor jogo 12
		if(this.getID() == 13) 
			this.timeA = chave.buscaPartida(12).getPerdedor();
		
		//grande final:
		
		//jogo 14: timeA = vencedor jogo 12
		if(this.getID() == 14) 
			this.timeA = chave.buscaPartida(12).getVencedor();
	}

	@Override
	
	//usa a chave de partidas do campeonato para obter o time B dos jogos seguintes
	public void setTimeB() {
		//jogo 5: timeB = perdedor jogo 2
		if(this.getID() == 5) 
			this.timeB = chave.buscaPartida(2).getPerdedor();
				
		//jogo 6: timeB = perdedor jogo 4
		if(this.getID() == 6) 
			this.timeB = chave.buscaPartida(4).getPerdedor();
				
		//jogo 7: timeB = vencedor jogo 2
		if(this.getID() == 7) 
			this.timeB = chave.buscaPartida(2).getVencedor();
				
		//jogo 8: timeB = vencedor jogo 4
		if(this.getID() == 8) 
			this.timeB = chave.buscaPartida(4).getVencedor();
				
		//jogo 9: timeB = vencedor jogo 5
		if(this.getID() == 9) 
			this.timeB = chave.buscaPartida(5).getVencedor();
				
		//jogo 10: timeB = vencedor jogo 6
		if(this.getID() == 10) 
			this.timeB = chave.buscaPartida(6).getVencedor();
				
		//jogo 11: timeB = vencedor jogo 10
		if(this.getID() == 11) 
			this.timeB = chave.buscaPartida(10).getVencedor();
		
		//jogo 12: timeB = vencedor jogo 8
		if(this.getID() == 12) 
			this.timeB = chave.buscaPartida(8).getVencedor();
				
		//jogo 13: timeB = vencedor jogo 11
		if(this.getID() == 13) 
			this.timeB = chave.buscaPartida(11).getVencedor();
				
		//grande final:
				
		//jogo 14: timeB = vencedor jogo 13
		if(this.getID() == 14) 
			this.timeB = chave.buscaPartida(13).getVencedor();
	}

}
