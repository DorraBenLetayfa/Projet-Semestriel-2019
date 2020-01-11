package services;

import dao.documents.Question;

import java.util.List;

public interface QuestionService {
    void addQuestion(Question question);
    List<Question> getAllQuestions();
    void deleteQuestion(long id);

}
