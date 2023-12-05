/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entity.Reader;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Melnikov
 */
public class ReaderFacade extends AbstractFacade<Reader>{
    
    private EntityManager em;

    public ReaderFacade() {
        super(Reader.class);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTV22LibraryPU");
        this.em = emf.createEntityManager();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}