package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDTO {
    private String courseId;
    private String name;
    private String duration;
    private double fee;
}
