package easy.users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AdministratorRepository {
	
	private EntityManagerFactory entityManagerFactory;
	
	public void openEntityManagerFactory() {
		entityManagerFactory = Persistence.createEntityManagerFactory("easyDataBase");
	}
	
	public void closeEntityManagerFactory() {
		entityManagerFactory.close();
	}
	
	public void inItData(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Administrator mainAdmin = new Administrator();
		mainAdmin.setLogin("abcd1234");
		mainAdmin.setNameOfAdministrator("Michal");
		
		entityManager.getTransaction().begin();
		entityManager.persist(mainAdmin);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
		
	}

	public boolean exist(String input) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		Query query = entityManager.createQuery("select count(a.id) from Administrator a where a.nameOfAdministrator = :name");
		query.setParameter("name", input);
		
		long count = (long)query.getSingleResult();
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
		if(count>0) {
			return true;
		}
		return false;
	}
	

	
	

}
