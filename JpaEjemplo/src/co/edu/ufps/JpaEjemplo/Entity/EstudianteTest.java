package co.edu.ufps.JpaEjemplo.Entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EstudianteTest {

	public static void main(String[] args) {
	
		
		Estudiante estudiante= new Estudiante();
		estudiante.setCodigo(1151812);
		estudiante.setNombre("Reinaldo");
		estudiante.setSemestre("6");		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEjemplo");
		EntityManager em= emf.createEntityManager();		
		em.getTransaction().begin();
		em.persist(estudiante);
		em.getTransaction().commit();
		em.close();
	}

}
