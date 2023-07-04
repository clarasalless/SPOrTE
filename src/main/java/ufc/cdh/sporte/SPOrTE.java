package ufc.cdh.sporte;

import ufc.cdh.sporte.organizadordetimes.*;
import ufc.cdh.sporte.organizadordetimes.participantes.*;
import ufc.cdh.sporte.organizadordetimes.times.*;
import ufc.cdh.sporte.torneio.*;
import ufc.cdh.sporte.torneio.partida.*;

public class SPOrTE {

    public static void main(String[] args) {
    	boolean isSeeded;
    	System.out.println("********************************");
    	System.out.println("DOUBLE ELIMINATION / SEM SEED");
    	System.out.println("********************************");
    	//CRIAÇÃO DE TIMES E ADIÇÃO NO VETOR:
    	isSeeded = false;
    	VectorTimes times = new VectorTimes();
    	
    	TimeNaoSeeded time1 = new TimeNaoSeeded("PRX");
    	times.inserirTime(time1);
    	TimeNaoSeeded time2 = new TimeNaoSeeded("DRX");
    	times.inserirTime(time2);
    	TimeNaoSeeded time3 = new TimeNaoSeeded("FNC");
    	times.inserirTime(time3);
    	TimeNaoSeeded time4 = new TimeNaoSeeded("NRG");
    	times.inserirTime(time4);
    	TimeNaoSeeded time5 = new TimeNaoSeeded("LIQ");
    	times.inserirTime(time5);
    	TimeNaoSeeded time6 = new TimeNaoSeeded("EDG");
    	times.inserirTime(time6);
    	TimeNaoSeeded time7 = new TimeNaoSeeded("LOUD");
    	times.inserirTime(time7);
    	TimeNaoSeeded time8 = new TimeNaoSeeded("EG");
    	times.inserirTime(time8);
    	
    	//IMPRIME OS TIMES CADASTRADOS
        System.out.println("Times Cadastrados:");
        for(int i = 0; i < 8; i++) {
        	System.out.println(times.buscaTime(i).getNome());
        }
        System.out.println("--------------------------------");
        
        //CRIA TORNEIO E GERA AS CHAVES
        Torneio t = new EliminacaoDupla(times,isSeeded);
        t.geraChave();
        Chave bracket = t.getBracket();
        
        //PREENCHE AS PARTIDAS INICIAIS DA CHAVE
        System.out.println("Rodada 1");
        System.out.println("--------------------------------");
        for(int i = 1; i <= 4; i++) {
        	bracket.buscaPartida(i).setTimeA();
        	bracket.buscaPartida(i).setTimeB();
        	System.out.printf("partida %d:\n", i);
        	System.out.println(bracket.buscaPartida(i).getTimeA().getNome());
        	System.out.println(bracket.buscaPartida(i).getTimeB().getNome());
        	
        	//ESCOLHE OS VENCEDORES (RODADA1)
        	TimeNaoSeeded timeA = (TimeNaoSeeded)bracket.buscaPartida(i).getTimeA();
        	bracket.buscaPartida(i).setVencedor(timeA);
        	TimeNaoSeeded timeB = (TimeNaoSeeded)bracket.buscaPartida(i).getTimeB();
        	bracket.buscaPartida(i).setPerdedor(timeB);
        	System.out.printf("Vencedor: %s\n",bracket.buscaPartida(i).getVencedor().getNome());
        }
        System.out.println("--------------------------------");
        
        System.out.println("Rodadas Seguintes");
        System.out.println("--------------------------------");
        for(int i = 5; i <= 14; i++) {
        	bracket.buscaPartida(i).setTimeA();
        	bracket.buscaPartida(i).setTimeB();
        	System.out.printf("partida %d:\n", i);
        	System.out.println(bracket.buscaPartida(i).getTimeA().getNome());
        	System.out.println(bracket.buscaPartida(i).getTimeB().getNome());
        	
        	//ESCOLHE OS VENCEDORES 
        	TimeNaoSeeded timeA = (TimeNaoSeeded)bracket.buscaPartida(i).getTimeA();
        	bracket.buscaPartida(i).setVencedor(timeA);
        	TimeNaoSeeded timeB = (TimeNaoSeeded)bracket.buscaPartida(i).getTimeB();
        	bracket.buscaPartida(i).setPerdedor(timeB);
        	System.out.printf("Vencedor: %s\n",bracket.buscaPartida(i).getVencedor().getNome());
        }
        System.out.println("--------------------------------");
        
        System.out.println("********************************");
    	System.out.println("SINGLE ELIMINATION / COM SEED");
    	System.out.println("********************************");
    }
}
