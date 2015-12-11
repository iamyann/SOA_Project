/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyentity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jean
 */
@Entity
@Table(name = "CANDIDATURESSPONTAN\u00c9ES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Candidaturesspontan\u00e9es.findAll", query = "SELECT c FROM Candidaturesspontan\u00e9es c"),
    @NamedQuery(name = "Candidaturesspontan\u00e9es.findById", query = "SELECT c FROM Candidaturesspontan\u00e9es c WHERE c.id = :id"),
    @NamedQuery(name = "Candidaturesspontan\u00e9es.findByNometudiant", query = "SELECT c FROM Candidaturesspontan\u00e9es c WHERE c.nometudiant = :nometudiant"),
    @NamedQuery(name = "Candidaturesspontan\u00e9es.findByPrenometudiant", query = "SELECT c FROM Candidaturesspontan\u00e9es c WHERE c.prenometudiant = :prenometudiant"),
    @NamedQuery(name = "Candidaturesspontan\u00e9es.findByCv", query = "SELECT c FROM Candidaturesspontan\u00e9es c WHERE c.cv = :cv"),
    @NamedQuery(name = "Candidaturesspontan\u00e9es.findByLettremotiv", query = "SELECT c FROM Candidaturesspontan\u00e9es c WHERE c.lettremotiv = :lettremotiv"),
    @NamedQuery(name = "Candidaturesspontan\u00e9es.findByCommentaires", query = "SELECT c FROM Candidaturesspontan\u00e9es c WHERE c.commentaires = :commentaires")})
public class Candidaturesspontanées implements Serializable {
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
    @Size(min = 1, max = 20)
    @Column(name = "CV")
    private String cv;
    @Size(max = 30)
    @Column(name = "LETTREMOTIV")
    private String lettremotiv;
    @Size(max = 50)
    @Column(name = "COMMENTAIRES")
    private String commentaires;

    public Candidaturesspontanées() {
    }

    public Candidaturesspontanées(Integer id) {
        this.id = id;
    }

    public Candidaturesspontanées(Integer id, String nometudiant, String prenometudiant, String cv) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Candidaturesspontanées)) {
            return false;
        }
        Candidaturesspontanées other = (Candidaturesspontanées) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.companyentity.Candidaturesspontan\u00e9es[ id=" + id + " ]";
    }
    
}
