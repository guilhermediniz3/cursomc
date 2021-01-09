package com.nelioalves.cursomc.services;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.sun.el.stream.Optional;

@Service
public class CategoriaService {
@Autowired
private CategoriaRepository repo;
public Categoria buscar(Integer id) {
	Optional<Categoria>obj = repo.findById(id);
   return obj.orElse(null);	
}
}
