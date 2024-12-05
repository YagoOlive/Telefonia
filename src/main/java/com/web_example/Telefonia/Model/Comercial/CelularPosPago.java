package com.web_example.Telefonia.Model.Comercial;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "CelularPosPago")
public class CelularPosPago extends Celular {

    private int diaDeVencimento;

    public CelularPosPago(){

    }

    public int getDataDeVencimento() {
        return diaDeVencimento;
    }

    public void setDataDeVencimento(int dataDeVencimento) {
        this.diaDeVencimento = dataDeVencimento;
    }


}
