package th.ac.tu.cs.subjectRequestForm.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import th.ac.tu.cs.subjectRequestForm.model.SubjectRequest;

@Repository
public class JDBCSubjectRequestRepository implements SubjectRequestRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(SubjectRequest subjectRequest) {

    }
}
