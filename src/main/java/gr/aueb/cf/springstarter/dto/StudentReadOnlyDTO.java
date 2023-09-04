package gr.aueb.cf.springstarter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentReadOnlyDTO {
    private Long id;
    private String firstname;
    private String lastname;
}
