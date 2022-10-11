package br.com.projeto.exemplo02.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo02.modelo.Postagem;

@Repository
public interface PostagemRepositorio extends CrudRepository<Postagem, Long> {
    
}
