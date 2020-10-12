
package Hibernate;

import Crud.Departamento;
import Crud.Empleado;
import Crud.IDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gabrielhs
 */
public class DepDAOH implements IDAO <Departamento>{
    private Session session;
    private Departamento departamento;

    @Override
    public boolean ingresar(Departamento pojo) {
        session= HibernateUtil.getSessionFactory().openSession();  
        Transaction t = session.beginTransaction();
        try {
            session.save(pojo);
            t.commit();
        
        } catch (Exception ex) {
            t.rollback();
        }
        
        finally{
            session.close();      
                }
        return false;
    }

    @Override
    public boolean actualizar(Departamento pojo) {
        session= HibernateUtil.getSessionFactory().openSession();  
        Transaction t = session.beginTransaction();
        try {
            session.saveOrUpdate(pojo);
            t.commit();
        
        } catch (Exception ex) {
            t.rollback();
        }
        
        finally{
            session.close();      
                }
        return false;
      
    }

    @Override
    public boolean eliminar(Long id) {
        session= HibernateUtil.getSessionFactory().openSession();  
        Transaction t = session.beginTransaction();
        try {
            departamento = new Departamento();
            departamento.setId(id);
            session.delete(departamento);
            t.commit();
        
        } catch (Exception ex) {
            t.rollback();
        }
        
        finally{
            session.close();      
                }
        return false;
    }

    @Override
    public Departamento mostrarById(Long id) {
        session= HibernateUtil.getSessionFactory().openSession();  
        Transaction t = session.beginTransaction();
        try {
            departamento = new Departamento();
           departamento=(Departamento)session.get(Empleado.class, Long.valueOf(id));
            t.commit();
        
        } catch (Exception ex) {
            t.rollback();
        }
        
        finally{
            session.close();      
                }
        return departamento;
    }

    @Override
    public List mostrarAll() {
     
      return null;
    }
   
    }
    

