package lk.ijse.elite_driving_school_orm.dao.custom.impl;

import lk.ijse.elite_driving_school_orm.config.FactoryConfiguration;
import lk.ijse.elite_driving_school_orm.dao.custom.InstructorDAO;
import lk.ijse.elite_driving_school_orm.entity.Course;
import lk.ijse.elite_driving_school_orm.entity.Instructor;
import lk.ijse.elite_driving_school_orm.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class InstructorDAOImpl implements InstructorDAO {
    @Override
    public boolean save(Instructor instructor) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(instructor);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean update(Instructor instructor) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(instructor);
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
            Instructor instructor = session.get(Instructor.class, id);
            session.remove(instructor);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Instructor> getALL() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            List instructor = (List) session.createQuery("from Instructor").list();
            return instructor;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public Optional<Instructor> getOne(int id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        try{
            Instructor instructor = session.get(Instructor.class, id);
            return Optional.of(instructor);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

