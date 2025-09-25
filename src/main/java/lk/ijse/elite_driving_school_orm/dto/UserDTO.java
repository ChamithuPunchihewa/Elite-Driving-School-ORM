// UserDTO.java
package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private String userId;
    private String username;
    private String passwordHash;
    private String role; // ADMIN / RECEPTIONIST
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime lastLoginAt;
}
