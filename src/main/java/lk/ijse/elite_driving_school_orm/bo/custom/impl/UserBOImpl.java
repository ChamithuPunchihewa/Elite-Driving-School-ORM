package lk.ijse.elite_driving_school_orm.bo.custom.impl;

import lk.ijse.elite_driving_school_orm.bo.custom.UserBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.UserDAO;
import lk.ijse.elite_driving_school_orm.dto.UserDTO;
import lk.ijse.elite_driving_school_orm.entity.Instructor;
import lk.ijse.elite_driving_school_orm.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserBOImpl implements UserBO {
    UserDAO userDAO =(UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);
    @Override
    public boolean save(UserDTO t) {
        return userDAO.save(new User(t.getUserId(), t.getUsername(), t.getPassword(), t.getName()));
    }

    @Override
    public boolean update(UserDTO t) {
        return userDAO.save(new User(t.getUserId(), t.getUsername(), t.getPassword(), t.getName()));
    }

    @Override
    public boolean delete(int id) {
        return userDAO.delete(id);
    }

    @Override
    public List<UserDTO> getAll() {
       List<UserDTO> userDTOS=null;
       try {
           List<User> users = userDAO.getALL();
          userDTOS = new ArrayList<>();
          for (User user : users) {
              userDTOS.add(new UserDTO(user.getUserId(), user.getUsername(), user.getPassword(), user.getName()));
          }
           return userDTOS;
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }

    @Override
    public UserDTO getOne(int id) {
        return null;
    }
}
