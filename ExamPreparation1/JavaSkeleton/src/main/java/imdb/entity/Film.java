package imdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer year;

    private String name;

    private String director;

    private String genre;

    public Film(Integer year, String name, String director, String genre) {
        this.year = year;
        this.name = name;
        this.director = director;
        this.genre = genre;
    }

    public Film() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;

    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

