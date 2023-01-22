package br.com.techme.informaticaloja.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.techme.informaticaloja.model.InformaticaLoja;

public interface InformaticaLojarepositorio  extends MongoRepository<InformaticaLoja,String>{
    
}
