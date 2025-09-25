package lk.ijse.elite_driving_school_orm.dao.custom.impl;

import lk.ijse.elite_driving_school_orm.config.FactoryConfiguration;
import lk.ijse.elite_driving_school_orm.dao.custom.CourseDAO;
import lk.ijse.elite_driving_school_orm .entity.Course;
import lk.ijse.elite_driving_school_orm.entity.Instructor;
import lk.ijse.elite_driving_school_orm.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

public class CourseDAOImpl implements CourseDAO {

    @Override
    public boolean save(Course course) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(course);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean update(Course course) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(course);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }

    }

    @Override
    public boolean delete(int id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            Course course = session.get(Course.class, id);
            session.remove(course);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Course> getALL() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            List courses = (List) session.createQuery("from Course").list();
            return courses;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public Optional<Course> getOne(int id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        try{
            Course course = session.get(Course.class, id);
            return Optional.of(course);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}