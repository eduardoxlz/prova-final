package br.com.tech4me.informaticaloja.shared;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class InformaticaLojaDtoCompleto {


    private String id;
    @NotEmpty(message="Modelo tem que ser informado")
    @NotBlank(message="ERROR informe os caracteres")
    private String ModeloDogabinete;
    private List<String> ListaDepecas;
    @Size(min=3, max=3, message="Informe 21, 22, ou 27")
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
    public String getTamanho() {
        return tamanhoDogabinete;
    }
    public void setTamanho(String tamanhoDogabinete) {
        this.tamanhoDogabinete = tamanhoDogabinete;
    }
}
