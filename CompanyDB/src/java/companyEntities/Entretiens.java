/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyEntities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author Jean
 */
@Entity
@Table(name = "ENTRETIENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entretiens.findAll", query = "SELECT e FROM Entretiens e"),
    @NamedQuery(name = "Entretiens.findById", query = "SELECT e FROM Entretiens e WHERE e.id = :id"),
    @NamedQuery(name = "Entretiens.findByDaterdv", query = "SELECT e FROM Entretiens e WHERE e.daterdv = :daterdv"),
    @NamedQuery(name = "Entretiens.findByHeuredeb", query = "SELECT e FROM Entretiens e WHERE e.heuredeb = :heuredeb"),
    @NamedQuery(name = "Entretiens.findByHeurefin", query = "SELECT e FROM Entretiens e WHERE e.heurefin = :heurefin"),
    @NamedQuery(name = "Entretiens.findByResponsablerh", query = "SELECT e FROM Entretiens e WHERE e.responsablerh = :responsablerh"),
    @NamedQuery(name = "Entretiens.findByOperationnel", query = "SELECT e FROM Entretiens e WHERE e.operationnel = :operationnel"),
    @NamedQuery(name = "Entretiens.findByResponsabletechnique", query = "SELECT e FROM Entretiens e WHERE e.responsabletechnique = :responsabletechnique"),
    @NamedQuery(name = "Entretiens.findByTests", query = "SELECT e FROM Entretiens e WHERE e.tests = :tests"),
    @NamedQuery(name = "Entretiens.findByCommentaires", query = "SELECT e FROM Entretiens e WHERE e.commentaires = :commentaires")})
public class Entretiens implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATERDV")
    @Temporal(TemporalType.DATE)
    private Date daterdv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HEUREDEB")
    @Temporal(TemporalType.TIME)
    private Date heuredeb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HEUREFIN")
    @Temporal(TemporalType.TIME)
    private Date heurefin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESPONSABLERH")
    private Boolean responsablerh;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OPERATIONNEL")
    private Boolean operationnel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESPONSABLETECHNIQUE")
    private Boolean responsabletechnique;
    @Size(max = 100)
    @Column(name = "TESTS")
    private String tests;
    @Size(max = 50)
    @Column(name = "COMMENTAIRES")
    private String commentaires;
    @JoinColumn(name = "CANDIDATURES", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Candidatures candidatures;

    public Entretiens() {
    }

    public Entretiens(Integer id) {
        this.id = id;
    }

    public Entretiens(Integer id, Date daterdv, Date heuredeb, Date heurefin, Boolean responsablerh, Boolean operationnel, Boolean responsabletechnique) {
        this.id = id;
        this.daterdv = daterdv;
        this.heuredeb = heuredeb;
        this.heurefin = heurefin;
        this.responsablerh = responsablerh;
        this.operationnel = operationnel;
        this.responsabletechnique = responsabletechnique;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDaterdv() {
        return daterdv;
    }

    public void setDaterdv(Date daterdv) {
        this.daterdv = daterdv;
    }

    public Date getHeuredeb() {
        return heuredeb;
    }

    public void setHeuredeb(Date heuredeb) {
        this.heuredeb = heuredeb;
    }

    public Date getHeurefin() {
        return heurefin;
    }

    public void setHeurefin(Date heurefin) {
        this.heurefin = heurefin;
    }

    public Boolean getResponsablerh() {
        return responsablerh;
    }

    public void setResponsablerh(Boolean responsablerh) {
        this.responsablerh = responsablerh;
    }

    public Boolean getOperationnel() {
        return operationnel;
    }

    public void setOperationnel(Boolean operationnel) {
        this.operationnel = operationnel;
    }

    public Boolean getResponsabletechnique() {
        return responsabletechnique;
    }

    public void setResponsabletechnique(Boolean responsabletechnique) {
        this.responsabletechnique = responsabletechnique;
    }

    public String getTests() {
        return tests;
    }

    public void setTests(String tests) {
        this.tests = tests;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public Candidatures getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(Candidatures candidatures) {
        this.candidatures = candidatures;
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
        if (!(object instanceof Entretiens)) {
            return false;
        }
        Entretiens other = (Entretiens) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "companyEntities.Entretiens[ id=" + id + " ]";
    }
    
}
