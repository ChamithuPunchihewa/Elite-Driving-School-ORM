package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InstructorDTO {
    private String instructorId;
    private String name;
    private String email;
    private String phone;
    private boolean availability;
}
