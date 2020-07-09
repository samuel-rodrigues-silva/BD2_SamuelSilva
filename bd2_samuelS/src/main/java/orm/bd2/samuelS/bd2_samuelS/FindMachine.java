package orm.bd2.samuelS.bd2_samuelS;

import javax.persistence.EntityManager;

import orm.bd2.samuelS.entities.*;
import orm.bd2.samuelS.utils.*;
public class FindMachine {

	
	public static void main( String[] args){
		
		EntityManager em = new HibernateUtils().getEntityManager();
		int cod = 98013;
		Maquina maq = em.find(Maquina.class, cod);
		
		if(maq != null){
			System.out.println("Maquina encontrada: " + maq.getNome());
		}else{
			System.out.println("Maquina não encontrada");
		}
				
				
	}
}
