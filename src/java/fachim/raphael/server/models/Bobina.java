/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachim.raphael.server.models;

/**
 *
 * @author raphael.fachim
 */
public class Bobina {
    private String codigo;
    private Float peso;
    private Float largura;
    private Float comprimento;
    private Float espessura;

    public Bobina() {
    }

    public Bobina(String codigo, Float peso, Float largura, Float comprimento, Float espessura) {
        this.codigo = codigo;
        this.peso = peso;
        this.largura = largura;
        this.comprimento = comprimento;
        this.espessura = espessura;
    }

    public String getCodigo() {
        return codigo;
    }

    public Float getPeso() {
        return peso;
    }

    public Float getLargura() {
        return largura;
    }

    public Float getComprimento() {
        return comprimento;
    }

    public Float getEspessura() {
        return espessura;
    }

    @Override
    public String toString() {
        return "Bobina{" + "codigo=" + codigo + ", peso=" + peso + ", largura=" + largura + ", comprimento=" + comprimento + ", espessura=" + espessura + '}';
    }
    
}
