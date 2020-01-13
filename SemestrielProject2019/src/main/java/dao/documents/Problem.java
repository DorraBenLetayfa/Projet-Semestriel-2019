package dao.documents;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import org.springframework.data.annotation.Id;
import java.util.Objects;

@Document
public class Problem {
    @Id
    @Field(value = "id")
    private long id;
    @Field(value = "State")
    private String state ;
    @Field(value = "statu")
    private String statu;
    @Field(value = "Solution")
    private String solution;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Problem)) return false;
        Problem problem = (Problem) o;
        return id == problem.id &&
                state.equals(problem.state) &&
                statu.equals(problem.statu) &&
                Objects.equals(solution, problem.solution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, statu, solution);
    }

    @Override
    public String toString() {
        return "ProblemDAO{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", statu='" + statu + '\'' +
                ", solution='" + solution + '\'' +
                '}';
    }
}
