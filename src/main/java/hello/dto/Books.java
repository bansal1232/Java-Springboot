package hello.dto;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String authorName;
    private Integer bookId;

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", bookId=" + bookId +
                ", Address='" + Address + '\'' +
                '}';
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    private String Address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthotName() {
        return authorName;
    }

    public void setAuthotName(String authotName) {
        this.authorName = authotName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


}
