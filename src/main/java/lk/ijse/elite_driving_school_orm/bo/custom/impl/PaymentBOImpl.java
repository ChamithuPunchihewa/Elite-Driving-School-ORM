package lk.ijse.elite_driving_school_orm.bo.custom.impl;

import lk.ijse.elite_driving_school_orm.bo.custom.PaymentBO;
import lk.ijse.elite_driving_school_orm.dao.DAOFactory;
import lk.ijse.elite_driving_school_orm.dao.custom.CourseDAO;
import lk.ijse.elite_driving_school_orm.dao.custom.PaymentDAO;
import lk.ijse.elite_driving_school_orm.dao.custom.StudentDAO;
import lk.ijse.elite_driving_school_orm.dto.LessonDTO;
import lk.ijse.elite_driving_school_orm.dto.PaymentDTO;
import lk.ijse.elite_driving_school_orm.entity.Course;
import lk.ijse.elite_driving_school_orm.entity.Payment;
import lk.ijse.elite_driving_school_orm.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class PaymentBOImpl implements PaymentBO {
    StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
    CourseDAO courseDAO = (CourseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COURSE);
    PaymentDAO paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);

    @Override
    public boolean save(PaymentDTO paymentDTO) {
        Student student = studentDAO.getOne(Integer.parseInt(paymentDTO.getStudentId())).get();
        Course course = courseDAO.getOne(Integer.parseInt(paymentDTO.getCourseId())).get();


        return paymentDAO.save(new Payment(paymentDTO.getPaymentId(), student, course, paymentDTO.getPaymentDate(), paymentDTO.getAmount(),paymentDTO.getPaymentMethod()));
    }

    @Override
    public boolean update(PaymentDTO paymentDTO) {
        Student student = studentDAO.getOne(Integer.parseInt(paymentDTO.getStudentId())).get();
        Course course = courseDAO.getOne(Integer.parseInt(paymentDTO.getCourseId())).get();


        return paymentDAO.save(new Payment(paymentDTO.getPaymentId(), student, course, paymentDTO.getPaymentDate(), paymentDTO.getAmount(),paymentDTO.getPaymentMethod()));

    }

    @Override
    public boolean delete(int id) {
        return paymentDAO.delete(id);
    }

    @Override
    public List<PaymentDTO> getAll() {
        List<PaymentDTO> paymentDTOs = null;
        try {
            List<Payment> payments = paymentDAO.getALL();
            paymentDTOs = new ArrayList<>();
            for (Payment payment : payments) {
                paymentDTOs.add(new PaymentDTO(payment.getPaymentId(), payment.getStudent().getStudentId(), payment.getCourse().getCourseId(), payment.getPaymentDate(), payment.getAmount(), payment.getPaymentMethod()));
            }
            return paymentDTOs;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public PaymentDTO getOne(int id) {
        Payment payment = paymentDAO.getOne(id).get();
        return new PaymentDTO(payment.getPaymentId(), payment.getStudent().getStudentId(), payment.getCourse().getCourseId(), payment.getPaymentDate(), payment.getAmount(), payment.getPaymentMethod());
    }
}
