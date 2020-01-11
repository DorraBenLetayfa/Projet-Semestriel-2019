package dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dao.documents.User;

public interface UserRepository extends JpaRepository <User, Long>{
    User findUserByUserName(String userName);

}
