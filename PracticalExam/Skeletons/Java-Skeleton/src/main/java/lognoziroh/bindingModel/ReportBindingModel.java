package lognoziroh.bindingModel;

import javax.validation.constraints.NotNull;

public class ReportBindingModel {
    @NotNull
    private String status;

    @NotNull
    private String origin;

    @NotNull
    private String message;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {

        return status;
    }

    public String getOrigin() {
        return origin;
    }

    public String getMessage() {
        return message;
    }
}
