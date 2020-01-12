package services.impl;

import dao.ProblemDAO;
import dao.documents.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import services.ProblemService;

import java.util.List;

@Service
@Transactional
public class ProblemServiceImpl implements ProblemService {
    private ProblemDAO problemDAO;
    @Autowired
    public ProblemServiceImpl(ProblemDAO problemDAO) {
        this.problemDAO = problemDAO;
    }

    @Override
    public void addProblem(Problem problem) {
        problemDAO.addProblem(problem);
    }

    @Override
    public List<Problem> getAllProblems() {
        return problemDAO.getAllProblems();
    }

    @Override
    public void deleteProblem(long id) {
        problemDAO.deleteProblemById(id);

    }

    @Override
    public Problem findProblemById(long id) {
        return problemDAO.findProblemById(id);
    }
}
