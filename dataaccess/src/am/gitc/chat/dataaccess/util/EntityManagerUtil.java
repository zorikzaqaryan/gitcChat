package am.gitc.chat.dataaccess.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;

public class EntityManagerUtil {
	
	private static EntityManagerFactory entityManagerFactory= null;

	public static synchronized EntityManager getEntityManager() {
		try{
			if (entityManagerFactory == null) {
				createEntityManagerFactory();
			}
			return entityManagerFactory.createEntityManager();			
		}catch (Exception e) {
			throw new RuntimeException("Failed to create EntityManager",e);
		}		
	}
	public static void createEntityManagerFactory() {

		HashMap<String,String> config = new HashMap();
		config.put("hibernate.connection.username", "root");
		config.put("hibernate.connection.password", "");
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("JPAConfig", config);
		} catch (Exception e) {
			throw new RuntimeException("Failed to create EntityManagerFactory",e);
		}
	}

	public static void close() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
	}
}
