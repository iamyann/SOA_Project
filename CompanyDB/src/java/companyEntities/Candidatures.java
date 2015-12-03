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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CANDIDATURES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Candidatures.findAll", query = "SELECT c FROM Candidatures c"),
    @NamedQuery(name = "Candidatures.findById", query = "SELECT c FROM Candidatures c WHERE c.id = :id"),
    @NamedQuery(name = "Candidatures.findByNometudiant", query = "SELECT c FROM Candidatures c WHERE c.nometudiant = :nometudiant"),
    @NamedQuery(name = "Candidatures.findByPrenometudiant", query = "SELECT c FROM Candidatures c WHERE c.prenometudiant = :prenometudiant"),
    @NamedQuery(name = "Candidatures.findByCv", query = "SELECT c FROM Candidatures c WHERE c.cv = :cv"),
    @NamedQuery(name = "Candidatures.findByLettremotiv", query = "SELECT c FROM Candidatures c WHERE c.lettremotiv = :lettremotiv"),
    @NamedQuery(name = "Candidatures.findByCommentaires", query = "SELECT c FROM Candidatures c WHERE c.commentaires = :commentaires")})
public class Candidatures implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOMETUDIANT")
    private String nometudiant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PRENOMETUDIANT")
    private String prenometudiant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CV")
    private String cv;
    @Size(max = 30)
    @Column(name = "LETTREMOTIV")
    private String lettremotiv;
    @Size(max = 30)
    @Column(name = "COMMENTAIRES")
    private String commentaires;
    @JoinColumn(name = "REFOFFRESTAGE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Stages refoffrestage;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "candidatures")
    private Collection<Entretiens> entretiensCollection;

    public Candidatures() {
    }

    public Candidatures(Integer id) {
        this.id = id;
    }

    public Candidatures(Integer id, String nometudiant, String prenometudiant, String cv) {
        this.id = id;
        this.nometudiant = nometudiant;
        this.prenometudiant = prenometudiant;
        this.cv = cv;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNometudiant() {
        return nometudiant;
    }

    public void setNometudiant(String nometudiant) {
        this.nometudiant = nometudiant;
    }

    public String getPrenometudiant() {
        return prenometudiant;
    }

    public void setPrenometudiant(String prenometudiant) {
        this.prenometudiant = prenometudiant;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getLettremotiv() {
        return lettremotiv;
    }

    public void setLettremotiv(String lettremotiv) {
        this.lettremotiv = lettremotiv;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public Stages getRefoffrestage() {
        return refoffrestage;
    }

    public void setRefoffrestage(Stages refoffrestage) {
        this.refoffrestage = refoffrestage;
    }

    @XmlTransient
    public Collection<Entretiens> getEntretiensCollection() {
        return entretiensCollection;
    }

    public void setEntretiensCollection(Collection<Entretiens> entretiensCollection) {
        this.entretiensCollection = entretiensCollection;
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
        return "companyEntities.Candidatures[ id=" + id + " ]";
    }
    
}
