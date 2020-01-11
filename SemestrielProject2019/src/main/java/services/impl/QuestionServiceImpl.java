package services.impl;

import dao.QuestionDAO;
import dao.documents.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.QuestionService;

import java.util.List;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService {
    private final QuestionDAO questionDAO;

    @Autowired
    public QuestionServiceImpl(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }
    @Override
    public void addQuestion(Question question) {
        questionDAO.addQuestion(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionDAO.getAllQuestions();
    }

    @Override
    public void deleteQuestion(long id) {
       questionDAO.deleteQuestionById(id);
    }
}
