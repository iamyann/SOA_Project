/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package entities.service;

import entities.Stages;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Jean
 */
public abstract class AbstractFacade<T> {
    private Class<T> entityClass;
    
    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
    
    protected abstract EntityManager getEntityManager();
    
    public void create(T entity) {
        getEntityManager().persist(entity);
    }
    
    public void edit(T entity) {
        getEntityManager().merge(entity);
    }
    
    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }
    
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }
    
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }
    
    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }
    
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
    public List<T> findBySpe(Object specialite) {
        Query request = getEntityManager().createNamedQuery("Stages.findBySpecialite");
        request.setParameter("specialite", specialite);
        return request.getResultList();
    }
    
    /**
     * Returns an offer according to its title
     * @param title Title of the offer
     * @return The offer
     */
    public Stages byTitle(String title) {
        Stages stage = new Stages();
        Query request = getEntityManager().createNamedQuery("Stages.findByTitresujet");
        request.setParameter("title", title);
        return stage ;
    }
    
  
    List<T> findByRef(Object ref) {
        Query request = getEntityManager().createNamedQuery("Stages.findByReference");
        request.setParameter("reference", ref);
        return request.getResultList();
    }
    //***Develop by ChocoBoy
    //***return application for a candidat    
    List<T> findByCand(Object nometudiant) {
        Query request = getEntityManager().createNamedQuery("Candidatures.findByNometudiant");
        request.setParameter("nometudiant", nometudiant);
        return request.getResultList();
    }
    
    //***Develop by ChocoBoy
    //***return application for a Company 
    List<T> findBySiret(Object siret) {
    Query request = getEntityManager().createNamedQuery("Stages.findBySiret");
        request.setParameter("siret", siret);
        return request.getResultList();
    }
    
    /**
     * Return all spontaneous applications
     * @return List of all spontaneous applications
     */
    List<T> getSpontList(){
        Query request = getEntityManager().createNamedQuery("Candidatures.findAllSpont");
        return request.getResultList();
    }
    
    /**
     * Return the list of all spontaneous applications for a given student
     * @param nometudiant Name of the student
     * @return List of the student's spontaneous applications
     */
    List<T> getSpontForName(Object nometudiant){
        Query request = getEntityManager().createNamedQuery("Candidatures.findSpontForNometudiant");
        request.setParameter("nometudiant", nometudiant);
        return request.getResultList();
    }
    
    
}
