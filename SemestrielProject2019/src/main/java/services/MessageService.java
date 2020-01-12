package services;

import dao.documents.Message;

import java.util.List;

public interface MessageService {
    void addMessage(Message message);
    List<Message> getAllMessages();
}
