// CourseDTO.java
package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDTO {
    private String courseId;
    private String name;
    private String duration;
    private BigDecimal fee;
    private String description;
    private int capacity;
}
