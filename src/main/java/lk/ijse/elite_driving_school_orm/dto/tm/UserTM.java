package lk.ijse.elite_driving_school_orm.dto.tm;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserTM {
    private String userId;
    private String username;
    private String password;
    private String role;
}
