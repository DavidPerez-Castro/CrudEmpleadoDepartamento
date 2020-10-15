package Hibernate;

import Crud.Departamento;
import Crud.Empleado;
import static java.awt.PageAttributes.MediaType.A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author gabrielhs
 */
public class test {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
		
		Criteria crit = session.createCriteria(Departamento.class);
		crit.setMaxResults(100);
		List<Departamento> usuarios = crit.list();
		
		for(int i = 0 ; i <usuarios.size() ; i++) {
			System.out.println("ID: " + usuarios.get(i).getId());
			System.out.println("Nombre: " + usuarios.get(i).getNombre());

		}
		
		session.close();
        
       
    }
}
