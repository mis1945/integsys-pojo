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
@Table(name = "TownCity")
public class UnitTown implements Serializable, GEntity{
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sTownIDxx")
   private String sTownIDxx;
   @Column(name = "sTownName")
   private String sTownName;
   @Column(name = "sZippCode")
   private String sZippCode;
   @Column(name = "sProvIDxx")
   private String sProvIDxx;
   @Column(name = "cHasRoute")
   private String cHasRoute;
   @Column(name = "cRecdStat")
   private String cRecdStat;
   @Column(name = "sModified")
   private String sModified;
   @Basic(optional = false)
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitTown() {
      this.sTownName = "";
      this.sZippCode = "";
      this.sProvIDxx = "";
      this.cHasRoute = "0";
      this.cRecdStat = RecordStatus.ACTIVE;

      //set vector for fields/col
      laColumns = new LinkedList();
      laColumns.add("sTownIDxx");
      laColumns.add("sTownName");
      laColumns.add("sZippCode");
      laColumns.add("sProvIDxx");
      laColumns.add("cHasRoute");
      laColumns.add("cRecdStat");
      laColumns.add("sModified");
      laColumns.add("dModified");
   }

   public String getTownID() {
      return sTownIDxx;
   }

   public void setTownID(String sTownIDxx) {
      this.sTownIDxx = sTownIDxx;
   }

   public String getTownName() {
      return sTownName;
   }

   public void setTownName(String sTownName) {
      this.sTownName = sTownName;
   }

   public String getZippCode() {
      return sZippCode;
   }

   public void setZippCode(String sZippCode) {
      this.sZippCode = sZippCode;
   }

   public String getProvID() {
      return sProvIDxx;
   }

   public void setProvID(String sProvIDxx) {
      this.sProvIDxx = sProvIDxx;
   }

   public String getHasRoute() {
      return cHasRoute;
   }

   public void setHasRoute(String cHasRoute) {
      this.cHasRoute = cHasRoute;
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
      hash += (sTownIDxx != null ? sTownIDxx.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitTown)) {
         return false;
      }
      UnitTown other = (UnitTown) object;
      if ((this.sTownIDxx == null && other.sTownIDxx != null) || (this.sTownIDxx != null && !this.sTownIDxx.equals(other.sTownIDxx))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitTown[sTownIDxx=" + sTownIDxx + "]";
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
            return this.sTownIDxx;
         case 2:
            return this.sTownName;
         case 3:
            return this.sZippCode;
         case 4:
            return this.sProvIDxx;
         case 5:
            return this.cHasRoute;
         case 6:
            return this.cRecdStat;
         case 7:
            return this.sModified;
         case 8:
            return this.dModified;
         default:
            return null;
      }
   }

   public String getTable() {
      return "TownCity";
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
                this.sTownIDxx = (String)foValue;
                break;
            case 2:
                this.sTownName = (String)foValue;
                break;
            case 3:
                this.sZippCode = (String)foValue;
                break;
            case 4:
                this.sProvIDxx = (String)foValue;
                break;
            case 5:
                this.cHasRoute = (String)foValue;
                break;
            case 6:
                this.cRecdStat = (String)foValue;
                break;
            case 7:
                this.sModified = (String)foValue;
                break;
            case 8:
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
