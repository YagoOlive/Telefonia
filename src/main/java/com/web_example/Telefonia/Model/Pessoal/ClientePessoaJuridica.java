package com.web_example.Telefonia.Model.Pessoal;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "ClientePessoaJuridica")
public class ClientePessoaJuridica extends Cliente {

    private String cnpj;

    public ClientePessoaJuridica(){

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
