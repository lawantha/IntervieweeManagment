/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "data", catalog = "cvman", schema = "")
@NamedQueries({
    @NamedQuery(name = "Data.findAll", query = "SELECT d FROM Data d")
    , @NamedQuery(name = "Data.findByName", query = "SELECT d FROM Data d WHERE d.name = :name")
    , @NamedQuery(name = "Data.findByAge", query = "SELECT d FROM Data d WHERE d.age = :age")
    , @NamedQuery(name = "Data.findByNic", query = "SELECT d FROM Data d WHERE d.nic = :nic")
    , @NamedQuery(name = "Data.findByAddress", query = "SELECT d FROM Data d WHERE d.address = :address")
    , @NamedQuery(name = "Data.findByPhone", query = "SELECT d FROM Data d WHERE d.phone = :phone")
    , @NamedQuery(name = "Data.findByEmail", query = "SELECT d FROM Data d WHERE d.email = :email")
    , @NamedQuery(name = "Data.findByGender", query = "SELECT d FROM Data d WHERE d.gender = :gender")
    , @NamedQuery(name = "Data.findByAl", query = "SELECT d FROM Data d WHERE d.al = :al")
    , @NamedQuery(name = "Data.findByDiploma", query = "SELECT d FROM Data d WHERE d.diploma = :diploma")
    , @NamedQuery(name = "Data.findByDegree", query = "SELECT d FROM Data d WHERE d.degree = :degree")
    , @NamedQuery(name = "Data.findByStatus", query = "SELECT d FROM Data d WHERE d.status = :status")})
public class Data implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "Name")
    private String name;
    @Column(name = "Age")
    private Integer age;
    @Id
    @Basic(optional = false)
    @Column(name = "NIC")
    private String nic;
    @Column(name = "Address")
    private String address;
    @Column(name = "Phone")
    private Integer phone;
    @Column(name = "Email")
    private String email;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "AL")
    private String al;
    @Column(name = "Diploma")
    private String diploma;
    @Column(name = "Degree")
    private String degree;
    @Column(name = "Status")
    private String status;

    public Data() {
    }

    public Data(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        Integer oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        String oldNic = this.nic;
        this.nic = nic;
        changeSupport.firePropertyChange("nic", oldNic, nic);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        Integer oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getAl() {
        return al;
    }

    public void setAl(String al) {
        String oldAl = this.al;
        this.al = al;
        changeSupport.firePropertyChange("al", oldAl, al);
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        String oldDiploma = this.diploma;
        this.diploma = diploma;
        changeSupport.firePropertyChange("diploma", oldDiploma, diploma);
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        String oldDegree = this.degree;
        this.degree = degree;
        changeSupport.firePropertyChange("degree", oldDegree, degree);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nic != null ? nic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data)) {
            return false;
        }
        Data other = (Data) object;
        if ((this.nic == null && other.nic != null) || (this.nic != null && !this.nic.equals(other.nic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Interface.Data[ nic=" + nic + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
