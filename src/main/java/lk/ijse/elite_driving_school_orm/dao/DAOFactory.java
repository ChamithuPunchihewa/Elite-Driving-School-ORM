package lk.ijse.elite_driving_school_orm.dao;

import lk.ijse.elite_driving_school_orm.dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory(){}
     public static DAOFactory getInstance(){return daoFactory == null ? daoFactory = new DAOFactory() : daoFactory;}

    public enum DAOTypes{
        COURSE,
        LESSON,
        INSTRUCTOR,
        STUDENT,
        USER,
        PAYMENT;

    }

    public SuperDAO getDAO(DAOTypes daoType){
        switch(daoType){
            case COURSE:
                return new CourseDAOImpl();
                case LESSON:
                    return new LessonDAOImpl();
                    case INSTRUCTOR:
                        return new InstructorDAOImpl();
                        case STUDENT:
                            return new StudentDAOImpl();
                            case USER:
                                return new UserDAOImpl();
                                case PAYMENT:
                                    return new PaymentDAOImpl();
                                    default:
                                        return null;
        }
    }
}
