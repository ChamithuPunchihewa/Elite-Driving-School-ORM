package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LessonDTO {
    private String lessonId;
    private LocalDate date;
    private LocalTime time;
    private String status;
    private String studentId;
    private String courseId;
    private String instructorId;
}
