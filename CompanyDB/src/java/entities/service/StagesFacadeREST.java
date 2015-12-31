/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.service;

import entities.Stages;
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
@Path("entities.stages")
public class StagesFacadeREST extends AbstractFacade<Stages> {
    @PersistenceContext(unitName = "CompanyDBPU")
    private EntityManager em;

    public StagesFacadeREST() {
        super(Stages.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Stages entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, Stages entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }
    
    @DELETE
    @Path("{delByRef/{ref}")
    public void removeByRef(@PathParam("ref") Object ref) {
        super.remove(super.findByRef(ref));
    }

        
    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Stages find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Stages> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Stages> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @GET
    @Path("bySpecialite/{spe}")
    @Produces({"application/xml", "application/json"})
    public List<Stages> findBySpe(@PathParam("spe") String spe) {
        return super.findBySpe(spe);
    }
    
    @GET
    @Path("byTitle/{title}")
    @Produces({"application/xml", "application/json"})
    public Stages findByTitle(@PathParam("title") String title) {
        return super.byTitle(title);
    } 
    
    @GET
    @Path("byRef/{ref}")
    @Produces({"application/xml", "application/json"})
    public Stages findByRef(@PathParam("ref") String ref) {
        return super.findByRef(ref);
    }
    
    @GET
    @Path("bySiret/{siret}")
    @Produces({"application/xml", "application/json"})
    public List<Stages> findBySiret(@PathParam("siret") String siret) {
        return super.findBySiret(siret);
    }
}
