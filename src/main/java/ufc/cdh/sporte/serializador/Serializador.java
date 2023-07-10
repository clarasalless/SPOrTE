package ufc.cdh.sporte.serializador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import ufc.cdh.sporte.torneio.Torneio;

public class Serializador{
    public void Serializar(Torneio torneio){
        try{
            FileOutputStream fos = new FileOutputStream(torneio.getNome() + ".sporte");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(torneio);
            oos.flush();
            oos.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public Torneio Desserializar(String filepath){
        Torneio torneio = null;
        try{
            FileInputStream fis = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            torneio = (Torneio)ois.readObject();
            ois.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return torneio;
    }
}
