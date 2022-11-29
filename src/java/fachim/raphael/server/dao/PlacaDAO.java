/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachim.raphael.server.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import fachim.raphael.server.models.Placa;
import java.util.List;
/**
 *
 * @author raphael.fachim
 */
@Stateless
public class PlacaDAO {
    @PersistenceContext(unitName = "JMSserverPU")
    private EntityManager em;
    
    public void save(Placa placa){
        em.persist(placa);
    }
    
    public List<Placa> findAll(){
        return (List<Placa>) em.createQuery("FROM placas").getResultList();
    }
}
