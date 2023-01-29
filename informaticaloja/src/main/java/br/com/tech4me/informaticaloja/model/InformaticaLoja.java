package br.com.tech4me.informaticaloja.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("pc")
public class InformaticaLoja {

    @Id
    private String id;
    private String modeloDogabinete;
    private List<String> listaDepecas;
    private String tamanhoDogabinete;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getModeloDogabinete() {
        return modeloDogabinete;
    }
    public void setModeloDogabinete(String modeloDogabinete) {
        this.modeloDogabinete = modeloDogabinete;
    }
    public List<String> getListaDepecas() {
        return listaDepecas;
    }
    public void setListaDepecas(List<String> listaDepecas) {
        this.listaDepecas = listaDepecas;
    }
    public String getTamanhoDogabinete() {
        return tamanhoDogabinete;
    }
    public void setTamanhoDogabinete(String tamanhoDogabinete) {
        this.tamanhoDogabinete = tamanhoDogabinete;
    }


 

    
    



}
