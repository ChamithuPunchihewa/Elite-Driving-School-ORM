package lk.ijse.elite_driving_school_orm.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class StudentDTO {
    private long studentId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String registrationDate;
    private String registerFee;

    public StudentDTO(String name, String email, String phone, String address, String registerFee, String registrationDate) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.registrationDate = registrationDate;
        this.registerFee = registerFee;
    }
}
