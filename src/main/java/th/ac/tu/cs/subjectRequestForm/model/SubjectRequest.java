package th.ac.tu.cs.subjectRequestForm.model;

public class SubjectRequest {
    private String reason;

    public SubjectRequest(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "SubjectRequest{" +
                "reason='" + reason + '\'' +
                '}';
    }
}
