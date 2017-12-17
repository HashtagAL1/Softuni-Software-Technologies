package teistermask.entity;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String status;

    public Task() {
    }

    public Task(String title, String status) {

        this.title = title;
        this.status = status;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }
}
