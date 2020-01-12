package dao.documents;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.Objects;

@Document
public class Message {
        @Field(value = "Data")
        private String data;
        @Field(value = "From")
        private String from;
        @Field(value = "To")
        private String to;
        @Field(value = "date")
        private Date date;

    @Override
    public String toString() {
        return "Message{" +
                "data='" + data + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return Objects.equals(getData(), message.getData()) &&
                Objects.equals(getFrom(), message.getFrom()) &&
                Objects.equals(getTo(), message.getTo()) &&
                Objects.equals(getDate(), message.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData(), getFrom(), getTo(), getDate());
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
