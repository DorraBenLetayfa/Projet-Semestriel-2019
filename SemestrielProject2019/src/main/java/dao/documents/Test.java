package dao.documents;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

@Document
public class Test {
    @Id
    @Field(value = "testId")
    private long id;
    @Field(value = "Responces")
    private List<TestResponse> testResponses;
    @Field(value = "title")
    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<TestResponse> getTestResponses() {
        return testResponses;
    }

    public void setTestResponses(List<TestResponse> testResponses) {
        this.testResponses = testResponses;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", testResponses=" + testResponses +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test test = (Test) o;
        return id == test.id &&
                Objects.equals(testResponses, test.testResponses) &&
                Objects.equals(title, test.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, testResponses, title);
    }
}
