// PaymentDTO.java
package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentDTO {
    private String paymentId;
    private String studentId;
    private String courseId;
    private BigDecimal amount;
    private LocalDateTime paidAt;
    private String method;    // CASH, CARD, BANK_TRANSFER
    private String reference; // optional
    private boolean completed;
}
