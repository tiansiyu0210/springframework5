package tiansiyu.springframework.springframework5.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
public class book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    private String isbn;
    private String title;

    @ManyToMany(mappedBy = "books")
    private Set<author> authors = new HashSet<>();

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        book book = (book) o;
        return Objects.equals(bookId, book.bookId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookId);
    }
}
