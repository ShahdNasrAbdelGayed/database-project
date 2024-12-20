package project;
import javax.persistence.*;
import java.util.List;


public class CRUD {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("myUnit");

    public void createPerson(String name, int age) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person = new Person();
        person.setName(name);
        person.setId(age);
        em.persist(person);
        em.getTransaction().commit();
        em.close();
    }

    public Person readPerson(long id) {
        EntityManager em = emf.createEntityManager();
        Person person = em.find(Person.class, id);
        em.close();
        return person;
    }

    public void updatePerson(long id, String newName, int newAge) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person = em.find(Person.class, id);
        person.setName(newName);
        person.setId(newAge);
        em.getTransaction().commit();
        em.close();
    }

    public void deletePerson(long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person = em.find(Person.class, id);
        if (person != null) {
            em.remove(person);
        }
        em.getTransaction().commit();
        em.close();
    }

    public List<Person> listPeople() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class);
        List<Person> people = query.getResultList();
        em.close();
        return people;
    
    }
  

