package dao.documents;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.Objects;

@Document
public class Offer {
    @Id
    @Field(value = "id")
    private long id;
    @Field(value = "Title")
    private String title;
    @Field(value = "Domain")
    private long domainId;
    @Field(value = "Date de publication")
    private Date datePub;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getDomainId() {
        return domainId;
    }

    public void setDomainId(long domainId) {
        this.domainId = domainId;
    }

    public Date getDatePub() {
        return datePub;
    }

    public void setDatePub(Date datePub) {
        this.datePub = datePub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Offer)) return false;
        Offer offer = (Offer) o;
        return id == offer.id &&
                domainId == offer.domainId &&
                Objects.equals(title, offer.title) &&
                Objects.equals(datePub, offer.datePub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, domainId, datePub);
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", domainId=" + domainId +
                ", datePub=" + datePub +
                '}';
    }
}
