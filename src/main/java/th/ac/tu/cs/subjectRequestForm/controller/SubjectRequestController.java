package th.ac.tu.cs.subjectRequestForm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.ac.tu.cs.subjectRequestForm.model.SubjectRequest;
import th.ac.tu.cs.subjectRequestForm.repository.SubjectRequestRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(value = "/api", method = RequestMethod.POST)
public class SubjectRequestController {
    @Autowired
    SubjectRequestRepository requestRepository;

    @PostMapping("/request")
    @ResponseBody
    public String saveRequest(@ModelAttribute SubjectRequest request) {
        try {
            //requestRepository.save(request);

            return request.getReason(); //new ResponseEntity<>(request, HttpStatus.OK);
        } catch (Exception e) {
            return "Not";//return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        }
    }
}