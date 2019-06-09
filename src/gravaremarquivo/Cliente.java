package gravaremarquivo;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18206078
 */

/*
Todas as classes relacionadas precisam ser Serializable, por exemplo:
se Cliente extends Pessoa, Pessoa precisa ser Serializable também
*/
public class Cliente implements Serializable{
    
    private int codigo;
    private String nome;
    
    public Cliente(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }    
    
}
