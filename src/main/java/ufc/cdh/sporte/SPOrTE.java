package ufc.cdh.sporte;


import ufc.cdh.sporte.times.*;
import ufc.cdh.sporte.torneio.*;


public class SPOrTE {

    public static void main(String[] args) {
    	boolean isSeeded;
    	
    	System.out.println("********************************");
    	System.out.println("DOUBLE ELIMINATION / SEM SEED");
    	System.out.println("********************************");
    	
    	//CRIAÇÃO DE TIMES E ADIÇÃO NO VETOR
    	isSeeded = false;
    	VectorTimes times1 = new VectorTimes();
    	
    	TimeNaoSeeded time1 = new TimeNaoSeeded("PRX");
    	times1.inserirTime(time1);
    	TimeNaoSeeded time2 = new TimeNaoSeeded("DRX");
    	times1.inserirTime(time2);
    	TimeNaoSeeded time3 = new TimeNaoSeeded("FNC");
    	times1.inserirTime(time3);
    	TimeNaoSeeded time4 = new TimeNaoSeeded("NRG");
    	times1.inserirTime(time4);
    	TimeNaoSeeded time5 = new TimeNaoSeeded("LIQ");
    	times1.inserirTime(time5);
    	TimeNaoSeeded time6 = new TimeNaoSeeded("EDG");
    	times1.inserirTime(time6);
    	TimeNaoSeeded time7 = new TimeNaoSeeded("LOUD");
    	times1.inserirTime(time7);
    	TimeNaoSeeded time8 = new TimeNaoSeeded("EG");
    	times1.inserirTime(time8);
    	
    	//IMPRIME OS TIMES CADASTRADOS
        System.out.println("Times Cadastrados:");
        for(int i = 0; i < 8; i++) {
        	System.out.println(times1.buscaTime(i).getNome());
        }
        
       
        
        //CRIA TORNEIO E GERA AS CHAVES
        Torneio t1 = new EliminacaoDupla("torneio1",times1,isSeeded);
        t1.geraChave();
        Chave bracket1 = t1.getChave();
        
        //PREENCHE AS PARTIDAS INICIAIS DA CHAVE 
        System.out.println("--------------------------------");
        System.out.println("Rodada 1");
        System.out.println("--------------------------------");
        
        for(int i = 1; i <= 4; i++) {
        	bracket1.buscaPartida(i).setTimeA();
        	bracket1.buscaPartida(i).setTimeB();
        	System.out.printf("partida %d:\n", i);
        	System.out.println(bracket1.buscaPartida(i).getTimeA().getNome());
        	System.out.println(bracket1.buscaPartida(i).getTimeB().getNome());
        	
        	//ESCOLHE OS VENCEDORES (RODADA1)
        	TimeNaoSeeded timeA = (TimeNaoSeeded)bracket1.buscaPartida(i).getTimeA();
        	bracket1.buscaPartida(i).setVencedor(timeA);
        	TimeNaoSeeded timeB = (TimeNaoSeeded)bracket1.buscaPartida(i).getTimeB();
        	bracket1.buscaPartida(i).setPerdedor(timeB);
        	System.out.printf("Vencedor: %s\n",bracket1.buscaPartida(i).getVencedor().getNome());
        }
        
        //PREENCHE AS PARTIDAS INICIAIS DA CHAVE
        System.out.println("--------------------------------");
        System.out.println("Rodadas Seguintes");
        System.out.println("--------------------------------");
        
        for(int i = 5; i <= 14; i++) {
        	bracket1.buscaPartida(i).setTimeA();
        	bracket1.buscaPartida(i).setTimeB();
        	System.out.printf("partida %d:\n", i);
        	System.out.println(bracket1.buscaPartida(i).getTimeA().getNome());
        	System.out.println(bracket1.buscaPartida(i).getTimeB().getNome());
        	
        	//ESCOLHE OS VENCEDORES 
        	TimeNaoSeeded timeA = (TimeNaoSeeded)bracket1.buscaPartida(i).getTimeA();
        	bracket1.buscaPartida(i).setVencedor(timeA);
        	TimeNaoSeeded timeB = (TimeNaoSeeded)bracket1.buscaPartida(i).getTimeB();
        	bracket1.buscaPartida(i).setPerdedor(timeB);
        	System.out.printf("Vencedor: %s\n",bracket1.buscaPartida(i).getVencedor().getNome());
        }
        System.out.println();
        
        System.out.println("********************************");
    	System.out.println("SINGLE ELIMINATION / COM SEED");
    	System.out.println("********************************");
    	
    	//CRIAÇÃO DE TIMES E ADIÇÃO NO VETOR
    	isSeeded = true;    	
    	VectorTimes times2 = new VectorTimes();
    	    	
    	TimeSeeded time9 = new TimeSeeded("PRX",8);
    	times2.inserirTime(time9);
    	TimeSeeded time10 = new TimeSeeded("DRX",7);
    	times2.inserirTime(time10);
    	TimeSeeded time11 = new TimeSeeded("FNC",6);
    	times2.inserirTime(time11);
    	TimeSeeded time12 = new TimeSeeded("NRG",5);
    	times2.inserirTime(time12);
    	TimeSeeded time13 = new TimeSeeded("LIQ",4);
    	times2.inserirTime(time13);
    	TimeSeeded time14 = new TimeSeeded("EDG",3);
    	times2.inserirTime(time14);
    	TimeSeeded time15 = new TimeSeeded("LOUD",2);
    	times2.inserirTime(time15);
    	TimeSeeded time16 = new TimeSeeded("EG",1);
    	times2.inserirTime(time16);
    	
    	//IMPRIME OS TIMES CADASTRADOS
    	System.out.println("Times Cadastrados:");
        for(int i = 0; i <= 7; i++) {
        	System.out.println(times2.buscaTime(i).getNome());
        }
        
        
        
        //CRIA TORNEIO E GERA AS CHAVES
    	Torneio t2 = new EliminacaoSimples("torneio2",times2, isSeeded);
    	t2.geraChave();
    	Chave bracket2 = t2.getChave();
    	
    	System.out.println("--------------------------------");
    	System.out.println("Rodada 1");
        System.out.println("--------------------------------");
        
        for(int i = 1; i <= 4; i++) {
        	bracket2.buscaPartida(i).setTimeA();
        	bracket2.buscaPartida(i).setTimeB();
        	System.out.printf("partida %d:\n", i);
        	System.out.println(bracket2.buscaPartida(i).getTimeA().getNome());
        	System.out.println(bracket2.buscaPartida(i).getTimeB().getNome());
        	
        	//ESCOLHE OS VENCEDORES (RODADA1)
        	TimeSeeded timeA = (TimeSeeded)bracket2.buscaPartida(i).getTimeA();
        	bracket2.buscaPartida(i).setVencedor(timeA);
        	TimeSeeded timeB = (TimeSeeded)bracket2.buscaPartida(i).getTimeB();
        	bracket2.buscaPartida(i).setPerdedor(timeB);
        	System.out.printf("Vencedor: %s\n",bracket2.buscaPartida(i).getVencedor().getNome());
        }
    	
        System.out.println("--------------------------------");
        System.out.println("Rodadas Seguintes");
        System.out.println("--------------------------------");
        
        for(int i = 5; i <= 7; i++) {
        	bracket2.buscaPartida(i).setTimeA();
        	bracket2.buscaPartida(i).setTimeB();
        	System.out.printf("partida %d:\n", i);
        	System.out.println(bracket2.buscaPartida(i).getTimeA().getNome());
        	System.out.println(bracket2.buscaPartida(i).getTimeB().getNome());
        	
        	//ESCOLHE OS VENCEDORES 
        	TimeSeeded timeA = (TimeSeeded)bracket2.buscaPartida(i).getTimeA();
        	bracket2.buscaPartida(i).setVencedor(timeA);
        	TimeSeeded timeB = (TimeSeeded)bracket2.buscaPartida(i).getTimeB();
        	bracket2.buscaPartida(i).setPerdedor(timeB);
        	System.out.printf("Vencedor: %s\n",bracket2.buscaPartida(i).getVencedor().getNome());
        }
    	
    }
}
