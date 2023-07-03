package ufc.cdh.sporte.torneio;

import ufc.cdh.sporte.organizadordetimes.OrganizadorAbstrato;
import ufc.cdh.sporte.organizadordetimes.OrganizadorNaoSeeded;
import ufc.cdh.sporte.organizadordetimes.OrganizadorSeeded;

public abstract class Tournament {
	protected OrganizadorAbstrato org;
	protected Bracket bracket;
        
        public Tournament(boolean isSeeded){
            if(isSeeded){
                org = new OrganizadorSeeded();
            }
            else{
                org = new OrganizadorNaoSeeded();
            }
        }
        
        public OrganizadorAbstrato getOrg(){
            return org;
        }
        
        public Bracket getBracket(){
            return bracket;
        }
}
