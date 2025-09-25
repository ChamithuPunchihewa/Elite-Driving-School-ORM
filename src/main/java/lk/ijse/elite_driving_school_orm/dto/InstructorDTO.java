// InstructorDTO.java
package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InstructorDTO {
    private String instructorId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nic;
    private LocalDate joinedDate;
    private List<String> assignedCourseIds;
}
