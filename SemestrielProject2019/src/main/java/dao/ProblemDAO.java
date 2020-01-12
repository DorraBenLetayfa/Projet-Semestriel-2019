package dao;

import dao.documents.Problem;

import java.util.List;

public interface ProblemDAO {
    void addProblem(Problem problem);
    List<Problem> getAllProblems();
    Problem findProblemById(long id);
    void deleteProblemById(Long id);
}
