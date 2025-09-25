package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;
import lk.ijse.elite_driving_school_orm.dto.CourseDTO;

import java.util.List;

public interface CourseBO extends SuperBO {
    boolean save(CourseDTO courseDTO);
    boolean update(CourseDTO courseDTO);
    boolean delete(int id);
    List<CourseDTO> getAll();
}
