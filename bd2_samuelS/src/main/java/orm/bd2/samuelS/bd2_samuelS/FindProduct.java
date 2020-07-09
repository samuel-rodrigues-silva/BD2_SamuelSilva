package orm.bd2.samuelS.bd2_samuelS;

import javax.persistence.EntityManager;

import orm.bd2.samuelS.entities.*;
import orm.bd2.samuelS.utils.*;
public class FindProduct {
	
	public static void main( String[] args){
		
		EntityManager em = HibernateUtils.getEntityManager();
		int cod = 1;
	
		Peca peca = em.find(Peca.class,cod);
		
		if(peca != null){
			System.out.println("Peça: " + peca.getNome() + ", codigo: " + peca.getCodigo() + ", data de fabricação: " + peca.getData());
		}else{
			System.out.println("Peça não encontrada!!");
			
		}
		
		
		
	}

}
