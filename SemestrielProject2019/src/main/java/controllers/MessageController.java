package controllers;

import dao.documents.Message;
import dao.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.MessageService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @Autowired
    private MessageRepository messageRepository;

    @PostMapping(value = "/add")
    public String addMessage(@RequestBody Message message) {
        messageService.addMessage(message);
        return "success";

    }
    @GetMapping("/all")
    public List<Message> getAllMessages() {

        return messageService.getAllMessages();
    }

    @GetMapping("/historic")
    public List<Message> getHistoric(@RequestParam(value = "from") String from,@RequestParam(value = "to")  String to){
        return messageRepository.getHistoricMessages(from,to);
    }


}
