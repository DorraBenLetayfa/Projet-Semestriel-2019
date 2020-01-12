package services;

import dao.documents.Problem;

import java.util.List;

public interface ProblemService {
    void addProblem(Problem problem);
    List<Problem> getAllProblems();
    void deleteProblem(long id);
    Problem findProblemById(long id);

}
