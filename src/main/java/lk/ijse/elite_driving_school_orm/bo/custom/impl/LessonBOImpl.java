package lk.ijse.elite_driving_school_orm.bo.custom.impl;

import lk.ijse.elite_driving_school_orm.bo.custom.LessonBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.LessonDAO;
import lk.ijse.elite_driving_school_orm.dto.LessonDTO;
import lk.ijse.elite_driving_school_orm.entity.Lesson;

import java.util.List;

public class LessonBOImpl implements LessonBO {
    LessonDAO lessonDAO = (LessonDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LESSON);
    @Override
    public boolean save(LessonDTO lessonDTO) {

        return lessonDAO.save(new Lesson(lessonDTO.getLessonId(), lessonDTO.getDate(), lessonDTO.getTime(), lessonDTO.getStatus(), lessonDTO.getStudentId(), lessonDTO.getCourseId(),lessonDTO.getInstructorId()));
    }

    @Override
    public boolean update(LessonDTO lessonDTO) {
        return lessonDAO.update(new Lesson(lessonDTO.getLessonId(), lessonDTO.getDate(), lessonDTO.getTime(), lessonDTO.getStatus(), lessonDTO.getStudentId(), lessonDTO.getCourseId(),lessonDTO.getInstructorId()));
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<LessonDTO> getAll() {
        return List.of();
    }
}
