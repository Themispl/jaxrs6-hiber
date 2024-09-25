package gr.aueb.cf.schoolapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeacherUpdateDTO {
    @NotNull
    private Long id;
    @NotNull
    @Size(min = 2, max = 50, message = "name should 2~50 chars")
    private String firstname;
    @NotNull
    @Size(min = 2, max = 50, message = "lastname should 2~50 chars")
    private String lastname;
}
