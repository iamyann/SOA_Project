/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nana
 */
@Entity
@Table(name = "CANDIDATURES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Candidatures.findAll", query = "SELECT c FROM Candidatures c"),
    @NamedQuery(name = "Candidatures.findById", query = "SELECT c FROM Candidatures c WHERE c.id = :id"),
    @NamedQuery(name = "Candidatures.findByReferenceoffre", query = "SELECT c FROM Candidatures c WHERE c.referenceoffre = :referenceoffre"),
    @NamedQuery(name = "Candidatures.findByNumeroetudiant", query = "SELECT c FROM Candidatures c WHERE c.numeroetudiant = :numeroetudiant"),
    @NamedQuery(name = "Candidatures.findByDateentretient", query = "SELECT c FROM Candidatures c WHERE c.dateentretient = :dateentretient"),
    @NamedQuery(name = "Candidatures.findByReponsedefinitiveetudiant", query = "SELECT c FROM Candidatures c WHERE c.reponsedefinitiveetudiant = :reponsedefinitiveetudiant"),
    @NamedQuery(name = "Candidatures.findByReponsedefinitiveentreprise", query = "SELECT c FROM Candidatures c WHERE c.reponsedefinitiveentreprise = :reponsedefinitiveentreprise"),
    @NamedQuery(name = "Candidatures.findByReponsedefinitiveadmin", query = "SELECT c FROM Candidatures c WHERE c.reponsedefinitiveadmin = :reponsedefinitiveadmin"),
    @NamedQuery(name = "Candidatures.findByManagedby", query = "SELECT c FROM Candidatures c WHERE c.managedby = :managedby"),
    @NamedQuery(name = "Candidatures.findByStatus", query = "SELECT c FROM Candidatures c WHERE c.status = :status")})
public class Candidatures implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "REFERENCEOFFRE")
    private String referenceoffre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NUMEROETUDIANT")
    private String numeroetudiant;
    @Column(name = "DATEENTRETIENT")
    @Temporal(TemporalType.TIME)
    private Date dateentretient;
    @Column(name = "REPONSEDEFINITIVEETUDIANT")
    private Boolean reponsedefinitiveetudiant;
    @Column(name = "REPONSEDEFINITIVEENTREPRISE")
    private Boolean reponsedefinitiveentreprise;
    @Column(name = "REPONSEDEFINITIVEADMIN")
    private Boolean reponsedefinitiveadmin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MANAGEDBY")
    private String managedby;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "STATUS")
    private String status;

    public Candidatures() {
    }

    public Candidatures(Integer id) {
        this.id = id;
    }

    public Candidatures(Integer id, String referenceoffre, String numeroetudiant, String managedby, String status) {
        this.id = id;
        this.referenceoffre = referenceoffre;
        this.numeroetudiant = numeroetudiant;
        this.managedby = managedby;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReferenceoffre() {
        return referenceoffre;
    }

    public void setReferenceoffre(String referenceoffre) {
        this.referenceoffre = referenceoffre;
    }

    public String getNumeroetudiant() {
        return numeroetudiant;
    }

    public void setNumeroetudiant(String numeroetudiant) {
        this.numeroetudiant = numeroetudiant;
    }

    public Date getDateentretient() {
        return dateentretient;
    }

    public void setDateentretient(Date dateentretient) {
        this.dateentretient = dateentretient;
    }

    public Boolean getReponsedefinitiveetudiant() {
        return reponsedefinitiveetudiant;
    }

    public void setReponsedefinitiveetudiant(Boolean reponsedefinitiveetudiant) {
        this.reponsedefinitiveetudiant = reponsedefinitiveetudiant;
    }

    public Boolean getReponsedefinitiveentreprise() {
        return reponsedefinitiveentreprise;
    }

    public void setReponsedefinitiveentreprise(Boolean reponsedefinitiveentreprise) {
        this.reponsedefinitiveentreprise = reponsedefinitiveentreprise;
    }

    public Boolean getReponsedefinitiveadmin() {
        return reponsedefinitiveadmin;
    }

    public void setReponsedefinitiveadmin(Boolean reponsedefinitiveadmin) {
        this.reponsedefinitiveadmin = reponsedefinitiveadmin;
    }

    public String getManagedby() {
        return managedby;
    }

    public void setManagedby(String managedby) {
        this.managedby = managedby;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Candidatures)) {
            return false;
        }
        Candidatures other = (Candidatures) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Candidatures[ id=" + id + " ]";
    }
    
}
