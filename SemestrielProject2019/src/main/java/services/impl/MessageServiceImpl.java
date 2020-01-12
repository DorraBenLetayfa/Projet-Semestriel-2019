package services.impl;

import dao.MessageDAO;
import dao.documents.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.MessageService;

import java.util.List;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {
    private MessageDAO messageDAO;

    @Autowired
    public MessageServiceImpl(MessageDAO messageDAO) {
        this.messageDAO = messageDAO;
    }

    @Override
    public void addMessage(Message message) {
        messageDAO.addMessage(message);
    }

    @Override
    public List<Message> getAllMessages(){return messageDAO.getAllMessages();}
}

