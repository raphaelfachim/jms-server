/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachim.raphael.server.models;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author raphael.fachim
 */

@Stateless
@Entity
@Table(name = "placas")
public class Placa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    private String codigo;
    private Float peso;
    private Float largura;
    private Float comprimento;
    private Float espessura;

    public Placa() {
    }

    public Placa(String codigo, Float peso, Float largura, Float comprimento, Float espessura) {
        this.codigo = codigo;
        this.peso = peso;
        this.largura = largura;
        this.comprimento = comprimento;
        this.espessura = espessura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getLargura() {
        return largura;
    }

    public void setLargura(Float largura) {
        this.largura = largura;
    }

    public Float getComprimento() {
        return comprimento;
    }

    public void setComprimento(Float comprimento) {
        this.comprimento = comprimento;
    }

    public Float getEspessura() {
        return espessura;
    }

    public void setEspessura(Float espessura) {
        this.espessura = espessura;
    }

    @Override
    public String toString() {
        return "Placa{" + "codigo=" + codigo + ", peso=" + peso + ", largura=" + largura + ", comprimento=" + comprimento + ", espessura=" + espessura + '}';
    }
    
}
