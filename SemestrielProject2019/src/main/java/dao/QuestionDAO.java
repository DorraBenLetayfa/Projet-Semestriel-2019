package dao;

import dao.documents.Question;

import java.util.List;

public interface QuestionDAO {
    void addQuestion(Question question);
    List<Question> getAllQuestions();
    void deleteQuestionById(Long id);
}
