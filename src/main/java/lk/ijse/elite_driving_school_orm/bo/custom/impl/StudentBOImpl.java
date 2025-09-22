package lk.ijse.elite_driving_school_orm.bo.custom.impl;

import lk.ijse.elite_driving_school_orm.bo.custom.StudentBO;
import lk.ijse.elite_driving_school_orm.dto.StudentDTO;

import java.util.ArrayList;

public class StudentBOImpl implements StudentBO {
    @Override
    public ArrayList<StudentDTO> getAllStudent() {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean save(StudentDTO studentDTO) {
        return false;
    }

    @Override
    public boolean update(StudentDTO studentDTO) {
        return false;
    }
}
