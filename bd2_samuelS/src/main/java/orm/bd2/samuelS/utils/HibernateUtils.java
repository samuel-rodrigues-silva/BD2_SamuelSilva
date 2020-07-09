package orm.bd2.samuelS.utils;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtils {

	
	public static EntityManager getEntityManager(){
		
		EntityManagerFactory emFactory = null; 
		
		try{
			emFactory = Persistence.createEntityManagerFactory("bd2_JPA");
		}catch(Throwable e){
			System.err.println("Error creating EntityManagerFactory ." + e);
			throw new ExceptionInInitializerError(e);
		}
		
		
		return emFactory.createEntityManager();
	}
	
}	
