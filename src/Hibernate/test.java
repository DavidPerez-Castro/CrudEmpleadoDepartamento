
package Hibernate;

import Crud.Empleado;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author gabrielhs
 */
public class test {
    
    
    public static void main(String[] args) {
        
     EmpDAOH dao = new EmpDAOH();
        Empleado empleado = new Empleado();
        empleado.setId(Long.valueOf(117));
        empleado.setNombre("pepe problemas");
        empleado.setDireccion("aaaa");
        empleado.setTelefono("6666");
        //dao.ingresar(empleado);
        //dao.actualizar(empleado);
        //dao.eliminar(Long.valueOf(117));
        
       
       
    }
}
