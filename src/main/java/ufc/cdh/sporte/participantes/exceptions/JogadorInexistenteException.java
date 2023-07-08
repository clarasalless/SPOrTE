package ufc.cdh.sporte.participantes.exceptions;

public class JogadorInexistenteException extends Exception{
    public int index;
    public JogadorInexistenteException(int i){
        super("Jogador não encontrado");
        this.index = i;
    }
    public int getIndex(){
        return this.index;
    }
}
