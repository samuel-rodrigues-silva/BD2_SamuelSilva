package orm.bd2.samuelS.bd2_samuelS;
import javax.persistence.EntityManager;

import orm.bd2.samuelS.entities.*;
import orm.bd2.samuelS.utils.*;
public class InsertSerial {

	public static void main(String args[]){
		
		EntityManager em = new HibernateUtils().getEntityManager();
		
		Maquina maq = new Maquina();
		
		maq.setCodigo(98013);
		maq.setNome("Torno mecânico");
		maq.setPreco(20000.0f);
		maq.setTipo("usinagem");
		
		
		em.getTransaction().begin();
		em.persist(maq);
		em.getTransaction().commit();
		
	}
	
	
}
