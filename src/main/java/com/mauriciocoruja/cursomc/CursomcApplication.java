package com.mauriciocoruja.cursomc;

import com.mauriciocoruja.cursomc.domain.entities.Categoria;
import com.mauriciocoruja.cursomc.domain.entities.Produto;
import com.mauriciocoruja.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);

	}

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public void run(String... args) throws Exception {


		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto prd1 = new Produto(null, "Computador", 2000.00);
		Produto prd2 = new Produto(null, "Impressora", 800.00);
		Produto prd3 = new Produto(null, "Mouse", 80.00);

		cat1.getProdutos().addAll(Arrays.asList(prd1,prd2,prd3));
		cat2.getProdutos().add(prd2);

		prd1.getCategorias().addAll(Arrays.asList(cat1));
		prd2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		prd3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));




	}
}
