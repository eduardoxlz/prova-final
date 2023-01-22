package br.com.techme.informaticaloja.shared;

import java.util.List;

public class InformaticaLojaDto {
    private String id;
    private String ModeloDogabinete;
    private List<String> ListaDepecas;
    private String tamanhoDogabinete;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getModeloDogabinete() {
        return ModeloDogabinete;
    }
    public void setModeloDogabinete(String modeloDogabinete) {
        ModeloDogabinete = modeloDogabinete;
    }
    public List<String> getListaDepecas() {
        return ListaDepecas;
    }
    public void setListaDepecas(List<String> listaDepecas) {
        ListaDepecas = listaDepecas;
    }
    public String getTamanhoDogabinete() {
        return tamanhoDogabinete;
    }
    public void setTamanhoDogabinete(String tamanhoDogabinete) {
        this.tamanhoDogabinete = tamanhoDogabinete;
    }

    
}
