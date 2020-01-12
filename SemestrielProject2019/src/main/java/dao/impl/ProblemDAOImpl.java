package dao.impl;

import dao.ProblemDAO;
import dao.documents.Problem;
import dao.repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProblemDAOImpl implements ProblemDAO {
    private final ProblemRepository problemRepository;

    @Autowired
    public ProblemDAOImpl(ProblemRepository problemRepository) {
        this.problemRepository = problemRepository;
    }
    @Override
    public void addProblem(Problem problem) {
       problemRepository.save(problem);
    }

    @Override
    public List<Problem> getAllProblems() {
        return problemRepository.findAll();
    }

    @Override
    public Problem findProblemById(long id) {
        return problemRepository.findProblemById(id);
    }

    @Override
    public void deleteProblemById(Long id) {
   problemRepository.deleteById(id);
    }
}
