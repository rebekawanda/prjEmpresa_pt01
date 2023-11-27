package com.rebeka.PrjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rebeka.PrjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario , Long> {
	
}
