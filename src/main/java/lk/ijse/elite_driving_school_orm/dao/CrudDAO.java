package lk.ijse.elite_driving_school_orm.dao;


import java.util.List;

public interface CrudDAO <T> extends SuperDAO {
    boolean save (T t);
    boolean update(T t);
    boolean delete (int id);
    List<T> getALL();

}
