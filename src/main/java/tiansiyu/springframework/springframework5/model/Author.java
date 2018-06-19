package tiansiyu.springframework.springframework5.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long authorId;
    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "author_book_test",
                joinColumns = {@JoinColumn(name = "author_id", referencedColumnName = "authorId")},
                inverseJoinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "bookId")})
    private Set<Book> Books = new HashSet<>();

    public Long getauthorId() {
        return authorId;
    }

    public void setauthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author Author = (Author) o;
        return Objects.equals(authorId, Author.authorId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(authorId);
    }
}
