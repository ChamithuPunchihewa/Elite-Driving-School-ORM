package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentDTO {
    private String paymentId;
    private String studentId;
    private String courseId;
    private LocalDate paymentDate;
    private double amount;
    private String paymentMethod;
}
