package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;
import lk.ijse.elite_driving_school_orm.dto.CourseDTO;
import lk.ijse.elite_driving_school_orm.dto.InstructorDTO;

import java.util.List;

public interface InstructorBO extends SuperBO {

    boolean save(InstructorDTO instructorDTO);
    boolean update(InstructorDTO instructorDTO);
    boolean delete(int id);
    List<InstructorDTO> getAll();
    InstructorDTO getOne(int id);
}
