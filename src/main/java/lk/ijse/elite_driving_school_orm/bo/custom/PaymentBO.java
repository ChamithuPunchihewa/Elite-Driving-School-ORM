package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;
import lk.ijse.elite_driving_school_orm.dto.CourseDTO;
import lk.ijse.elite_driving_school_orm.dto.LessonDTO;
import lk.ijse.elite_driving_school_orm.dto.PaymentDTO;

import java.util.List;

public interface PaymentBO extends SuperBO {

    boolean save(PaymentDTO paymentDTO);
    boolean update(PaymentDTO paymentDTO);
    boolean delete(int id);
    List<PaymentDTO> getAll();
    PaymentDTO getOne(int id);
}
