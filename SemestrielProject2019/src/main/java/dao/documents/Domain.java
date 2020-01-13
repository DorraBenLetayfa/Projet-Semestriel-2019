package dao.documents;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import org.springframework.data.annotation.Id;
import java.util.List;
import java.util.Objects;

@Document
public class Domain {
    @Id
    @Field(value = "id")
    private long id;
    @Field(value = "DomainName")
    private String domainName;
    @Field(value = "Interests")
    private List<Interest> interests;

    @Override
    public String toString() {
        return "Domain{" +
                "id=" + id +
                ", DomainName='" + domainName + '\'' +
                ", interests=" + interests +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Domain)) return false;
        Domain Domain = (Domain) o;
        return getId() == Domain.getId() &&
                getDomainName().equals(Domain.getDomainName()) &&
                getInterests().equals(Domain.getInterests());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDomainName(), getInterests());
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String DomainName) {
        this.domainName = DomainName;
    }

    public List<Interest> getInterests() {
        return interests;
    }

    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }
}
