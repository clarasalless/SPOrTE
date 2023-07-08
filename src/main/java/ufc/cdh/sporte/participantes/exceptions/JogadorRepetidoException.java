package ufc.cdh.sporte.participantes.exceptions;

import ufc.cdh.sporte.participantes.Jogador;

public class JogadorRepetidoException extends Exception{
    public Jogador jogador;
    public JogadorRepetidoException(Jogador jogador){
        super("Já existe um jogador chamado " + jogador.getNome() + " no time " + jogador.getTime().getNome());
        this.jogador = jogador;
    }
    public Jogador getJogador(){
        return this.jogador;
    }
}
