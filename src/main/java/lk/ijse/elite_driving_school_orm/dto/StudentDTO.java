package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
    private String studentId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private double registerFee;
    private LocalDate registrationDate;
}
