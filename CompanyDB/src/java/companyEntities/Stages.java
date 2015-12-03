/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyEntities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jean
 */
@Entity
@Table(name = "STAGES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stages.findAll", query = "SELECT s FROM Stages s"),
    @NamedQuery(name = "Stages.findById", query = "SELECT s FROM Stages s WHERE s.id = :id"),
    @NamedQuery(name = "Stages.findByTitresujet", query = "SELECT s FROM Stages s WHERE s.titresujet = :titresujet"),
    @NamedQuery(name = "Stages.findByReference", query = "SELECT s FROM Stages s WHERE s.reference = :reference"),
    @NamedQuery(name = "Stages.findByDescriptionsujet", query = "SELECT s FROM Stages s WHERE s.descriptionsujet = :descriptionsujet"),
    @NamedQuery(name = "Stages.findByCompetences", query = "SELECT s FROM Stages s WHERE s.competences = :competences"),
    @NamedQuery(name = "Stages.findByRemuneration", query = "SELECT s FROM Stages s WHERE s.remuneration = :remuneration"),
    @NamedQuery(name = "Stages.findByLocaux", query = "SELECT s FROM Stages s WHERE s.locaux = :locaux"),
    @NamedQuery(name = "Stages.findByContactname", query = "SELECT s FROM Stages s WHERE s.contactname = :contactname"),
    @NamedQuery(name = "Stages.findByContacttel", query = "SELECT s FROM Stages s WHERE s.contacttel = :contacttel"),
    @NamedQuery(name = "Stages.findByContactweb", query = "SELECT s FROM Stages s WHERE s.contactweb = :contactweb"),
    @NamedQuery(name = "Stages.findByTypecontrat", query = "SELECT s FROM Stages s WHERE s.typecontrat = :typecontrat"),
    @NamedQuery(name = "Stages.findByDuree", query = "SELECT s FROM Stages s WHERE s.duree = :duree")})
public class Stages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TITRESUJET")
    private String titresujet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "REFERENCE")
    private String reference;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPTIONSUJET")
    private String descriptionsujet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "COMPETENCES")
    private String competences;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "REMUNERATION")
    private String remuneration;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LOCAUX")
    private String locaux;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CONTACTNAME")
    private String contactname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CONTACTTEL")
    private String contacttel;
    @Size(max = 20)
    @Column(name = "CONTACTWEB")
    private String contactweb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TYPECONTRAT")
    private String typecontrat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DUREE")
    private String duree;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "refoffrestage")
    private Collection<Candidatures> candidaturesCollection;

    public Stages() {
    }

    public Stages(Integer id) {
        this.id = id;
    }

    public Stages(Integer id, String titresujet, String reference, String descriptionsujet, String competences, String remuneration, String locaux, String contactname, String contacttel, String typecontrat, String duree) {
        this.id = id;
        this.titresujet = titresujet;
        this.reference = reference;
        this.descriptionsujet = descriptionsujet;
        this.competences = competences;
        this.remuneration = remuneration;
        this.locaux = locaux;
        this.contactname = contactname;
        this.contacttel = contacttel;
        this.typecontrat = typecontrat;
        this.duree = duree;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitresujet() {
        return titresujet;
    }

    public void setTitresujet(String titresujet) {
        this.titresujet = titresujet;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescriptionsujet() {
        return descriptionsujet;
    }

    public void setDescriptionsujet(String descriptionsujet) {
        this.descriptionsujet = descriptionsujet;
    }

    public String getCompetences() {
        return competences;
    }

    public void setCompetences(String competences) {
        this.competences = competences;
    }

    public String getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(String remuneration) {
        this.remuneration = remuneration;
    }

    public String getLocaux() {
        return locaux;
    }

    public void setLocaux(String locaux) {
        this.locaux = locaux;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel;
    }

    public String getContactweb() {
        return contactweb;
    }

    public void setContactweb(String contactweb) {
        this.contactweb = contactweb;
    }

    public String getTypecontrat() {
        return typecontrat;
    }

    public void setTypecontrat(String typecontrat) {
        this.typecontrat = typecontrat;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    @XmlTransient
    public Collection<Candidatures> getCandidaturesCollection() {
        return candidaturesCollection;
    }

    public void setCandidaturesCollection(Collection<Candidatures> candidaturesCollection) {
        this.candidaturesCollection = candidaturesCollection;
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
        if (!(object instanceof Stages)) {
            return false;
        }
        Stages other = (Stages) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "companyEntities.Stages[ id=" + id + " ]";
    }
    
}
