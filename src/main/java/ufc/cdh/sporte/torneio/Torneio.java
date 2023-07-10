package ufc.cdh.sporte.torneio;

import java.io.Serializable;
import ufc.cdh.sporte.controladores.*;
import ufc.cdh.sporte.partida.PartidaAbstrata;
import ufc.cdh.sporte.times.*;
import ufc.cdh.sporte.times.excecao.TimeExistenteException;

public abstract class Torneio implements Serializable{
	private String nome;
	private ControladorTimes contTimes;
	private ControladorPartidas contPartidas;
	protected Chave bracket;
	protected VectorTimes times;
        private boolean isSeeded;
        
	public Torneio(String nome,boolean isSeeded){
		this.nome = nome;
		this.times = new VectorTimes();
		this.bracket = new Chave();
                this.isSeeded = isSeeded;
		
		if(isSeeded){
			times.ordenaTimes(times.getTimes());
        }
		else{
            times.embaralhaTimes();
        }
		
		contTimes = new ControladorTimes(times);
		contPartidas = new ControladorPartidas(bracket);
    }
    
	//retorna o nome do torneio
	public String getNome() {
		return this.nome;
	}
    
	//retorna o vetor de times do torneio
	public VectorTimes getTimes() {
		return this.times;
	}
	
	//retorna a chave do torneio (repositorio de partidas)
	public Chave getChave() {
		return this.bracket;
	}
        
        public boolean getSeeded(){
            return isSeeded;
        }
	
	//cadastra um time no repositorio de times do torneio
	public void cadastrarTime(TimeAbstrato time) throws TimeExistenteException{
		contTimes.inserirTime(time);
	}
	
	//remove um time do repositorio de times do torneio
	public void removerTime(TimeAbstrato time) {
		contTimes.removerTime(time);
	}
	
	//procura um time pela posição em que ele se encontra no vetor 
	public TimeAbstrato getTime(String nome) {
		return contTimes.getTime(nome);
	}
        
        public TimeAbstrato buscaTime(int i) {
		return contTimes.buscaTime(i);
	}
	
	//verirfica se um time já foi cadastrado no repositorio
	public boolean timeExiste(String nome) {
		return contTimes.timeExiste(nome);
	}
	
	//retorna a quantidade de times cadastrados no repositorio de times do torneio
	public int numeroDeTimes() {
		return contTimes.numeroDeTimes();
	}
	
	public PartidaAbstrata buscaPartida(int id) {
		return contPartidas.buscaPartida(id);
	}
	
    
    public abstract void geraChave();
    
}
