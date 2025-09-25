package lk.ijse.elite_driving_school_orm.dao;


import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface CrudDAO <T> extends SuperDAO {
    boolean save (T t);
    boolean update(T t);
    boolean delete (int id);
    List<T> getALL();
    Optional<T> getOne(int id);
    String getLastId() throws SQLException;
}
