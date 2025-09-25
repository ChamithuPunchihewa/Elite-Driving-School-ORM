package lk.ijse.elite_driving_school_orm.dao.custom;

import lk.ijse.elite_driving_school_orm.dao.CrudDAO;
import lk.ijse.elite_driving_school_orm.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseDAO extends CrudDAO<Course> {

    List<Course> getAll() throws Exception;

    String getLastId() throws Exception;

    boolean delete(String id) throws Exception;

    List<String> getAllIds() throws Exception;

    Optional<Course> findById(String id) throws Exception;

    String generateNewId();
}
