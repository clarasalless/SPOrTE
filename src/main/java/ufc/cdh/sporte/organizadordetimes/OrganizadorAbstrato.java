package ufc.cdh.sporte.organizadordetimes;

import java.util.Vector;
import ufc.cdh.sporte.organizadordetimes.times.TimeAbstrato;

public abstract class OrganizadorAbstrato{
    Vector<TimeAbstrato> times;
    public OrganizadorAbstrato(){
        times = new Vector();   
    }
    
    public void RemoverTime(int i){
        times.remove(i);
    }
    
    public TimeAbstrato getTime(int i){
        return times.get(i);
    }
    
    public Vector<TimeAbstrato> getTimes(){
        return times;
    }
    
    public int getTamanho(){
        return times.size();
    }
}
