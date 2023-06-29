package ufc.cdh.sporte.organizadordetimes.times;

public class TimeSeeded extends TimeAbstrato{
    int seed;
    public TimeSeeded(String nome,int seed){
        super(nome);
        this.seed = seed;
    }
}
