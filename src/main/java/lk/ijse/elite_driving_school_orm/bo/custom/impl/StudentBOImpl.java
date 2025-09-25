package lk.ijse.elite_driving_school_orm.bo.custom.impl;

import lk.ijse.elite_driving_school_orm.bo.custom.StudentBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.StudentDAO;
import lk.ijse.elite_driving_school_orm.dto.InstructorDTO;
import lk.ijse.elite_driving_school_orm.dto.StudentDTO;
import lk.ijse.elite_driving_school_orm.entity.Instructor;
import lk.ijse.elite_driving_school_orm.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentBOImpl implements StudentBO {
    StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);

    @Override
    public ArrayList<StudentDTO> getAllStudent() {
        ArrayList<StudentDTO> studentDTOs = null;
        try {
            List<Student> students = studentDAO.getALL();
            studentDTOs = new ArrayList<>();
            for (Student student : students) {
                studentDTOs.add(new StudentDTO(student.getStudentId(), student.getName(), student.getEmail(), student.getPhone(), student.getAddress(), student.getRegisterFee(), student.getRegistrationDate()));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return studentDTOs;

    }


    @Override
    public boolean delete(int id) {
        return studentDAO.delete(id);
    }

    @Override
    public boolean save(StudentDTO studentDTO) {
        return studentDAO.save(new Student(studentDTO.getStudentId(), studentDTO.getName(), studentDTO.getEmail(), studentDTO.getPhone(), studentDTO.getAddress(),studentDTO.getRegisterFee(),studentDTO.getRegistrationDate()));
    }

    @Override
    public boolean update(StudentDTO studentDTO) {
        return studentDAO.save(new Student(studentDTO.getStudentId(), studentDTO.getName(), studentDTO.getEmail(), studentDTO.getPhone(), studentDTO.getAddress(),studentDTO.getRegisterFee(),studentDTO.getRegistrationDate()));

    }

    @Override
    public StudentDTO getOne(int id) {
        Student student = studentDAO.getOne(id).get();
        return new StudentDTO(student.getStudentId(), student.getName(), student.getEmail(), student.getPhone(), student.getAddress(), student.getRegisterFee(), student.getRegistrationDate());
    }
}
