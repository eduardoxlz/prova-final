package br.com.tech4me.informaticaloja.shared;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class InformaticaLojaDtoCompleto {
    private String id;
    @NotEmpty(message="modelo do gabinete tem que ser informado")
    @NotBlank(message="ERROR falta de Caracteres  Falta informação")
    private String modeloDogabinete;
    private List<String> listaDepecas;
    @Size(min=3, max=3, message="Informe 21, 22, ou 27")
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
    
    
   

    }

