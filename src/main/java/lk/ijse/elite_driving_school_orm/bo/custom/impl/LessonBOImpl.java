package lk.ijse.elite_driving_school_orm.bo.custom.impl;

import lk.ijse.elite_driving_school_orm.bo.custom.LessonBO;
import lk.ijse.elite_driving_school_orm.bo.custom.StudentBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.CourseDAO;
import lk.ijse.elite_driving_school_orm.dao.custom.InstructorDAO;
import lk.ijse.elite_driving_school_orm.dao.custom.LessonDAO;
import lk.ijse.elite_driving_school_orm.dao.custom.StudentDAO;
import lk.ijse.elite_driving_school_orm.dto.InstructorDTO;
import lk.ijse.elite_driving_school_orm.dto.LessonDTO;
import lk.ijse.elite_driving_school_orm.entity.Course;
import lk.ijse.elite_driving_school_orm.entity.Instructor;
import lk.ijse.elite_driving_school_orm.entity.Lesson;
import lk.ijse.elite_driving_school_orm.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class LessonBOImpl implements LessonBO {
    LessonDAO lessonDAO = (LessonDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.LESSON);
    StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
    CourseDAO courseDAO = (CourseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COURSE);
    InstructorDAO instructorDAO = (InstructorDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.INSTRUCTOR);


    @Override
    public boolean save(LessonDTO lessonDTO) {
        Student student = studentDAO.getOne(Integer.parseInt(lessonDTO.getLessonId())).get();
        Course course = courseDAO.getOne(Integer.parseInt(lessonDTO.getCourseId())).get();
        Instructor instructor = instructorDAO.getOne(Integer.parseInt(lessonDTO.getInstructorId())).get();
        return lessonDAO.save(new Lesson(lessonDTO.getLessonId(), lessonDTO.getDate(), lessonDTO.getTime(), lessonDTO.getStatus(), student, course,instructor));
    }

    @Override
    public boolean update(LessonDTO lessonDTO) {
        Student student = studentDAO.getOne(Integer.parseInt(lessonDTO.getLessonId())).get();
        Course course = courseDAO.getOne(Integer.parseInt(lessonDTO.getCourseId())).get();
        Instructor instructor = instructorDAO.getOne(Integer.parseInt(lessonDTO.getInstructorId())).get();
        return lessonDAO.update(new Lesson(lessonDTO.getLessonId(), lessonDTO.getDate(), lessonDTO.getTime(), lessonDTO.getStatus(), student, course,instructor));
    }

    @Override
    public boolean delete(int id) {
        return lessonDAO.delete(id);
    }

    @Override
    public List<LessonDTO> getAll() {
        List<LessonDTO> lessonDTOS=null;
        try {
            List<Lesson> lessons = lessonDAO.getALL();
            lessonDTOS = new ArrayList<>();
            for (Lesson lesson : lessons) {
                lessonDTOS.add(new LessonDTO(lesson.getLessonId(),lesson.getDate(),lesson.getTime(),lesson.getStatus(),lesson.getStudent().getStudentId(),lesson.getCourse().getCourseId(),lesson.getInstructor().getInstructorId()));
            }
            return lessonDTOS;
        } catch (Exception e) {
            throw new RuntimeException(e);
            }
    }

    @Override
    public LessonDTO getOne(int id) {

        Lesson lesson = lessonDAO.getOne(id).get();
        return new LessonDTO(lesson.getLessonId(),lesson.getDate(),lesson.getTime(),lesson.getStatus(),lesson.getStudent().getStudentId(),lesson.getCourse().getCourseId(),lesson.getInstructor().getInstructorId());

    }
}
