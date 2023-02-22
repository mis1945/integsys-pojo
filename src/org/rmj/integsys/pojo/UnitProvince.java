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
 * @author kalyptus
 */
@Entity
@Table(name = "Province")
public class UnitProvince implements Serializable, GEntity{
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sProvIDxx")
   private String sProvIDxx;
   @Column(name = "sProvName")
   private String sProvName;
   @Column(name = "cRecdStat")
   private String cRecdStat;
   @Column(name = "sModified")
   private String sModified;
   @Basic(optional = false)
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitProvince() {
      this.sProvName = "";
      this.cRecdStat = RecordStatus.ACTIVE;

      //set vector for fields/col
      laColumns = new LinkedList();
      laColumns.add("sProvIDxx");
      laColumns.add("sProvName");
      laColumns.add("cRecdStat");
      laColumns.add("sModified");
      laColumns.add("dModified");

   }

   public String getProvID() {
      return sProvIDxx;
   }

   public void setProvID(String sProvIDxx) {
      this.sProvIDxx = sProvIDxx;
   }

   public String getProvName() {
      return sProvName;
   }

   public void setProvName(String sProvName) {
      this.sProvName = sProvName;
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
      hash += (sProvIDxx != null ? sProvIDxx.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitProvince)) {
         return false;
      }
      UnitProvince other = (UnitProvince) object;
      if ((this.sProvIDxx == null && other.sProvIDxx != null) || (this.sProvIDxx != null && !this.sProvIDxx.equals(other.sProvIDxx))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitProvince[sProvIDxx=" + sProvIDxx + "]";
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
             return this.sProvIDxx;
         case 2:
             return this.sProvName;
         case 3:
             return this.cRecdStat;
         case 4:
            return this.sModified;
         case 5:
            return this.dModified;
        default:
            return null;
      }
   }

   public String getTable() {
      return "Province";
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
                this.sProvIDxx = (String)foValue;
                break;
            case 2:
                this.sProvName = (String)foValue;
                break;
            case 3:
                this.cRecdStat = (String)foValue;
                break;
            case 4:
                this.sModified = (String)foValue;
                break;
            case 5:
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
