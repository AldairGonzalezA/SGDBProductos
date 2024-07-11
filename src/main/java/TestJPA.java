
import jakarta.persistence.EntityManager;
import java.util.List;
import org.aldairgonzalez.webapp.model.Producto;
import org.aldairgonzalez.webapp.util.JPAUtil;

// Esta clase solo sirve para verificar la conexio jpa no es necesario enviarla 
public class TestJPA {
    private static EntityManager em = JPAUtil.getEntityManager();
    
    public static void main(String [] args){
        
        List<Producto> productos = em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();
        
        productos.forEach(producto -> System.out.println(producto));
        
    }
}
