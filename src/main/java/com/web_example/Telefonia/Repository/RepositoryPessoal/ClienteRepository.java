package com.web_example.Telefonia.Repository.RepositoryPessoal;

import com.web_example.Telefonia.Model.Pessoal.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
