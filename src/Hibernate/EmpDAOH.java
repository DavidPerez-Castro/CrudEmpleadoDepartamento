
package Hibernate;

import Crud.Departamento;
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
    Session session= HibernateUtil.getSessionFactory().openSession();  
    Transaction transaction=session.beginTransaction();
    private Empleado e;

    @Override
    public boolean ingresar(Empleado pojo) {
       
        session.save(pojo);
        transaction.commit();
        session.close();
        return false;
    }

    @Override
    public boolean actualizar(Empleado pojo) {
        session.saveOrUpdate(pojo);
        transaction.commit();
        session.close();
        return false;
        
    }

    @Override
    public boolean eliminar(Long id) {
        e = new Empleado();
        e.setId(id);
        session.delete(e);
        transaction.commit();
        session.close();
        return false;
        
    }

    @Override
    public Empleado mostrarById(Long id) {
        e = new Empleado();
        e=(Empleado)session.get(Empleado.class, Long.valueOf(id));
        session.getTransaction().commit();
        session.close();
        return e;
        
    }
    @Override
    public List mostrarAll() {
        return null;
    }
    
}
