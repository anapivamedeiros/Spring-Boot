package com.devsenai2A.petshop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsenai2A.petshop.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByCategoriaId(Long id);

}