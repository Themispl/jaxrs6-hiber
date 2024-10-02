package gr.aueb.cf.schoolapp.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherReadOnlyDTO {
    private Long id;
    private String vat;
    private String firstname;
    private String lastname;

}
