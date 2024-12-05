package com.web_example.Telefonia.Repository;

import com.web_example.Telefonia.Model.Operadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OperadoraRepository extends JpaRepository<Operadora, Long>{

}
