package orm.bd2.samuelS.bd2_samuelS;

import java.util.Date;

import javax.persistence.EntityManager;

import orm.bd2.samuelS.entities.*;
import orm.bd2.samuelS.utils.*;

public class InsertProduct {
		
		public static void main(String[] args){
			
			EntityManager em = new HibernateUtils().getEntityManager();
			int codMaq = 98013;
			
			Maquina maquina = em.find(Maquina.class, codMaq);
			System.out.println(maquina.getNome());
			
			Peca peca = new Peca();
			
			peca.setNome("Parafuso");
			peca.setMaquina(maquina);
			peca.setData(new Date());
			
			em.getTransaction().begin();
			em.persist(peca);
			em.getTransaction().commit();
			
		}
	
}
