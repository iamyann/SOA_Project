/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
    @NamedQuery(name = "Candidatures.findAllSpont", query = "SELECT c FROM Candidatures c WHERE c.refoffrestage IS NULL"),
    @NamedQuery(name = "Candidatures.findSpontForNometudiant", query = "SELECT c FROM Candidatures c WHERE c.nometudiant = :nometudiant AND c.refoffrestage IS NULL"),
    @NamedQuery(name = "Candidatures.findByPrenometudiant", query = "SELECT c FROM Candidatures c WHERE c.prenometudiant = :prenometudiant"),
    @NamedQuery(name = "Candidatures.findByCommentaires", query = "SELECT c FROM Candidatures c WHERE c.commentaires = :commentaires"),
    @NamedQuery(name = "Candidatures.findByStatutentreprise", query = "SELECT c FROM Candidatures c WHERE c.statutentreprise = :statutentreprise"),
    @NamedQuery(name = "Candidatures.findByStatutetudiant", query = "SELECT c FROM Candidatures c WHERE c.statutetudiant = :statutetudiant")})
public class Candidatures implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
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
    @Lob
    @Column(name = "CV")
    private Serializable cv;
    @Lob
    @Column(name = "LETTREMOTIV")
    private Serializable lettremotiv;
    @Size(max = 30)
    @Column(name = "COMMENTAIRES")
    private String commentaires;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "STATUTENTREPRISE")
    private String statutentreprise;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "STATUTETUDIANT")
    private String statutetudiant;
    @JoinColumn(name = "REFOFFRESTAGE", referencedColumnName = "ID")
    @ManyToOne
    private Stages refoffrestage;
    @OneToMany(mappedBy = "candidatures")
    private Collection<Entretiens> entretiensCollection;

    public Candidatures() {
    }

    public Candidatures(Integer id) {
        this.id = id;
    }

    public Candidatures(Integer id, String nometudiant, String prenometudiant, Serializable cv, String statutentreprise, String statutetudiant) {
        this.id = id;
        this.nometudiant = nometudiant;
        this.prenometudiant = prenometudiant;
        this.cv = cv;
        this.statutentreprise = statutentreprise;
        this.statutetudiant = statutetudiant;
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

    public Serializable getCv() {
        return cv;
    }

    public void setCv(Serializable cv) {
        this.cv = cv;
    }

    public Serializable getLettremotiv() {
        return lettremotiv;
    }

    public void setLettremotiv(Serializable lettremotiv) {
        this.lettremotiv = lettremotiv;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public String getStatutentreprise() {
        return statutentreprise;
    }

    public void setStatutentreprise(String statutentreprise) {
        this.statutentreprise = statutentreprise;
    }

    public String getStatutetudiant() {
        return statutetudiant;
    }

    public void setStatutetudiant(String statutetudiant) {
        this.statutetudiant = statutetudiant;
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
        return "entities.Candidatures[ id=" + id + " ]";
    }
    
}
