package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.handler.annotation.MessageMapping;



import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class WebSocketController {
    private final SimpMessagingTemplate template;

    @Autowired
    WebSocketController(SimpMessagingTemplate template){
        this.template = template;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @MessageMapping("/send/message")
    public void onReceivedMesage(String message){
//        this.template.convertAndSend("/chat2", new SimpleDateFormat("HH:mm:ss").format(new Date())+"- "+message);
        this.template.convertAndSend("/chat",  new SimpleDateFormat("HH:mm:ss").format(new Date())+"- "+message);
        //  this.template.convertAndSend("/chat2",  new SimpleDateFormat("HH:mm:ss").format(new Date())+"- "+message);

        // System.err.println("msg from client "+message);
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @MessageMapping("/sendforclient/message")
    public void onReceivedMesage1(String message){
//        this.template.convertAndSend("/chat", message);
        this.template.convertAndSend("/chat2",  new SimpleDateFormat("HH:mm:ss").format(new Date())+"- "+message);

//        // System.err.println("msg from client "+message);
    }

}
