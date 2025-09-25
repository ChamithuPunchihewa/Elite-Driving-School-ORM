package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;
import lk.ijse.elite_driving_school_orm.dto.CourseDTO;
import lk.ijse.elite_driving_school_orm.dto.InstructorDTO;
import lk.ijse.elite_driving_school_orm.dto.LessonDTO;

import java.util.List;

public interface LessonBO extends SuperBO {
    boolean save(LessonDTO lessonDTO);
    boolean update(LessonDTO lessonDTO);
    boolean delete(int id);
    List<LessonDTO> getAll();
    LessonDTO getOne(int id);
}
