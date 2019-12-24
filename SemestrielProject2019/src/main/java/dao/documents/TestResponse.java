package dao.documents;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

@Document
public class TestResponse {
    @Id
    @Field(value = "id")
    private long id;
    @Field(value = "state")
    private String state;
    @Field(value = "testId")
    private long testId;

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

    public long getTestId() {
        return testId;
    }

    public void setTestId(long testId) {
        this.testId = testId;
    }

    @Override
    public String toString() {
        return "TestResponse{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", testId=" + testId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestResponse)) return false;
        TestResponse that = (TestResponse) o;
        return id == that.id &&
                testId == that.testId &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, testId);
    }
}
