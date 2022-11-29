/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachim.raphael.server.bo;

import fachim.raphael.server.dao.PlacaDAO;
import fachim.raphael.server.models.Bobina;
import fachim.raphael.server.models.Placa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author raphael.fachim
 */
@Stateless
public class MensagensBO {
    
    @Inject PlacaDAO placaDao;
    
    public void processaMensagem(String mensagem) throws Exception{
        List<String> campos = new ArrayList<>(Arrays.asList(mensagem.split(";")));
        List<String> conteudo = campos.subList(1, campos.size());
        
        switch(campos.get(0)){
            case "PL":
                processaMensagemPlaca(conteudo);
                break;
            case "BB":
                processaMensagemBobina(conteudo);
                break;
            default:
                throw new Exception("Erro ao identificar mensagem");
        }
    }
    
    public void processaMensagemPlaca(List<String> conteudo){
        Placa placa = new Placa(conteudo.get(0),
                Float.parseFloat(conteudo.get(1)),
                Float.parseFloat(conteudo.get(2)),
                Float.parseFloat(conteudo.get(3)),
                Float.parseFloat(conteudo.get(4)));
        placaDao.save(placa);
        System.out.println(placa);
    }
    
    public void processaMensagemBobina(List<String> conteudo){
       Bobina bobina = new Bobina(conteudo.get(0), Float.NaN, Float.NaN, Float.NaN, Float.NaN);
       System.out.println(bobina);
    }
}
