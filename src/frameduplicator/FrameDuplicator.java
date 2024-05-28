/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frameduplicator;
import com.mrjaffesclass.apcs.messenger.*;
/**
 *
 * @author drewa
 */
public class FrameDuplicator implements MessageHandler{
    private final Messenger mvcMessaging;
    
    public FrameDuplicator() {
        this.mvcMessaging = new Messenger();
    }
    
    public void init() {
        Frame frame = new Frame(this.mvcMessaging);
        frame.setVisible(true);
    }
    
    @Override
    public void messageHandler(String messageName, Object messagePayload) {
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrameDuplicator controller = new FrameDuplicator();
        controller.init();
    }
}