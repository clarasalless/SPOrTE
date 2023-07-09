package ufc.cdh.sporte.participantes.exceptions;

import ufc.cdh.sporte.participantes.Coach;

public class CoachExistenteException extends Exception{
    public Coach coach;
    public CoachExistenteException(Coach coach){
        super("Já existe um coach cadastrado no time " );
        this.coach = coach;
    }
    public Coach getCoach(){
        return this.coach;
    }
}
