package dao.documents;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

@Document
public class Startup {
    @Id
    @Field(value = "id")
    private long id;
    @Field(value = "startupName")
    private String name;
    @Field(value = "Description")
    private String description;
    @Field(value = "members")
    private List<User> members;
    @Field(value = "Owner")
    private long userId;
    @Field(value = "Domain")
    private Domain domain;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Startup)) return false;
        Startup startup = (Startup) o;
        return id == startup.id &&
                userId == startup.userId &&
                name.equals(startup.name) &&
                description.equals(startup.description) &&
                Objects.equals(members, startup.members) &&
                domain.equals(startup.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, members, userId, domain);
    }

    @Override
    public String toString() {
        return "Startup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", members=" + members +
                ", userId=" + userId +
                ", domain=" + domain +
                '}';
    }
}
