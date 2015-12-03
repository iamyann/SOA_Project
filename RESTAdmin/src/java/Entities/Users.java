/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nana
 */
@Entity
@Table(name = "USERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUsersid", query = "SELECT u FROM Users u WHERE u.usersid = :usersid"),
    @NamedQuery(name = "Users.findByUserpassword", query = "SELECT u FROM Users u WHERE u.userpassword = :userpassword"),
    @NamedQuery(name = "Users.findByUsermail", query = "SELECT u FROM Users u WHERE u.usermail = :usermail"),
    @NamedQuery(name = "Users.findByUserrights", query = "SELECT u FROM Users u WHERE u.userrights = :userrights")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "USERSID")
    private Integer usersid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "USERPASSWORD")
    private String userpassword;
    @Size(max = 255)
    @Column(name = "USERMAIL")
    private String usermail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USERRIGHTS")
    private int userrights;

    public Users() {
    }

    public Users(Integer usersid) {
        this.usersid = usersid;
    }

    public Users(Integer usersid, String userpassword, int userrights) {
        this.usersid = usersid;
        this.userpassword = userpassword;
        this.userrights = userrights;
    }

    public Integer getUsersid() {
        return usersid;
    }

    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }

    public int getUserrights() {
        return userrights;
    }

    public void setUserrights(int userrights) {
        this.userrights = userrights;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersid != null ? usersid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.usersid == null && other.usersid != null) || (this.usersid != null && !this.usersid.equals(other.usersid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Users[ usersid=" + usersid + " ]";
    }
    
}
