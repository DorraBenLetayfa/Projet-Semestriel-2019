package dao.documents;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import org.springframework.data.annotation.Id;
import java.util.List;
import java.util.Objects;

@Document
public class Question {
    @Id
    @Field(value = "questionId")
    private long id;
    @Field(value = "state")
    private String state;
    @Field(value = "choices")
    private List<String> choices;
    @Field(value = "RightAnewer")
    private String rightAnswer;

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

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question = (Question) o;
        return id == question.id &&
                state.equals(question.state) &&
                Objects.equals(choices, question.choices) &&
                rightAnswer.equals(question.rightAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, choices, rightAnswer);
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", choices=" + choices +
                ", rightAnswer='" + rightAnswer + '\'' +
                '}';
    }
}
