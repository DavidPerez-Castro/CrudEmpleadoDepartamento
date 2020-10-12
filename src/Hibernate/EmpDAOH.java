
package Hibernate;


import Crud.Empleado;
import Crud.IDAO;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gabrielhs
 */
public class EmpDAOH implements IDAO <Empleado> {
  
    private Session session;
    private Empleado empleado;

    @Override
    public boolean ingresar(Empleado pojo) {
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
    public boolean actualizar(Empleado pojo) {
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
            empleado = new Empleado();
            empleado.setId(id);
            session.delete(empleado);
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
    public Empleado mostrarById(Long id) {
        session= HibernateUtil.getSessionFactory().openSession();  
        Transaction t = session.beginTransaction();
        try {
            empleado = new Empleado();
           empleado=(Empleado)session.get(Empleado.class, Long.valueOf(id));
            t.commit();
        
        } catch (Exception ex) {
            t.rollback();
        }
        
        finally{
            session.close();      
                }
        return empleado;
         
    }
    @Override
    public List mostrarAll() {
        return null;
    }
    
}
