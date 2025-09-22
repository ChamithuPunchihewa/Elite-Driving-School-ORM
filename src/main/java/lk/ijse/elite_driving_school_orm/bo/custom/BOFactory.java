package lk.ijse.elite_driving_school_orm.bo.custom;


import lk.ijse.elite_driving_school_orm.bo.custom.impl.StudentBOImpl;

public class BOFactory {

    private static BOFactory boFactory;
    private BOFactory(){

    }
    public static BOFactory getBoFactory(){
        return (boFactory == null) ? new BOFactory() : boFactory;
    }
    public enum BOTypes{
        STUDENT,
//        COURSE,
//        INSTRUCTOR,
//        LESSON,
//        PAYMENT,
//        USER
    }
    public StudentBOImpl getBO(BOTypes boType) {
        switch(boType){
            case STUDENT:
                return new StudentBOImpl();
            default:
                return null;
        }
    }
}