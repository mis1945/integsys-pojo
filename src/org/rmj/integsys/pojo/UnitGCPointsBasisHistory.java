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
@Table(name = "G_Card_Points_Basis_History")
public class UnitGCPointsBasisHistory implements Serializable, GEntity {
   private static final long serialVersionUID = 1L;

   @Id
   @Basic(optional = false)
   @Column(name = "sSourceCd")
   private String sSourceCd;
   @Column(name = "nTranLine")
   private String nTranLine;
   @Column(name = "cCardType")
   private String cCardType;
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
   @Column(name = "cRecdStat")
   private String cRecdStat;
   @Column(name = "sModified")
   private String sModified;
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitGCPointsBasisHistory() {
       //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sSourceCd");
      laColumns.add("nTranLine");
      laColumns.add("cCardType");
      laColumns.add("sDescript");
      laColumns.add("dTransact");
      laColumns.add("nAmtPerPt");
      laColumns.add("nMinPoint");
      laColumns.add("nMaxPoint");
      laColumns.add("nDiscount");
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

   public String getTranline() {
      return nTranLine;
   }

   public void getTranLine(String nTranLine) {
      this.nTranLine = nTranLine;
   }

   public String getCardType() {
      return cCardType;
   }

   public void setCardType(String cCardType) {
      this.cCardType = cCardType;
   }

   public String getDescription() {
      return sDescript;
   }

   public void setDescription(String sDescript) {
      this.sDescript = sDescript;
   }

   public Date getTransactDate() {
      return dTransact;
   }

   public void setTransactDate(Date dTransact) {
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
      if (!(object instanceof UnitGCPointsBasisHistory)) {
         return false;
      }
      UnitGCPointsBasisHistory other = (UnitGCPointsBasisHistory) object;
      if ((this.sSourceCd == null && other.sSourceCd != null) || (this.sSourceCd != null && !this.sSourceCd.equals(other.sSourceCd))) {
         return false;
      }

      if ((this.nTranLine == null && other.nTranLine != null) || (this.nTranLine != null && !this.nTranLine.equals(other.nTranLine))) {
         return false;
      }

      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitGCPointsBasisHistory[sSourceCd=" + sSourceCd + ", nTranLine=" + nTranLine + "]";
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
            return this.nTranLine;
         case  3:
            return this.cCardType;
         case  4:
            return this.sDescript;
         case  5:
            return this.dTransact;
         case  6:
            return this.nAmtPerPt;
         case  7:
            return this.nMinPoint;
         case  8:
            return this.nMaxPoint;
         case  9:
            return this.nDiscount;
         case 10:
            return this.cRecdStat;
         case 11:
            return this.sModified;
         case 12:
            return this.dModified;
         default:
            return null;
      }
   }

   public String getTable() {
      return "G_Card_Point_Basis_History";
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
            this.sSourceCd = (String) foValue;
            break;
         case  2:
            this.nTranLine = (String) foValue;
            break;
         case  3:
            this.cCardType = (String) foValue;
            break;
         case  4:
            this.sDescript = (String) foValue;
            break;
         case  5:
            this.dTransact = (Date) foValue;
            break;
         case  6:
            this.nAmtPerPt = (Double) foValue;
            break;
         case  7:
            this.nMinPoint = (Double) foValue;
            break;
         case  8:
            this.nMaxPoint = (Double) foValue;
            break;
         case  9:
            this.nDiscount = (Double) foValue;
            break;
         case 10:
            this.cRecdStat = (String) foValue;
            break;
         case 11:
            this.sModified = (String) foValue;
            break;
         case 12:
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
