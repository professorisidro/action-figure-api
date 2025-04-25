package br.org.pulsemais.actionfigures;

import java.lang.annotation.Inherited;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_actionfigure")
public class ActionFigure {
    @Id
    @Column(name = "personagem")
    private String personagem;

    @Column(name="categoria")
    private String categoria;

    @Column(name = "estilo")
    private String estilo;

    @Column(name = "nivel_raridade")
    private int nivelRaridade;

    public void setPersonagem(String personagem){
        this.personagem = personagem;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setEstilo(String estilo){
        this.estilo = estilo;
    }
    public void setNivelRaridade(int nivelRaridade){
        this.nivelRaridade = nivelRaridade;
    }

    public String getPersonagem(){
        return personagem;
    }
    public String getCategoria(){
        return categoria;
    }
    public String getEstilo(){
        return estilo;
    }
    public int getNivelRaridade(){
        return nivelRaridade;
    }
}
