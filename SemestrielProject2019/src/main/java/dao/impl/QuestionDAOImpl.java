package dao.impl;

import dao.QuestionDAO;
import dao.documents.Question;
import dao.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionDAOImpl implements QuestionDAO {
    private final QuestionRepository questionRepository;
@Autowired
    public QuestionDAOImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public void addQuestion(Question question) {
questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public void deleteQuestionById(Long id) {
    questionRepository.deleteById(id);

    }
}
