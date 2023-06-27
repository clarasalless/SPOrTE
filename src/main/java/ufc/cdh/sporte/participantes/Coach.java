
package ufc.cdh.sporte.participantes;


public class Coach extends Participante{
    int idade;
    String time;
    public Coach(String nome, String time){
        super(nome);
        this.time = time;
    }
    public int getIdade(){
        return idade;
    }
    public String getTime(){
        return time;
    }
}
