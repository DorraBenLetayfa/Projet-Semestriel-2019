package dao.impl;

import dao.MessageDAO;
import dao.documents.Message;
import dao.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageDAOImpl implements MessageDAO {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageDAOImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


    @Override
    public void addMessage(Message message) {
        messageRepository.save(message);

    }

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public List<Message> getHistoric(String client, String agent) {
        return messageRepository.getHistoricMessages(client,agent);
    }
}
