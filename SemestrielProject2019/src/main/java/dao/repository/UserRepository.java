package dao.repository;


import dao.documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
    User findUserByUserName(String userName);

}
