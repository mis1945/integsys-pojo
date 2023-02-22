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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.iface.GEntity;

/**
 *
 * @author kalyptus
 */
@Entity
@Table(name = "MC_Model")
public class UnitMCModel implements Serializable, GEntity {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sModelIDx")
   private String sModelIDx;
   @Column(name = "sModelNme")
   private String sModelNme;
   @Column(name = "sModelCde")
   private String sModelCde;
   @Column(name = "sBrandIDx")
   private String sBrandIDx;
   @Column(name = "cMotorTyp")
   private String cMotorTyp;
   @Column(name = "cRegisTyp")
   private String cRegisTyp;
   @Column(name = "cRecdStat")
   private String cRecdStat;
   @Column(name = "sModified")
   private String sModified;
   @Basic(optional = false)
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitMCModel() {
      this.sModelCde = "";
      this.sModelNme = "";
      this.sBrandIDx = "";
      this.cRecdStat = "1";

       //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sModelIDx");
      laColumns.add("sModelCde");
      laColumns.add("sModelNme");
      laColumns.add("sBrandIDx");
      laColumns.add("cMotorTyp");
      laColumns.add("cRegisTyp");
      laColumns.add("cRecdStat");
      laColumns.add("sModified");
      laColumns.add("dModified");
   }

   public String getModelID() {
      return sModelIDx;
   }

   public void setModelID(String sModelIDx) {
      this.sModelIDx = sModelIDx;
   }

   public String getModelName() {
      return sModelNme;
   }

   public void setModelName(String sModelNme) {
      this.sModelNme = sModelNme;
   }

   public String getModelCode() {
      return sModelCde;
   }

   public void setModelCode(String sModelCde) {
      this.sModelCde = sModelCde;
   }

   public String getBrandID() {
      return sBrandIDx;
   }

   public void setBrandID(String sBrandIDx) {
      this.sBrandIDx = sBrandIDx;
   }

   public String getMotorType() {
      return cMotorTyp;
   }

   public void setMotorType(String cMotorTyp) {
      this.cMotorTyp = cMotorTyp;
   }

   public String getRegisType() {
      return cRegisTyp;
   }

   public void setRegisType(String cRegisTyp) {
      this.cRegisTyp = cRegisTyp;
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
      hash += (sModelIDx != null ? sModelIDx.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitMCModel)) {
         return false;
      }
      UnitMCModel other = (UnitMCModel) object;
      if ((this.sModelIDx == null && other.sModelIDx != null) || (this.sModelIDx != null && !this.sModelIDx.equals(other.sModelIDx))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitMCModel[sModelIDx=" + sModelIDx + "]";
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
            return this.sModelIDx;
         case 2:
            return this.sModelCde;
         case 3:
            return this.sModelNme;
         case 4:
            return this.sBrandIDx;
         case 5:
            return this.cMotorTyp;
         case 6:
            return this.cRegisTyp;
         case 7:
            return this.cRecdStat;
         case 8:
            return this.sModified;
         case 9:
            return this.dModified;
         default:
            return null;
      }
   }

   public String getTable() {
      return "MC_Model";
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
               this.sModelIDx = (String)foValue;
               break;
            case 2:
               this.sModelCde = (String)foValue;
               break;
            case 3:
               this.sModelNme = (String)foValue;
            case 4:
               this.sBrandIDx = (String)foValue;
               break;
            case 5:
               this.cMotorTyp = (String)foValue;
               break;
            case 6:
               this.cRegisTyp = (String)foValue;
               break;
            case 7:
               this.cRecdStat = (String)foValue;
               break;
            case 8:
               this.sModified = (String)foValue;
               break;
            case 9:
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
