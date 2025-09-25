package lk.ijse.elite_driving_school_orm.bo.custom.impl;

import lk.ijse.elite_driving_school_orm.bo.custom.CourseBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.CourseDAO;
import lk.ijse.elite_driving_school_orm.dto.CourseDTO;
import lk.ijse.elite_driving_school_orm.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseBOImpl implements CourseBO {
    CourseDAO courseDAO = (CourseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COURSE);
    @Override
    public boolean save(CourseDTO courseDTO) {
        return courseDAO.save(new Course(courseDTO.getCourseId(), courseDTO.getName(), courseDTO.getDuration(), courseDTO.getFee()));
    }

    @Override
    public boolean update(CourseDTO courseDTO) {
        return courseDAO.save(new Course(courseDTO.getCourseId(), courseDTO.getName(), courseDTO.getDuration(), courseDTO.getFee()));

    }

    @Override
    public boolean delete(int id) {
        return courseDAO.delete(id);
    }

    @Override
    public List<CourseDTO> getAll() {
        List<CourseDTO> courseDTOs = null;
        try {
            List<Course> courses = courseDAO.getALL();
            courseDTOs = new ArrayList<>();
            for (Course course : courses) {
                courseDTOs.add(new CourseDTO(course.getCourseId(), course.getName(), course.getDuration(), course.getFee()));
            }
            return courseDTOs;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

