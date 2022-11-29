/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachim.raphael.server.models;

import javax.ejb.Stateless;

/**
 *
 * @author raphael.fachim
 */

@Stateless
public class Placa {
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
       
}
