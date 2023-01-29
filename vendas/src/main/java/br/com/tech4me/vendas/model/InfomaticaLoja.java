package br.com.tech4me.vendas.model;

import java.util.List;

public class InfomaticaLoja {
    
    private String modeloDogabinete;
    private List<String> listaDepecas;
    private String tamanhoDogabinete;
    

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
    public String getModeloDogabinete() {
        return modeloDogabinete;
    }
    public void setModeloDogabinete(String modeloDogabinete) {
        this.modeloDogabinete = modeloDogabinete;
    }
}
