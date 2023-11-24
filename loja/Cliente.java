package com.mycompany.loja;
import java.util.*;

public class Cliente {
    private String nome;
    private String cpf;
    List<Pagamento>pagamentos;
    
    Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        pagamentos = new ArrayList<Pagamento>();
    }
    
    public void imprimirCompras(){
        
    }
    
    public void valorGasto(){
        
    }
}
