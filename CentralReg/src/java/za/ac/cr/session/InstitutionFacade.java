/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cr.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.cr.entity.Institution;

/**
 *
 * @author QXW5421
 */
@Stateless
public class InstitutionFacade extends AbstractFacade<Institution> {

    @PersistenceContext(unitName = "CentralRegPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InstitutionFacade() {
        super(Institution.class);
    }
    
}
