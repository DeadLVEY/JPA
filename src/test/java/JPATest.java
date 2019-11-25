import cn.itcast.domain.Customer;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by 瑾 on 2019/11/25.
 */
public class JPATest {
    @Test
    public void testSave(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
        EntityManager em = factory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(new Customer(null,"tom","百度","1","IT","110","火烧连营"));
        tx.commit();
        em.clear();
        factory.close();
    }
}
