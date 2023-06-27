
package ufc.cdh.sporte.participantes;

/**
 *
 * @author Guilh
 */
public abstract class Participante {
    String nome;
    public Participante(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
