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
import org.rmj.appdriver.iface.GEntity;

/**
 *
 * @author kalyptus
 */
@Entity
@Table(name = "G_Card_Points_Basis")
public class UnitGCPointsBasis implements Serializable, GEntity {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sSourceCd")
   private String sSourceCd;
   @Column(name = "sCompnyID")
   private String sCompnyID;
   @Column(name = "cCardType")
   private String cCardType;
   @Column(name = "sDescCode")
   private String sDescCode;
   @Column(name = "sDescript")
   private String sDescript;
   @Column(name = "dTransact")
   @Temporal(TemporalType.DATE)
   private Date dTransact;
   @Column(name = "nAmtPerPt")
   private Double nAmtPerPt;
   @Column(name = "nMinPoint")
   private Double nMinPoint;
   @Column(name = "nMaxPoint")
   private Double nMaxPoint;
   @Column(name = "nDiscount")
   private Double nDiscount;
   @Column(name = "nBonusPnt")
   private Integer nBonusPnt;
   @Column(name = "cSignedUp")
   private String cSignedUp;
   @Column(name = "cRecdStat")
   private String cRecdStat;
   @Column(name = "sModified")
   private String sModified;
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitGCPointsBasis() {
      this.sDescCode = "";
      this.sDescript = "";
      this.nAmtPerPt = 0.00;
      this.nBonusPnt = 0;
      this.nDiscount = 0.00;
      this.nMaxPoint = 0.00;
      this.nMinPoint = 0.00;
      this.sCompnyID = "";

       //set vector for fields/columns
       laColumns = new LinkedList();
       laColumns.add("sSourceCd");
       laColumns.add("sCompnyID");
       laColumns.add("cCardType");
       laColumns.add("sDescCode");
       laColumns.add("sDescript");
       laColumns.add("dTransact");
       laColumns.add("nAmtPerPt");
       laColumns.add("nMinPoint");
       laColumns.add("nMaxPoint");
       laColumns.add("nDiscount");
       laColumns.add("nBonusPnt");
       laColumns.add("cSignedUp");
       laColumns.add("cRecdStat");
       laColumns.add("sModified");
       laColumns.add("dModified");
   }

   public String getSourceCd() {
      return sSourceCd;
   }

   public void setSourceCd(String sSourceCd) {
      this.sSourceCd = sSourceCd;
   }

   public String getCompnyID() {
      return sCompnyID;
   }

   public void setCompnyID(String sCompnyID) {
      this.sCompnyID = sCompnyID;
   }

   public String getCardType() {
      return cCardType;
   }

   public void setCardType(String cCardType) {
      this.cCardType = cCardType;
   }

   public String getDescCode() {
      return sDescCode;
   }

   public void setDescCode(String sDescCode) {
      this.sDescCode = sDescCode;
   }

   public String getDescription() {
      return sDescript;
   }

   public void setDescription(String sDescript) {
      this.sDescript = sDescript;
   }

   public Date getTransact() {
      return dTransact;
   }

   public void setTransact(Date dTransact) {
      this.dTransact = dTransact;
   }

   public Double getAmtPerPoint() {
      return nAmtPerPt;
   }

   public void setAmtPerPoint(Double nAmtPerPt) {
      this.nAmtPerPt = nAmtPerPt;
   }

   public Double getMinPoint() {
      return nMinPoint;
   }

   public void setMinPoint(Double nMinPoint) {
      this.nMinPoint = nMinPoint;
   }

   public Double getMaxPoint() {
      return nMaxPoint;
   }

   public void setMaxPoint(Double nMaxPoint) {
      this.nMaxPoint = nMaxPoint;
   }

   public Double getDiscount() {
      return nDiscount;
   }

   public void setDiscount(Double nDiscount) {
      this.nDiscount = nDiscount;
   }

   public Integer getBonusPoint() {
      return nBonusPnt;
   }

   public void setBonusPoint(Integer nBonusPnt) {
      this.nBonusPnt = nBonusPnt;
   }

   public String getSignedUp() {
      return cSignedUp;
   }

   public void setSignedUp(String cSignedUp) {
      this.cSignedUp = cSignedUp;
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
      hash += (sSourceCd != null ? sSourceCd.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitGCPointsBasis)) {
         return false;
      }
      UnitGCPointsBasis other = (UnitGCPointsBasis) object;
      if ((this.sSourceCd == null && other.sSourceCd != null) || (this.sSourceCd != null && !this.sSourceCd.equals(other.sSourceCd))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitGCPointsBasis[sSourceCd=" + sSourceCd + "]";
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
         case  1:
            return this.sSourceCd;
         case  2:
            return this.sCompnyID;
         case  3:
            return this.cCardType;
         case  4:
            return this.sDescCode;
         case  5:
            return this.sDescript;
         case  6:
            return this.dTransact;
         case  7:
            return this.nAmtPerPt;
         case  8:
            return this.nMinPoint;
         case  9:
            return this.nMaxPoint;
         case 10:
            return this.nDiscount;
         case 11:
            return this.nBonusPnt;
         case 12:
            return this.cSignedUp;
         case 13:
            return this.cRecdStat;
         case 14:
            return this.sModified;
         case 15:
            return this.dModified;
         default:
            return null;
    }
}

    public String getTable() {
       return "G_Card_Points_Basis";
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
         case  1:
            this.sSourceCd = (String)foValue;
            break;
         case  2:
            this.sCompnyID = (String)foValue;
            break;
         case  3:
            this.cCardType = (String)foValue;
            break;
         case  4:
            this.sDescCode = (String)foValue;
            break;
         case  5:
            this.sDescript = (String)foValue;
            break;
         case  6:
            this.dTransact = (Date)foValue;
            break;
         case  7:
            this.nAmtPerPt = (Double) foValue;
            break;
         case  8:
            this.nMinPoint = (Double) foValue;
            break;
         case  9:
            this.nMaxPoint = (Double) foValue;
            break;
         case 10:
            this.nDiscount = (Double) foValue;
            break;
         case 11:
            this.nBonusPnt = (Integer) foValue;
            break;
         case 12:
            this.cSignedUp = (String)foValue;
            break;
         case 13:
            this.cRecdStat = (String)foValue;
            break;
         case 14:
            this.sModified = (String) foValue;
            break;
         case 15:
            this.dModified = (Date) foValue;
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
