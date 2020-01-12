package dao;

import dao.documents.Message;

import java.util.List;

public interface MessageDAO {
    void addMessage(Message message);
    List<Message> getAllMessages();
    List<Message> getHistoric(String client, String agent);
}
