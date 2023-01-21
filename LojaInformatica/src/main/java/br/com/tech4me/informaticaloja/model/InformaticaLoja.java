package br.com.tech4me.informaticaloja.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("pc")
public class InformaticaLoja {

    @Id
    private String id;
    private String ModeloDogabinete;
    private List<String> ListaDepecas;
    private String tamanhoDogabinete;


    public String getTamanhoDogabinete() {
        return tamanhoDogabinete;
    }
    public void setTamanhoDogabinete(String tamanhoDogabinete) {
        this.tamanhoDogabinete = tamanhoDogabinete;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getModeloDogabinete() {
        return ModeloDogabinete;
    }
    public void setModeloDegabinete(String modeloDogabinete) {
        ModeloDogabinete = modeloDogabinete;
    }
    public List<String> getListaDepecas() {
        return ListaDepecas;
    }
    public void setListaDepecas(List<String> listaDepecas) {
        ListaDepecas = listaDepecas;
    }

    
    



}
