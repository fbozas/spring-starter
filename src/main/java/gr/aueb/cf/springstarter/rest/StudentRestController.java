package gr.aueb.cf.springstarter.rest;

import gr.aueb.cf.springstarter.dto.StudentInsertDTO;
import gr.aueb.cf.springstarter.dto.StudentReadOnlyDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @GetMapping("/students/{id}")
    public ResponseEntity<StudentReadOnlyDTO> getOneStudent(@PathVariable("id") Long id){
        StudentReadOnlyDTO dto = new StudentReadOnlyDTO(1L, "Bob", "Something");
        if(dto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(dto, HttpStatus.OK);
//        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

//    @PostMapping("/students")
    @RequestMapping(path = "/students", method = RequestMethod.POST)
    public ResponseEntity<StudentReadOnlyDTO> addStudent(@RequestBody StudentInsertDTO dto){
        // call service layer
        // convert finally to StudentReadOnlyDTO
        StudentReadOnlyDTO studentDTO = new StudentReadOnlyDTO(2L, dto.getFirstname(), dto.getLastname());
        return new ResponseEntity<>(studentDTO, HttpStatus.CREATED);
    }
}
