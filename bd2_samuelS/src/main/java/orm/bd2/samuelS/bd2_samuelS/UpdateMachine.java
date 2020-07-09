package orm.bd2.samuelS.bd2_samuelS;

import javax.persistence.EntityManager;

import orm.bd2.samuelS.entities.*;
import orm.bd2.samuelS.utils.*;

public class UpdateMachine {
	

	public static void main( String[] args){
		
		EntityManager em = new HibernateUtils().getEntityManager();
		
		int cod = 98013;
		
		Maquina maq = em.find(Maquina.class, cod);
		System.out.println("nome anterior: " + maq.getNome() + " preço anterior: " + maq.getPreco());
		maq.setNome("seladora");
		maq.setPreco(3000.00f);
		
		em.getTransaction().begin();
		em.merge(maq);
		em.getTransaction().commit();
		
		System.out.println("nome atual: " + maq.getNome() + " preço atual: " + maq.getPreco());
	}

}
