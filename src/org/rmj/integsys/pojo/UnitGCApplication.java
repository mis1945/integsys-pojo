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
@Table(name = "G_Card_Application")
public class UnitGCApplication implements Serializable, GEntity {
   private static final long serialVersionUID = 1L;

   @Id
   @Basic(optional = false)
   @Column(name = "sTransNox")
   private String sTransNox;
   @Column(name = "dTransact")
   @Temporal(TemporalType.DATE)
   private Date dTransact;
   @Column(name = "sSourceCd")
   private String sSourceCd;
   @Column(name = "sModelIDx")
   private String sModelIDx;
   @Column(name = "cPurcMode")
   private String cPurcMode;
   @Column(name = "nAcctTerm")
   private Integer nAcctTerm;
   @Column(name = "sClientID")
   private String sClientID;
   @Column(name = "sSrceInfo")
   private String sSrceInfo;
   @Column(name = "sReasonsx")
   private String sReasonsx;
   @Column(name = "cCardType")
   private String cCardType;
   @Column(name = "cApplType")
   private String cApplType;
   @Column(name = "sPrevGCrd")
   private String sPrevGCrd;
   @Column(name = "sSourceNo")
   private String sSourceNo;
   @Column(name = "nAmtPaidx")
   private Double nAmtPaidx;
   @Column(name = "sNmOnCard")
   private String sNmOnCard;
   @Column(name = "sCompnyID")
   private String sCompnyID;
   @Column(name = "sSoldByxx")
   private String sSoldByxx;
   @Column(name = "sSerialID")
   private String sSerialID;
   @Column(name = "nWhitexxx")
   private Integer nWhitexxx;
   @Column(name = "nYellowxx")
   private Integer nYellowxx;
   @Column(name = "nPointsxx")
   private Double nPointsxx;
   @Column(name = "cDigitalx")
   private String cDigitalx;
   @Column(name = "sModified")
   private String cTranStat;
   @Column(name = "sModified")
   private String sModified;
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitGCApplication() {
      this.dTransact = new Date();
      this.sClientID = "";
      this.sSourceCd = "";
      this.sSourceNo = "";
      this.cPurcMode = "0";            // Cash
      this.cCardType = "0";            // Premium
      this.cApplType = "1";            // New
      this.sSrceInfo = "000000000000000";
      this.sReasonsx = "0000000000";
      this.nAmtPaidx = 0.00;
      this.nAcctTerm = 0;
      this.sSerialID = "";
      this.nWhitexxx = 0;
      this.nYellowxx = 0;
      this.nPointsxx = 0.00;
      this.cDigitalx = "0";
      this.cTranStat = "0";
      
       //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sTransNox");
      laColumns.add("dTransact");
      laColumns.add("sSourceCd");
      laColumns.add("sModelIDx");
      laColumns.add("cPurcMode");
      laColumns.add("nAcctTerm");
      laColumns.add("sClientID");
      laColumns.add("sSrceInfo");
      laColumns.add("sReasonsx");
      laColumns.add("cCardType");
      laColumns.add("cApplType");
      laColumns.add("sPrevGCrd");
      laColumns.add("sSourceNo");
      laColumns.add("nAmtPaidx");
      laColumns.add("sNmOnCard");
      laColumns.add("sCompnyID");
      laColumns.add("sSoldByxx");
      laColumns.add("sSerialID");
      laColumns.add("nWhitexxx");
      laColumns.add("nYellowxx");
      laColumns.add("nPointsxx");
      laColumns.add("cDigitalx");
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

   public Date getTransactDate() {
      return dTransact;
   }

   public void setTransactDate(Date dTransact) {
      this.dTransact = dTransact;
   }

   public String getSource() {
      return sSourceCd;
   }

   public void setSource(String sSourceCd) {
      this.sSourceCd = sSourceCd;
   }

   public String getModelID() {
      return sModelIDx;
   }

   public void setModelID(String sModelIDx) {
      this.sModelIDx = sModelIDx;
   }

   public String getPurchaseMode() {
      return cPurcMode;
   }

   public void setPurchaseMode(String cPurcMode) {
      this.cPurcMode = cPurcMode;
   }

   public Integer getTerm() {
      return nAcctTerm;
   }

   public void setTerm(Integer nAcctTerm) {
      this.nAcctTerm = nAcctTerm;
   }

   public String getClientID() {
      return sClientID;
   }

   public void setClientID(String sClientID) {
      this.sClientID = sClientID;
   }

   public String getSourceInfo() {
      return sSrceInfo;
   }

   public void setSourceInfo(String sSrceInfo) {
      this.sSrceInfo = sSrceInfo;
   }

   public String getReasons() {
      return sReasonsx;
   }

   public void setReasons(String sReasonsx) {
      this.sReasonsx = sReasonsx;
   }

   public String getCardType() {
      return cCardType;
   }

   public void setCardType(String cCardType) {
      this.cCardType = cCardType;
   }

   public String getApplicationType() {
      return cApplType;
   }

   public void setApplicationType(String cApplType) {
      this.cApplType = cApplType;
   }

   public String getPreviousGCard() {
      return sPrevGCrd;
   }

   public void setPreviousGCard(String sPrevGCrd) {
      this.sPrevGCrd = sPrevGCrd;
   }

   public String getSourceNo() {
      return sSourceNo;
   }

   public void setSourceNo(String sSourceNo) {
      this.sSourceNo = sSourceNo;
   }

   public Double getAmountPaid() {
      return nAmtPaidx;
   }

   public void setAmountPaid(Double nAmtPaidx) {
      this.nAmtPaidx = nAmtPaidx;
   }

   public String getNameOnCard() {
      return sNmOnCard;
   }

   public void setNameOnCard(String sNmOnCard) {
      this.sNmOnCard = sNmOnCard;
   }

   public String getCompanyID() {
      return sCompnyID;
   }

   public void setCompanyID(String sCompnyID) {
      this.sCompnyID = sCompnyID;
   }

   public String getSoldBy() {
      return sSoldByxx;
   }

   public void setSoldBy(String sSoldByxx) {
      this.sSoldByxx = sSoldByxx;
   }

   public String getSerialID() {
      return sSerialID;
   }

   public void setSerialID(String sSerialID) {
      this.sSerialID = sSerialID;
   }

   public Integer getWhite() {
      return nWhitexxx;
   }

   public void setWhite(Integer nWhitexxx) {
      this.nWhitexxx = nWhitexxx;
   }
   
   public Integer getYellow() {
      return nYellowxx;
   }

   public void setYellow(Integer nYellowxx) {
      this.nYellowxx = nYellowxx;
   }

   public Double getPoints() {
      return nPointsxx;
   }

   public void setPoints(Double nPointsxx) {
      this.nPointsxx = nPointsxx;
   }

   public String getDigital() {
      return cDigitalx;
   }

   public void setDigital(String cDigitalx) {
      this.cDigitalx = cDigitalx;
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
      if (!(object instanceof UnitGCApplication)) {
         return false;
      }
      UnitGCApplication other = (UnitGCApplication) object;
      if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitGCardApplication[sTransNox=" + sTransNox + "]";
   }

    public Object getValue(String fsColumn){
       int lnCol = getColumn(fsColumn);
       if(lnCol > 0){
          return getValue(lnCol);
       }
       else
         return null;
    }

   public Object getValue(int fnCol) {
      switch(fnCol){
         case  1:
            return this.sTransNox;
         case  2:
            return this.dTransact;
         case  3:
            return this.sSourceCd;
         case  4:
            return this.sModelIDx;
         case  5:
            return this.cPurcMode;
         case  6:
            return this.nAcctTerm;
         case  7:
            return this.sClientID;
         case  8:
            return this.sSrceInfo;
         case  9:
            return this.sReasonsx;
         case 10:
            return this.cCardType;
         case 11:
            return this.cApplType;
         case 12:
            return this.sPrevGCrd;
         case 13:
            return this.sSourceNo;
         case 14:
            return this.nAmtPaidx;
         case 15:
            return this.sNmOnCard;
         case 16:
            return this.sCompnyID;
         case 17:
            return this.sSoldByxx;
         case 18:
            return this.sSerialID;
         case 19:
            return this.nWhitexxx;
         case 20:
            return this.nYellowxx;
         case 21:
            return this.nPointsxx;
         case 22:
             return this.cDigitalx;
         case 23:
            return this.cTranStat;
         case 24:
            return this.sModified;
         case 25:
            return this.dModified;
         default:
            return null;
      }
   }
   public String getTable() {
      return "G_Card_Application";
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
            this.sTransNox = (String) foValue;
            break;
         case  2:
            this.dTransact = (Date) foValue;
            break;
         case  3:
            this.sSourceCd = (String) foValue;
            break;
         case  4:
            this.sModelIDx = (String) foValue;
            break;
         case  5:
            this.cPurcMode = (String) foValue;
            break;
         case  6:
            this.nAcctTerm = (Integer) foValue;
            break;
         case  7:
            this.sClientID = (String) foValue;
            break;
         case  8:
            this.sSrceInfo = (String) foValue;
            break;
         case  9:
            this.sReasonsx = (String) foValue;
            break;
         case 10:
            this.cCardType = (String) foValue;
            break;
         case 11:
            this.cApplType = (String) foValue;
            break;
         case 12:
            this.sPrevGCrd = (String) foValue;
            break;
         case 13:
            this.sSourceNo = (String) foValue;
            break;
         case 14:
            this.nAmtPaidx = (Double) foValue;
            break;
         case 15:
            this.sNmOnCard = (String) foValue;
            break;
         case 16:
            this.sCompnyID = (String) foValue;
            break;
         case 17:
            this.sSoldByxx = (String) foValue;
            break;
         case 18:
            this.sSerialID = (String) foValue;
            break;
         case 19:
            this.nWhitexxx = (Integer) foValue;
            break;
         case 20:
            this.nYellowxx = (Integer) foValue;
            break;
         case 21:
            this.nPointsxx = (Double) foValue;
            break;
         case 22:
             this.cDigitalx = (String) foValue;
             break;
         case 23:
            this.cTranStat = (String) foValue;
            break;
         case 24:
            this.sModified = (String) foValue;
            break;
         case 25:
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

