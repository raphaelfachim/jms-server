/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachim.raphael.server.bo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author raphael.fachim
 */
@Stateless
public class MensagensBO {
    
    public void processaMensagem(String mensagem) throws Exception{
        List<String> campos = new ArrayList<>();
        campos.addAll(Arrays.asList(mensagem.split(";")));
        switch(campos.get(0)){
            case "PL":
                processaMensagemPlaca();
                break;
            case "BB":
                processaMensagemBobina();
                break;
            default:
                throw new Exception("Erro ao identificar mensagem");
        }
        System.out.println("Campos : ");
        System.out.println(campos);
    }
    
    public void processaMensagemPlaca(){
        System.out.println("processaMensagemPlaca");
    }
    
    public void processaMensagemBobina(){
        System.out.println("processaMensagemBobina");
        
    }
}
