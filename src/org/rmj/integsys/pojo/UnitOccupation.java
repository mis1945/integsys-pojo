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
@Table(name = "Occupation")
public class UnitOccupation implements Serializable, GEntity{
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sOccptnID")
   private String sOccptnID;
   @Column(name = "sOccptnNm")
   private String sOccptnNm;
   @Column(name = "cApproved")
   private String cApproved;
   @Column(name = "cRecdStat")
   private String cRecdStat;
   @Column(name = "sModified")
   private String sModified;
   @Basic(optional = false)
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitOccupation() {
      this.sOccptnNm = "";
      this.cRecdStat = RecordStatus.ACTIVE;
      this.cApproved = "0";

      //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sOccptnID");
      laColumns.add("sOccptnNm");
      laColumns.add("cApproved");
      laColumns.add("cRecdStat");
      laColumns.add("sModified");
      laColumns.add("dModified");

   }

   public String getOccptnID() {
      return sOccptnID;
   }

   public void setOccptnID(String sOccptnID) {
      this.sOccptnID = sOccptnID;
   }

   public String getOccptnNm() {
      return sOccptnNm;
   }

   public void setOccptnNm(String sOccptnNm) {
      this.sOccptnNm = sOccptnNm;
   }

   public String getApproved() {
      return cApproved;
   }

   public void setApproved(String cApproved) {
      this.cApproved = cApproved;
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
      hash += (sOccptnID != null ? sOccptnID.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitOccupation)) {
         return false;
      }
      UnitOccupation other = (UnitOccupation) object;
      if ((this.sOccptnID == null && other.sOccptnID != null) || (this.sOccptnID != null && !this.sOccptnID.equals(other.sOccptnID))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitOccupation[sOccptnID=" + sOccptnID + "]";
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
            return this.sOccptnID;
         case 2:
            return this.sOccptnNm;
         case 3:
            return this.cApproved;
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
      return "Occupation";
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
                this.sOccptnID = (String)foValue;
                break;
            case 2:
                this.sOccptnNm = (String)foValue;
                break;
            case 3:
                this.cApproved = (String)foValue;
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
