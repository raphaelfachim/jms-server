/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachim.raphael.server.messages;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
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

    public MsgBean() {
    }
    
    @Override
    public void onMessage(Message msg) {
        TextMessage txtMsg = (TextMessage) msg;
        System.out.println("====================================");
        System.out.println("========= Message Received =========");
        System.out.println("====================================");
        
        String message = "";
        
        try {
            message = txtMsg.getText();
        } catch (JMSException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println("Message : " + message);
    }
    
}
