package imdb.bindingModel;
import javax.validation.constraints.NotNull;

public class FilmBindingModel {
    @NotNull
    private Integer year;

    @NotNull
    private String name;

    @NotNull
    private String director;

    @NotNull
    private String genre;

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
