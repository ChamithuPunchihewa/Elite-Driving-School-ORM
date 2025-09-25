package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.bo.SuperBO;
import lk.ijse.elite_driving_school_orm.dto.UserDTO;

import java.util.List;

public interface UserBO extends SuperBO {
    boolean save(UserDTO t);
    boolean update(UserDTO t);
    boolean delete(int id);
    List<UserDTO> getAll();
    UserDTO getOne(int id);
}
