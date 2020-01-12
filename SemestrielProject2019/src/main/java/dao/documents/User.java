package dao.documents;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Objects;

@Document
public class User {
    @Id
    @Field(value = "id")
    private long id;
    @Field(value = "userName")
    private String userName;
    @Field(value = "firstName")
    private String firstName;
    @Field(value = "lastName")
    private String LastName;
    @Field(value = "idGroupe")
    private long idGroupe;
    @Field(value = "statu")
    private boolean statu;
    @Field(value = "Problems")
    private List<Problem> problems;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public long getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(long idGroupe) {
        this.idGroupe = idGroupe;
    }

    public boolean isStatu() {
        return statu;
    }

    public void setStatu(boolean statu) {
        this.statu = statu;
    }

    public List<Problem> getProblems() {
        return problems;
    }

    public void setProblems(List<Problem> problems) {
        this.problems = problems;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", idGroupe=" + idGroupe +
                ", statu=" + statu +
                ", problems=" + problems +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id &&
                idGroupe == user.idGroupe &&
                statu == user.statu &&
                userName.equals(user.userName) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(LastName, user.LastName) &&
                Objects.equals(problems, user.problems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, firstName, LastName, idGroupe, statu, problems);
    }
}
