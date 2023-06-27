/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufc.cdh.sporte.participantes;

/**
 *
 * @author Guilh
 */

public class Jogador extends Participante{
    int idade;
    public Jogador(String nome, int idade){
        super(nome);
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
}
