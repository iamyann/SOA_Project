/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.service;

import entities.Candidatures;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Jean
 */
@Stateless
@Path("entities.candidatures")
public class CandidaturesFacadeREST extends AbstractFacade<Candidatures> {
    @PersistenceContext(unitName = "CompanyDBPU")
    private EntityManager em;

    public CandidaturesFacadeREST() {
        super(Candidatures.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Candidatures entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Candidatures entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Candidatures find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Candidatures> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Candidatures> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }
    
    @GET
    @Path("CandidatureIndividuel/{nometudiant}")
    @Produces({"application/xml", "application/json"})
    public List<Candidatures>dByCand(@PathParam("nometudiant") String nometudiant) {
        return super.findByCand(nometudiant);
    }
    
    @GET
    @Path("CandidatureSponts")
    @Produces({"application/xml", "application/json"})
    public List<Candidatures> getSpontList() {
        return super.getSpontList();
    }
    
    @GET
    @Path("CandidatureSpont/byName/{nometudiant}")
    @Produces({"application/xml", "application/json"})
    public List<Candidatures> findSpontByName(Object nometudiant) {
        return super.getSpontForName(nometudiant);
    }
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
