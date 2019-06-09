/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravaremarquivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author 18206078
 */
public class GravarEmArquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(0, "Jean");
        Cliente cliente2 = new Cliente(1, "Caroline");
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        clientes.add(cliente2);
        
        try{
            FileOutputStream fout = new FileOutputStream("arq.ext");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            //out.writeObject(cliente);
            //out.writeObject(cliente2);
            out.writeObject(clientes);
            out.flush();
        }catch(FileNotFoundException ex){
            System.out.println("Arquivo nao existe");
        }catch(IOException ex){
            System.out.println("Algum erro com o arquivo");
            System.out.println(ex.getMessage());
        }
        
        try{
            FileInputStream fin = new FileInputStream("arq.ext");
            ObjectInputStream oin = new ObjectInputStream(fin);
            
            //Cliente cliLido = (Cliente) oin.readObject();
            //Cliente cliLido2 = (Cliente) oin.readObject();
            
            ArrayList<Cliente> clientesLidos = (ArrayList) oin.readObject();
            
            for(Cliente clientesLista : clientesLidos){
                System.out.println("Nome cli : "+clientesLista.getNome());
            }
            
            //System.out.println("Nome cli 1: "+clientesLidos.getNome());
            //System.out.println("Nome cli 2: "+cliLido2.getNome());
            
        }catch(FileNotFoundException ex){
            System.out.println("Arquivo nao existe");
        }catch(IOException ex){
            System.out.println("Algum erro com o arquivo");
            System.out.println(ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.out.println("Nao foi possivel ler objeto Cliente do arquivo");
        }
        
    }
    
}
