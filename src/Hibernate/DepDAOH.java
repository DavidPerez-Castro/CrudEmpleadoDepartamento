
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
public class DepDAOH implements IDAO <Departamento>{
    Session session= HibernateUtil.getSessionFactory().openSession();  
    Transaction transaction=session.beginTransaction();

    @Override
    public boolean ingresar(Departamento pojo) {
        session.save(pojo);
        transaction.commit();
        session.close();
        return false;
        
    }

    @Override
    public boolean actualizar(Departamento pojo) {
        session.saveOrUpdate(pojo);
        transaction.commit();
        session.close();
        return false;
      
    }

    @Override
    public boolean eliminar(Long id) {
        Departamento e = new Departamento();
        e.setId(id);
        session.delete(e);
        transaction.commit();
        session.close();
        return false;
    }

    @Override
    public Departamento mostrarById(Long id) {
        return null;
    }

    @Override
    public List mostrarAll() {
        return null;
    }
    
}
