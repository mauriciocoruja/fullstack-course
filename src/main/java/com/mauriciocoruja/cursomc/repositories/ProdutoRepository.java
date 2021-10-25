package com.mauriciocoruja.cursomc.repositories;

import com.mauriciocoruja.cursomc.domain.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
