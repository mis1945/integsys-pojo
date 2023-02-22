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
@Table(name = "G_Card_Master")
public class UnitGCard implements Serializable, GEntity {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sGCardNox")
   private String sGCardNox;
   @Column(name = "sCompnyID")
   private String sCompnyID;
   @Column(name = "cLocation")
   private String cLocation;
   @Column(name = "sClientID")
   private String sClientID;
   @Column(name = "dMemberxx")
   @Temporal(TemporalType.DATE)
   private Date dMemberxx;
   @Column(name = "cCardType")
   private String cCardType;
   @Column(name = "sCardNmbr")
   private String sCardNmbr;
   @Column(name = "sPINumber")
   private String sPINumber;
   @Column(name = "dActivate")
   @Temporal(TemporalType.DATE)
   private Date dActivate;
   @Column(name = "dCardExpr")
   @Temporal(TemporalType.DATE)
   private Date dCardExpr;
   @Column(name = "sLastLine")
   private String sLastLine;
   @Column(name = "nPointsxx")
   private Double nPointsxx;
   @Column(name = "nTotPoint")
   private Double nTotPoint;
   @Column(name = "nAvlPoint")
   private Double nAvlPoint;
   @Column(name = "dLastRedm")
   @Temporal(TemporalType.DATE)
   private Date dLastRedm;
   @Column(name = "cCardStat")
   private String cCardStat;
   @Column(name = "cForUpdte")
   private String cForUpdte;
   @Column(name = "sApplicNo")
   private String sApplicNo;
   @Column(name = "sGroupIDx")
   private String sGroupIDx;
   @Column(name = "cIndvlPts")
   private String cIndvlPts;
   @Column(name = "cMainGrpx")
   private String cMainGrpx;
   @Column(name = "cDigitalx")
   private String cDigitalx;
   @Column(name = "sModified")
   private String sModified;
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitGCard() {
      this.dMemberxx = new Date();
      this.cCardStat = "0";
      this.cCardType = "0";
      this.cForUpdte = "0";
      this.nAvlPoint = 0.00;
      this.nPointsxx = 0.00;
      this.nTotPoint = 0.00;
      this.cLocation = "1";
      this.sCompnyID = "";
      this.sApplicNo = "";
      this.sClientID = "";

      this.sGroupIDx = "";
      this.cIndvlPts = "1";
      this.cMainGrpx = "0";
      this.cDigitalx = "0";
      
       //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sGCardNox");
      laColumns.add("sCompnyID");
      laColumns.add("cLocation");
      laColumns.add("sClientID");
      laColumns.add("dMemberxx");
      laColumns.add("cCardType");
      laColumns.add("sCardNmbr");
      laColumns.add("sPINumber");
      laColumns.add("dActivate");
      laColumns.add("dCardExpr");
      laColumns.add("nPointsxx");
      laColumns.add("nTotPoint");
      laColumns.add("nAvlPoint");
      laColumns.add("dLastRedm");
      laColumns.add("sLastLine");
      laColumns.add("cCardStat");
      laColumns.add("cForUpdte");
      laColumns.add("sApplicNo");
      laColumns.add("sGroupIDx");
      laColumns.add("cIndvlPts");
      laColumns.add("cMainGrpx");
      laColumns.add("cDigitalx");
      laColumns.add("sModified");
      laColumns.add("dModified");
   }

   public String getGCardNo() {
      return sGCardNox;
   }

   public void setGCardNo(String sGCardNox) {
      this.sGCardNox = sGCardNox;
   }

   public String getCompanyID() {
      return sCompnyID;
   }

   public void setCompanyID(String sCompnyID) {
      this.sCompnyID = sCompnyID;
   }

   public String getLocation() {
      return cLocation;
   }

   public void setLocation(String cLocation) {
      this.cLocation = cLocation;
   }

   public String getClientID() {
      return sClientID;
   }

   public void setClientID(String sClientID) {
      this.sClientID = sClientID;
   }

   public Date getMemberSince() {
      return dMemberxx;
   }

   public void setMemberSince(Date dMemberxx) {
      this.dMemberxx = dMemberxx;
   }

   public String getCardType() {
      return cCardType;
   }

   public void setCardType(String cCardType) {
      this.cCardType = cCardType;
   }

   public String getCardNumber() {
      return sCardNmbr;
   }

   public void setCardNumber(String sCardNmbr) {
      this.sCardNmbr = sCardNmbr;
   }

   public String getPINumber() {
      return sPINumber;
   }

   public void setPINumber(String sPINumber) {
      this.sPINumber = sPINumber;
   }

   public Date getDateActivated() {
      return dActivate;
   }

   public void setDateActivated(Date dActivate) {
      this.dActivate = dActivate;
   }

   public Date getExpiryDate() {
      return dCardExpr;
   }

   public void setExpiryDate(Date dCardExpr) {
      this.dCardExpr = dCardExpr;
   }

   public Double getPoints() {
      return nPointsxx;
   }

   public void setPoints(Double nPointsxx) {
      this.nPointsxx = nPointsxx;
   }

   public Double getTotalPoints() {
      return nTotPoint;
   }

   public void setTotalPoints(Double nTotPoint) {
      this.nTotPoint = nTotPoint;
   }

   public Double getAvailablePoints() {
      return nAvlPoint;
   }

   public void setAvailablePoints(Double nAvlPoint) {
      this.nAvlPoint = nAvlPoint;
   }

   public Date getLastRedemption() {
      return dLastRedm;
   }

   public void setLastRedemption(Date dLastRedm) {
      this.dLastRedm = dLastRedm;
   }

   public String getLastLine() {
      return sLastLine;
   }

   public void setsLastLine(String sLastLine) {
      this.sLastLine = sLastLine;
   }

   public String getCardStat() {
      return cCardStat;
   }

   public void setCardStat(String cCardStat) {
      this.cCardStat = cCardStat;
   }

   public boolean getIsForUpdte() {
      return cForUpdte.equals("1") ;
   }

   public void setIsForUpdte(boolean bForUpdte) {
      this.cForUpdte = bForUpdte ? "1" : "0";
   }

   public String getApplicNo() {
      return sApplicNo;
   }

   public void setApplicNo(String sApplicNo) {
      this.sApplicNo = sApplicNo;
   }

   public String getGroupID() {
      return sGroupIDx;
   }

   public void setGroupID(String sGroupID) {
      this.sGroupIDx = sGroupID;
   }
   
   public String getIsIndividual() {
      return cIndvlPts;
   }

   public void setIsIndividual(String cIndvlPts) {
      this.cIndvlPts = cIndvlPts;
   }

   public String getIsMother() {
      return cMainGrpx;
   }

   public void setIsMother(String cMainGrpx) {
      this.cMainGrpx = cMainGrpx;
   }
   
   public String getDigital() {
      return cDigitalx;
   }

   public void setDigital(String cDigitalx) {
      this.cDigitalx = cDigitalx;
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
      hash += (sGCardNox != null ? sGCardNox.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitGCard)) {
         return false;
      }
      UnitGCard other = (UnitGCard) object;
      if ((this.sGCardNox == null && other.sGCardNox != null) || (this.sGCardNox != null && !this.sGCardNox.equals(other.sGCardNox))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitGCardMaster[sGCardNox=" + sGCardNox + "]";
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
            return this.sGCardNox;
         case  2:
            return this.sCompnyID;
         case  3:
            return this.cLocation;
         case  4:
            return this.sClientID;
         case  5:
            return this.dMemberxx;
         case  6:
            return this.cCardType;
         case  7:
            return this.sCardNmbr;
         case  8:
            return this.sPINumber;
         case  9:
            return this.dActivate;
         case 10:
            return this.dCardExpr;
         case 11:
            return this.nPointsxx;
         case 12:
            return this.nTotPoint;
         case 13:
            return this.nAvlPoint;
         case 14:
            return this.dLastRedm;
         case 15:
            return this.sLastLine;
         case 16:
            return this.cCardStat;
         case 17:
            return this.cForUpdte;
         case 18:
            return this.sApplicNo;
         case 19:
            return this.sGroupIDx;
         case 20:
            return this.cIndvlPts;
         case 21:
            return this.cMainGrpx;
         case 22:
            return this.cDigitalx;
         case 23:
            return this.sModified;
         case 24:
            return this.dModified;
         default:
            return null;
      }
   }

   public String getTable() {
      return "G_Card_Master";
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
            this.sGCardNox = (String) foValue;
            break;
         case 2:
            this.sCompnyID = (String) foValue;
            break;
         case 3:
            this.cLocation = (String) foValue;
            break;
         case 4:
            this.sClientID = (String) foValue;
            break;
         case 5:
            this.dMemberxx = (Date) foValue;
            break;
         case 6:
            this.cCardType = (String) foValue;
            break;
         case 7:
            this.sCardNmbr = (String) foValue;
            break;
         case 8:
            this.sPINumber = (String) foValue;
            break;
         case 9:
            this.dActivate = (Date) foValue;
            break;
         case 10:
            this.dCardExpr = (Date) foValue;
            break;
         case 11:
            this.nPointsxx = (Double) foValue;
            break;
         case 12:
            this.nTotPoint = (Double) foValue;
            break;
         case 13:
            this.nAvlPoint = (Double) foValue;
            break;
         case 14:
            this.dLastRedm = (Date) foValue;
            break;
         case 15:
            this.sLastLine = (String) foValue;
            break;
         case 16:
            this.cCardStat = (String) foValue;
            break;
         case 17:
            this.cForUpdte = (String) foValue;
            break;
         case 18:
            this.sApplicNo = (String) foValue;
            break;
         case 19:
            this.sGroupIDx = (String) foValue;
            break;
         case 20:
            this.cIndvlPts = (String) foValue;
            break;
         case 21:
            this.cMainGrpx = (String) foValue;
            break;
         case 22:
            this.cDigitalx = (String) foValue;
            break;
         case 23:
            this.sModified = (String) foValue;
            break;
         case 24:
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
