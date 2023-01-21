package br.com.tech4me.informaticaloja.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.informaticaloja.shared.InformaticaLojaDtoCompleto;
import br.com.tech4me.informaticaloja.shared.InformaticaLojaDto;

public interface InformaticaLojaService {

    List<InformaticaLojaDtoCompleto> obterTodasO();
    Optional<InformaticaLojaDto> obterPorId(String id);
    void excluirPorId(String id);
    InformaticaLojaDtoCompleto cadastrar(InformaticaLojaDto dto);
    Optional<InformaticaLojaCompletoDto> atualizarPorId(String id, InformaticaLojaComopletoDtp dtp);
    

}
