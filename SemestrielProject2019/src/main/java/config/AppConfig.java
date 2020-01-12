package config;


import controllers.*;
import dao.*;
import dao.documents.*;
import dao.repository.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import services.*;

@Configuration
@EnableMongoRepositories(basePackageClasses = {ProblemRepository.class,StartupRepository.class,OfferRepository.class,DomainRepository.class, EntrepriseRepository.class, MessageRepository.class, GroupRepository.class,
        InterestRepository.class,QuestionRepository.class,TestResponceRepository.class,TestRepository.class,UserRepository.class})
@EntityScan(basePackageClasses = {Startup.class,Problem.class,Offer.class,User.class, Domain.class, Message.class, Question.class,Test.class,TestResponse.class,Entreprise.class,Interest.class,Group.class})
@ComponentScan(basePackageClasses = {OfferDAO.class,OfferService.class,OfferController.class,UserDAO.class, UserService.class, UserController.class, TestResponseDAO.class, TestResponseService.class, TestResponseController.class,
        MessageDAO.class, MessageService.class, MessageController.class, TestDAO.class, TestService.class, TestController.class,
        QuestionDAO.class, QuestionService.class, QuestionController.class,InterestDAO.class,InterestService.class,InterestController.class,
GroupDAO.class,GroupService.class,GroupController.class,EntrepriseDAO.class,EntrepriseService.class,EntrepriseController.class,
DomainDAO.class,DomainService.class,DomainController.class,ProblemDAO.class,ProblemService.class,ProblemController.class,
StartupDAO.class,StartupService.class,StartupController.class})
public class AppConfig {
}
