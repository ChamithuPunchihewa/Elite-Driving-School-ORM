package lk.ijse.elite_driving_school_orm.bo.custom.impl;

import lk.ijse.elite_driving_school_orm.bo.custom.InstructorBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.InstructorDAO;
import lk.ijse.elite_driving_school_orm.dto.CourseDTO;
import lk.ijse.elite_driving_school_orm.dto.InstructorDTO;
import lk.ijse.elite_driving_school_orm.entity.Course;
import lk.ijse.elite_driving_school_orm.entity.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorBOImpl implements InstructorBO {
    InstructorDAO instructorDAO = (InstructorDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.INSTRUCTOR);
    @Override
    public boolean save(InstructorDTO instructorDTO) {
        return instructorDAO.save(new Instructor(instructorDTO.getInstructorId(), instructorDTO.getName(), instructorDTO.getEmail(), instructorDTO.getPhone(),instructorDTO.isAvailability()));
    }

    @Override
    public boolean update(InstructorDTO instructorDTO) {
        return instructorDAO.save(new Instructor(instructorDTO.getInstructorId(), instructorDTO.getName(), instructorDTO.getEmail(), instructorDTO.getPhone(),instructorDTO.isAvailability()));
    }

    @Override
    public boolean delete(int id) {
        return instructorDAO.delete(id);
    }

    @Override
    public List<InstructorDTO> getAll() {
        List<InstructorDTO> instructorDTOs = null;
        try {
            List<Instructor> instructors = instructorDAO.getALL();
            instructorDTOs = new ArrayList<>();
            for (Instructor instructor : instructors) {
                instructorDTOs.add(new InstructorDTO(instructor.getInstructorId(), instructor.getName(), instructor.getEmail(), instructor.getPhone(),instructor.isAvailability()));
            }
            return instructorDTOs;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
            }

    @Override
    public InstructorDTO getOne(int id) {
        Instructor instructor = instructorDAO.getOne(id).get();
        return new InstructorDTO(instructor.getInstructorId(), instructor.getName(), instructor.getEmail(), instructor.getPhone(),instructor.isAvailability());
    }


}
