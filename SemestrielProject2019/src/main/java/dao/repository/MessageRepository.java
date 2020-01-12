package dao.repository;

import dao.documents.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MessageRepository extends MongoRepository<Message, Long> {
    List<Message> getHistoricMessages(String from, String to);

}
