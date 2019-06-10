/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import loteria.Loteria;

/**
 *
 * @author vgirr
 */
public class LoteriaService {
    
    
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Loteria");

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Loteria guardarLoteria(Loteria loteria) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        loteria = em.merge(loteria);
        em.getTransaction().commit();
        em.close();
        return loteria;
    }

    public List<Loteria> listarLoteria() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u FROM Loteria u");
        List<Loteria> resp = (List<Loteria>) query.getResultList();
        em.close();
        return resp;
    }    
}
