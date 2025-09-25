// LessonDTO.java
package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LessonDTO {
    private String lessonId;
    private String courseId;
    private String studentId;
    private String instructorId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String location;
    private String notes;
    private boolean cancelled;
}
