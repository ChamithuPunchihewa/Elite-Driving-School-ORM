package lk.ijse.elite_driving_school_orm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "course")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @Column(name = "course_id", nullable = false, length = 20)
    private String courseId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 50)
    private String duration;

    @Column(nullable = false)
    private double fee;
}
