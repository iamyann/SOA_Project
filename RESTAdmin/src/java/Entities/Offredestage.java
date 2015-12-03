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
@Table(name = "OFFREDESTAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Offredestage.findAll", query = "SELECT o FROM Offredestage o"),
    @NamedQuery(name = "Offredestage.findByReference", query = "SELECT o FROM Offredestage o WHERE o.reference = :reference"),
    @NamedQuery(name = "Offredestage.findByEntreprise", query = "SELECT o FROM Offredestage o WHERE o.entreprise = :entreprise"),
    @NamedQuery(name = "Offredestage.findByLocaux", query = "SELECT o FROM Offredestage o WHERE o.locaux = :locaux"),
    @NamedQuery(name = "Offredestage.findByContactname", query = "SELECT o FROM Offredestage o WHERE o.contactname = :contactname"),
    @NamedQuery(name = "Offredestage.findByContacttel", query = "SELECT o FROM Offredestage o WHERE o.contacttel = :contacttel"),
    @NamedQuery(name = "Offredestage.findByContactmail", query = "SELECT o FROM Offredestage o WHERE o.contactmail = :contactmail"),
    @NamedQuery(name = "Offredestage.findByContactweb", query = "SELECT o FROM Offredestage o WHERE o.contactweb = :contactweb"),
    @NamedQuery(name = "Offredestage.findBySpecialitesconcernees", query = "SELECT o FROM Offredestage o WHERE o.specialitesconcernees = :specialitesconcernees"),
    @NamedQuery(name = "Offredestage.findByTypecontrat", query = "SELECT o FROM Offredestage o WHERE o.typecontrat = :typecontrat"),
    @NamedQuery(name = "Offredestage.findByDuree", query = "SELECT o FROM Offredestage o WHERE o.duree = :duree"),
    @NamedQuery(name = "Offredestage.findByDureede", query = "SELECT o FROM Offredestage o WHERE o.dureede = :dureede"),
    @NamedQuery(name = "Offredestage.findByDureea", query = "SELECT o FROM Offredestage o WHERE o.dureea = :dureea"),
    @NamedQuery(name = "Offredestage.findByRemuneration", query = "SELECT o FROM Offredestage o WHERE o.remuneration = :remuneration"),
    @NamedQuery(name = "Offredestage.findByCompetencesrequises", query = "SELECT o FROM Offredestage o WHERE o.competencesrequises = :competencesrequises"),
    @NamedQuery(name = "Offredestage.findByProfilrecherche", query = "SELECT o FROM Offredestage o WHERE o.profilrecherche = :profilrecherche"),
    @NamedQuery(name = "Offredestage.findBySujet", query = "SELECT o FROM Offredestage o WHERE o.sujet = :sujet"),
    @NamedQuery(name = "Offredestage.findByAddedby", query = "SELECT o FROM Offredestage o WHERE o.addedby = :addedby")})
public class Offredestage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "REFERENCE")
    private String reference;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ENTREPRISE")
    private String entreprise;
    @Size(max = 255)
    @Column(name = "LOCAUX")
    private String locaux;
    @Size(max = 255)
    @Column(name = "CONTACTNAME")
    private String contactname;
    @Size(max = 255)
    @Column(name = "CONTACTTEL")
    private String contacttel;
    @Size(max = 255)
    @Column(name = "CONTACTMAIL")
    private String contactmail;
    @Size(max = 255)
    @Column(name = "CONTACTWEB")
    private String contactweb;
    @Size(max = 25)
    @Column(name = "SPECIALITESCONCERNEES")
    private String specialitesconcernees;
    @Size(max = 30)
    @Column(name = "TYPECONTRAT")
    private String typecontrat;
    @Size(max = 20)
    @Column(name = "DUREE")
    private String duree;
    @Column(name = "DUREEDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dureede;
    @Column(name = "DUREEA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dureea;
    @Column(name = "REMUNERATION")
    private Integer remuneration;
    @Size(max = 1000)
    @Column(name = "COMPETENCESREQUISES")
    private String competencesrequises;
    @Size(max = 1000)
    @Column(name = "PROFILRECHERCHE")
    private String profilrecherche;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "SUJET")
    private String sujet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ADDEDBY")
    private int addedby;

    public Offredestage() {
    }

    public Offredestage(String reference) {
        this.reference = reference;
    }

    public Offredestage(String reference, String entreprise, String sujet, int addedby) {
        this.reference = reference;
        this.entreprise = entreprise;
        this.sujet = sujet;
        this.addedby = addedby;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
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

    public String getContactmail() {
        return contactmail;
    }

    public void setContactmail(String contactmail) {
        this.contactmail = contactmail;
    }

    public String getContactweb() {
        return contactweb;
    }

    public void setContactweb(String contactweb) {
        this.contactweb = contactweb;
    }

    public String getSpecialitesconcernees() {
        return specialitesconcernees;
    }

    public void setSpecialitesconcernees(String specialitesconcernees) {
        this.specialitesconcernees = specialitesconcernees;
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

    public Date getDureede() {
        return dureede;
    }

    public void setDureede(Date dureede) {
        this.dureede = dureede;
    }

    public Date getDureea() {
        return dureea;
    }

    public void setDureea(Date dureea) {
        this.dureea = dureea;
    }

    public Integer getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(Integer remuneration) {
        this.remuneration = remuneration;
    }

    public String getCompetencesrequises() {
        return competencesrequises;
    }

    public void setCompetencesrequises(String competencesrequises) {
        this.competencesrequises = competencesrequises;
    }

    public String getProfilrecherche() {
        return profilrecherche;
    }

    public void setProfilrecherche(String profilrecherche) {
        this.profilrecherche = profilrecherche;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public int getAddedby() {
        return addedby;
    }

    public void setAddedby(int addedby) {
        this.addedby = addedby;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reference != null ? reference.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Offredestage)) {
            return false;
        }
        Offredestage other = (Offredestage) object;
        if ((this.reference == null && other.reference != null) || (this.reference != null && !this.reference.equals(other.reference))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Offredestage[ reference=" + reference + " ]";
    }
    
}
