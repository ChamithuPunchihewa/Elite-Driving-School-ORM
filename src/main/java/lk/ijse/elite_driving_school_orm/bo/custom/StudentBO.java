package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;
import lk.ijse.elite_driving_school_orm.dto.StudentDTO;

import java.util.ArrayList;

public interface StudentBO extends SuperBO {
    ArrayList<StudentDTO> getAllStudent();

    boolean delete(Long id);

    boolean save(StudentDTO studentDTO);

    boolean update(StudentDTO studentDTO);
}
