package com.produtos.ApiRest1.repository;

import com.produtos.ApiRest1.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {

    Produtos findById(long id);
}
