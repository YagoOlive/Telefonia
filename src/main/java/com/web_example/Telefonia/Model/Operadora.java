package com.web_example.Telefonia.Model;

import com.web_example.Telefonia.Model.Comercial.Celular;
import com.web_example.Telefonia.Model.Comercial.Plano;
import com.web_example.Telefonia.Model.Pessoal.Cliente;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Operadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany
    @JoinColumn(name="operadora_id")
    private Set<Cliente> clientes;
    @OneToMany
    @JoinColumn(name="operadora_id")
    private Set<Celular> celulares;
    @OneToMany
    @JoinColumn(name="operadora_id")
    private Set<Plano> planos;

    public Operadora(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Set<Celular> getCelulares() {
        return celulares;
    }

    public void setCelulares(Set<Celular> celulares) {
        this.celulares = celulares;
    }

    public Set<Plano> getPlanos() {
        return planos;
    }

    public void setPlanos(Set<Plano> planos) {
        this.planos = planos;
    }
}
