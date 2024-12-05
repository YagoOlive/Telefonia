package com.web_example.Telefonia.Model.Comercial;

import com.web_example.Telefonia.Model.Pessoal.Cliente;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value = "classe")
public class Celular {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private long numero;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Plano plano;

    @OneToMany
    @JoinColumn(name = "celular_id")
    private Set<Ligacao> ligacoes;

    public Celular(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Set<Ligacao> getLigacoes() {
        return ligacoes;
    }

    public void setLigacoes(Set<Ligacao> ligacoes) {
        this.ligacoes = ligacoes;
    }
}
