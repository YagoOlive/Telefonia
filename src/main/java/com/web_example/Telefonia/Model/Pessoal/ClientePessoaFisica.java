package com.web_example.Telefonia.Model.Pessoal;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "ClientePessoaFisica")
public class ClientePessoaFisica extends Cliente {

    private String cpf;

    public ClientePessoaFisica(){
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }



}
