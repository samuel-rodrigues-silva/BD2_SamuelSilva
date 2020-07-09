package orm.bd2.samuelS.bd2_samuelS;

import javax.persistence.EntityManager;

import orm.bd2.samuelS.entities.*;
import orm.bd2.samuelS.utils.*;
public class RemoveMachine {
	
	public static void main( String[] args){
		
		EntityManager em = new HibernateUtils().getEntityManager();
		int cod = 98013;
		Maquina maq = em.find(Maquina.class, cod);
		
		if(maq != null){
			em.getTransaction().begin();
			em.remove(maq);
			em.getTransaction().commit();
			System.out.println("maquina removida");
		}else{
			System.out.println("Maquina nao encontrada");
		}
		
	}
}
