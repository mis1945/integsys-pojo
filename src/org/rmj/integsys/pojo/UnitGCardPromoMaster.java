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
@Table(name = "G_Card_Promo_Master")
public class UnitGCardPromoMaster implements Serializable, GEntity {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sTransNox")
   private String sTransNox;
   @Column(name = "sPromCode")
   private String sPromCode;
   @Column(name = "sPromDesc")
   private String sPromDesc;
   @Column(name = "sCardType")
   private String sCardType;
   @Column(name = "dDateFrom")
   @Temporal(TemporalType.DATE)
   private Date dDateFrom;
   @Column(name = "dDateThru")
   @Temporal(TemporalType.DATE)
   private Date dDateThru;
   @Column(name = "sRemarksx")
   private String sRemarksx;
   @Column(name = "nPointsxx")
   private Double nPointsxx;   
   @Column(name = "cTranStat")
   private String cTranStat;
   @Column(name = "sModified")
   private String sModified;
   @Basic(optional = false)
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitGCardPromoMaster() {
      this.sCardType = "";
      this.dDateFrom = new Date();
      this.dDateThru = new Date();
      this.nPointsxx = 0.00;
      this.cTranStat = "0";
      
      //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sTransNox");
      laColumns.add("sPromCode");
      laColumns.add("sPromDesc");
      laColumns.add("sCardType");
      laColumns.add("dDateFrom");
      laColumns.add("dDateThru");
      laColumns.add("sRemarksx");
      laColumns.add("nPointsxx");      
      laColumns.add("cTranStat");
      laColumns.add("sModified");
      laColumns.add("dModified");
   }

   public String getTransNo() {
      return sTransNox;
   }

   public void setTransNo(String sTransNox) {
      this.sTransNox = sTransNox;
   }

   public String getPromoCode() {
      return sPromCode;
   }

   public void getPromoCode(String sTransNox) {
      this.sPromCode = sTransNox;
   }

   public String getPromoDesc() {
      return sPromDesc;
   }

   public void getPromoDesc(String sTransNox) {
      this.sPromDesc = sTransNox;
   }
   
   public String getCardType() {
      return sCardType;
   }

   public void setCardType(String sCardType) {
      this.sCardType = sCardType;
   }

   public Date getDateFrom() {
      return dDateFrom;
   }

   public void setDateFrom(Date dDateFrom) {
      this.dDateFrom = dDateFrom;
   }

   public Date getDateThru() {
      return dDateThru;
   }

   public void setDateThru(Date dDateThru) {
      this.dDateThru = dDateThru;
   }

   public String getRemarks() {
      return sRemarksx;
   }

   public void setRemarks(String sRemarksx) {
      this.sRemarksx = sRemarksx;
   }

   public Double getPoints() {
      return nPointsxx;
   }

   public void setPoints(double nPointsxx) {
      this.nPointsxx = nPointsxx;
   }
   
   public String getTranStat() {
      return cTranStat;
   }

   public void setTranStat(String cTranStat) {
      this.cTranStat = cTranStat;
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
      hash += (sTransNox != null ? sTransNox.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitGCardPromoMaster)) {
         return false;
      }
      UnitGCardPromoMaster other = (UnitGCardPromoMaster) object;
      if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitGCardPromoMaster[sTransNox=" + sTransNox + "]";
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
            return this.sTransNox;
         case 2:
            return this.sPromCode;
         case 3:
            return this.sPromDesc;
         case 4:
            return this.sCardType;
         case 5:
            return this.dDateFrom;
         case 6:
            return this.dDateThru;
         case 7:
            return this.sRemarksx;
         case 8:
            return this.nPointsxx;             
         case 9:
            return this.cTranStat;
         case 10:
            return this.sModified;
         case 11:
            return this.dModified;
         default:
            return null;
      }
   }

   public String getTable() {
      return "G_Card_Promo_Master";
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
            this.sTransNox = (String) foValue;
            break;
         case 2:
            this.sPromCode = (String) foValue;
            break;
         case 3:
            this.sPromDesc = (String) foValue;
            break;
         case 4:
            this.sCardType = (String) foValue;
            break;
         case 5:
            this.dDateFrom = (Date) foValue;
            break;
         case 6:
            this.dDateThru = (Date) foValue;
            break;
         case 7:
            this.sRemarksx = (String) foValue;
            break;
         case 8: 
            this.nPointsxx = (Double)foValue;
            break; 
         case 9:
            this.cTranStat = (String) foValue;
            break;
         case 10:
            this.sModified = (String) foValue;
            break;
         case 11:
            this.dModified = (Date) foValue;
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
