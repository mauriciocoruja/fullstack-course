package com.mauriciocoruja.cursomc.resources;

import com.mauriciocoruja.cursomc.entities.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    /*@RequestMapping(method = RequestMethod.GET)
    public String listar() {
        return "REST está funfando";
    }*/

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listarCategorias() {
        List<Categoria> categorias = new ArrayList<>();

        categorias.add(new Categoria(1, "Informatica"));
        categorias.add(new Categoria(2, "Escritorio"));

        return categorias;
    }
}
