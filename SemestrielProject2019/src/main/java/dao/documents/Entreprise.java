package dao.documents;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

@Document
public class Entreprise {
    @Id
    @Field(value = "id")
    private long id;
    @Field(value = "EntrepriseName")
    private String entrepriseName;

    @Override
    public String toString() {
        return "Entreprise{" +
                "id=" + id +
                ", entrepriseName='" + entrepriseName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entreprise)) return false;
        Entreprise that = (Entreprise) o;
        return getId() == that.getId() &&
                Objects.equals(getEntrepriseName(), that.getEntrepriseName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEntrepriseName());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEntrepriseName() {
        return entrepriseName;
    }

    public void setEntrepriseName(String entrepriseName) {
        this.entrepriseName = entrepriseName;
    }
}
