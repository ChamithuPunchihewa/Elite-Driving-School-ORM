package lk.ijse.elite_driving_school_orm.bo.custom;

import lk.ijse.elite_driving_school_orm.dto.UserDTO;

import java.util.List;

public interface UserBO {
    boolean save(UserDTO t);
    boolean update(UserDTO t);
    boolean delete(Long id);
    List<UserDTO> getAll();
}
