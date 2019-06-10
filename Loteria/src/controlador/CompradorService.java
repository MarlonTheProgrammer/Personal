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
import loteria.Comprador;

/**
 *
 * @author vgirr
 */
public class CompradorService {
    
    
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Loteria");

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public Comprador guardarComprador(Comprador comprador) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        comprador = em.merge(comprador);
        em.getTransaction().commit();
        em.close();
        return comprador;
    }

    public List<Comprador> listarCompradores() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u FROM Comprador u");
        List<Comprador> resp = (List<Comprador>) query.getResultList();
        em.close();
        return resp;
    }

    public Comprador consultarAsesor(String id) {
        EntityManager em = getEntityManager();
        Comprador resp = em.find(Comprador.class, id);
        em.close();
        return resp;
    }     
}
