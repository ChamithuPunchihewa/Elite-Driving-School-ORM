package lk.ijse.elite_driving_school_orm.dao.custom.impl;

import lk.ijse.elite_driving_school_orm.config.FactoryConfiguration;
import lk.ijse.elite_driving_school_orm.dao.custom.UserDAO;
import lk.ijse.elite_driving_school_orm.entity.Student;
import lk.ijse.elite_driving_school_orm.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean save(User user) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(user);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean update(User user) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(user);
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
            User user = session.get(User.class, id);
            session.remove(user);
            return true;
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public List<User> getALL() {
        return List.of();
    }

    @Override
    public Optional<User> getOne(int id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        try{
            User user = session.get(User.class, id);
            return Optional.of(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
