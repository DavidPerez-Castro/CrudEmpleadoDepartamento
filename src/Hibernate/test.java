
package Hibernate;

import Crud.Departamento;
import Crud.Empleado;
import static java.awt.PageAttributes.MediaType.A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author gabrielhs
 */
public class test {
    
    
    public static void main(String[] args) {
        
//     EmpDAOH dao = new EmpDAOH();
//        Empleado empleado = new Empleado();
//        empleado.setId(Long.valueOf(117));
//        empleado.setNombre("pepe problemas");
//        empleado.setDireccion("aaaa");
//        empleado.setTelefono("6666");
        //dao.ingresar(empleado);
        //dao.actualizar(empleado);
        //dao.eliminar(Long.valueOf(117));
        Session session= HibernateUtil.getSessionFactory().openSession();  
    Transaction transaction=session.beginTransaction();
    
    
    Departamento dep = new Departamento();
    dep=(Departamento)session.get(Departamento.class, Long.valueOf(4));
        System.out.println("Id :" + dep.getId() + "\n" 
                + "Nombre :" + dep.getNombre() );
        session.getTransaction().commit();
        session.close();
        
            
            
       
       
    }
}
