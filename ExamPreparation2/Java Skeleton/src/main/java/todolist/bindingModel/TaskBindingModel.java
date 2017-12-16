package todolist.bindingModel;

import javax.validation.constraints.NotNull;

public class TaskBindingModel {
    @NotNull
    private String comments;

    @NotNull
    private String title;

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComments() {

        return comments;
    }

    public String getTitle() {
        return title;
    }
}
