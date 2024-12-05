package com.web_example.Telefonia.Repository.RepositoryPessoal;

import com.web_example.Telefonia.Model.Pessoal.Cliente;
import com.web_example.Telefonia.Model.Pessoal.ClientePessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientePessosaJuridicaRepository extends JpaRepository<ClientePessoaJuridica, Long> {
}
