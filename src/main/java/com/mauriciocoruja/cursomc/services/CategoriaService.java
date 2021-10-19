package com.mauriciocoruja.cursomc.services;

import com.mauriciocoruja.cursomc.domain.entities.Categoria;
import com.mauriciocoruja.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElse(null);
    }

}
