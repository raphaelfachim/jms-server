/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachim.raphael.server.messages;

import fachim.raphael.server.bo.MensagensBO;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author raphael.fachim
 */

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "myDestination"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class MsgBean implements MessageListener {

    @Inject
    private MensagensBO bo;
    
    public MsgBean() {
    }
    
    @Override
    public void onMessage(Message msg) {
        TextMessage txtMsg = (TextMessage) msg;
        System.out.println("====================================");
        System.out.println("========= Message Received =========");
        System.out.println("====================================");
        
        String mensagem = "";
        
        try {
            mensagem = txtMsg.getText();
            bo.processaMensagem(mensagem);
            
        } catch (JMSException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println("Message : " + mensagem);
    }
    
}
