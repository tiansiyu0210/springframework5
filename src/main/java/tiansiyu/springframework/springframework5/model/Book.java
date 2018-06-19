package tiansiyu.springframework.springframework5.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    private String isbn;
    private String title;

    @ManyToMany(mappedBy = "books")
    private Set<Author> Authors = new HashSet<>();

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

    public Set<Author> getAuthors() {
        return Authors;
    }

    public void setAuthors(Set<Author> Authors) {
        this.Authors = Authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book Book = (Book) o;
        return Objects.equals(bookId, Book.bookId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookId);
    }
}
