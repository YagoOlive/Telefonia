package com.web_example.Telefonia.Model.Comercial;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@DiscriminatorValue(value = "CelularPrePago")
public class CelularPrePago extends Celular {

    private double saldo;
    private Date dataDeValidade;

    public CelularPrePago(){
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

}
