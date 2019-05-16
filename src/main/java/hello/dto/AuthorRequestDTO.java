package hello.dto;

public class AuthorRequestDTO {
    private int authorId;
    private String authorName;

    @Override
    public String toString() {
        return "AuthorRequestDTO{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
