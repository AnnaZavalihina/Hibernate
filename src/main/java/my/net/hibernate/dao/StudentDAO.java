package my.net.hibernate.dao;

import my.net.hibernate.entity.Student;
import my.net.hibernate.util.HibernateUtilXml;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAO {
    public void saveStudent(Student student){
        Transaction transaction = null;
        try (
            Session session = HibernateUtilXml.getSessionFactory().openSession()){
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(student);
            // commit transaction
            transaction.commit();
        } catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    public List <Student> getStudents(){
        try(Session session = HibernateUtilXml.getSessionFactory().openSession()){
            return session.createQuery("from Student", Student.class).list();
        }
    }
}
