package todolist.entity;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String comments;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getComments() {
        return comments;
    }

    public Task() {

    }

    public Task(String title, String comments) {

        this.title = title;
        this.comments = comments;
    }
}
