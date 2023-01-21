package br.com.tech4me.informaticaloja.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.informaticaloja.model.Informaticaloja;

public interface InformaticaLojaRepositorio extends MongoRepository<Informaticaloja, String> {
    


}
