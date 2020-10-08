
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
    private Departamento departamento;
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
        departamento = new Departamento();
        departamento.setId(id);
        session.delete(departamento);
        transaction.commit();
        session.close();
        return false;
    }

    @Override
    public Departamento mostrarById(Long id) {
        departamento = new Departamento();
        departamento=(Departamento)session.get(Departamento.class, Long.valueOf(id));
        session.getTransaction().commit();
        session.close();
        return departamento;
    }

    @Override
    public List mostrarAll() {
     
      return null;
    }
   
    }
    

