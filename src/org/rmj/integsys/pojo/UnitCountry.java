/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.rmj.integsys.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.constants.RecordStatus;
import org.rmj.appdriver.iface.GEntity;

/**
 *
 * @author sheryl
 */
@Entity
@Table(name = "Country")
public class UnitCountry implements Serializable, GEntity{
   private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sCntryCde")
    private String sCntryCde;
    @Column(name = "sCntryNme")
    private String sCntryNme;
    @Column(name = "sNational")
    private String sNational;
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    public UnitCountry() {
       this.sCntryNme = "";
       this.cRecdStat = RecordStatus.ACTIVE;

       //set vector for fields/columns
       laColumns = new LinkedList();
       laColumns.add("sCntryCde");
       laColumns.add("sCntryNme");
       laColumns.add("sNational");
       laColumns.add("cRecdStat");
       laColumns.add("sModified");
       laColumns.add("dModified");
       
    }

    public String getCountryCde() {
        return sCntryCde;
    }

    public void setCountryCde(String sCntryCde) {
        this.sCntryCde = sCntryCde;
    }

    public String getCountryNme() {
        return sCntryNme;
    }

    public void setCountryNme(String sCntryNme) {
        this.sCntryNme = sCntryNme;
    }

    public String getNational() {
        return sNational;
    }

    public void setNational(String sNational) {
        this.sNational = sNational;
    }

    public String getRecdStat() {
        return cRecdStat;
    }

    public void setRecdStat(String cRecdStat) {
        this.cRecdStat = cRecdStat;
    }

    public String getModifiedBy() {
        return sModified;
    }

    public void setModifiedBy(String sModified) {
        this.sModified = sModified;
    }

    public Date getDateModified() {
        return dModified;
    }

    public void setDateModified(Date dModified) {
        this.dModified = dModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sCntryCde != null ? sCntryCde.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitCountry)) {
            return false;
        }
        UnitCountry other = (UnitCountry) object;
        if ((this.sCntryCde == null && other.sCntryCde != null) || (this.sCntryCde != null && !this.sCntryCde.equals(other.sCntryCde))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.rmj.integsys.pojo.UnitCountry[sCntryCde=" + sCntryCde + "]";
    }

    public Object getValue(String fsColumn){
       int lnCol = getColumn(fsColumn);
       if(lnCol > 0){
          return getValue(lnCol);
       }
       else
         return null;
    }

    public Object getValue(int fnColumn) {
      switch(fnColumn){
         case 1:
            return this.sCntryCde;
         case 2:
            return this.sCntryNme;
         case 3:
            return this.sNational;
         case 4:
            return this.cRecdStat;
         case 5:
            return this.sModified;
         case 6:
            return this.dModified;
         default:
            return null;
    }
}

    public String getTable() {
       return "Country";
    }

    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    public String getColumn(int fnCol) {
       if(laColumns.size() < fnCol)
           return "";
       else
           return (String) laColumns.get(fnCol - 1);
    }

    public void setValue(String fsColumn, Object foValue){
       int lnCol = getColumn(fsColumn);
       if(lnCol > 0){
          setValue(lnCol, foValue);
       }
    }

    public void setValue(int fnColumn, Object foValue) {
       switch(fnColumn){
            case 1:
                this.sCntryCde = (String)foValue;
                break;
            case 2:
                this.sCntryNme = (String)foValue;
                break;
            case 3:
                this.sNational = (String)foValue;
                break;
            case 4:
                this.cRecdStat = (String)foValue;
                break;
            case 5:
                this.sModified = (String)foValue;
                break;
            case 6:
                this.dModified = (Date)foValue;
                break;
        }
    }

    public int getColumnCount() {
        return laColumns.size();
    }

        @Override
    public void list(){
        Stream.of(laColumns).forEach(System.out::println);        
    }

   //Member Variables here
   LinkedList laColumns = null;

}
