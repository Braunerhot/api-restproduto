package com.restprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restprodutos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);

}
