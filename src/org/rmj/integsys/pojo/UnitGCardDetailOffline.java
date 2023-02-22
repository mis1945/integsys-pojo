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
import javax.persistence.EmbeddedId;
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
@Table(name = "G_Card_Detail_Offline")
public class UnitGCardDetailOffline implements Serializable, GEntity {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sTransNox")
   private String sTransNox;
   @Column(name = "sGCardNox")
   private String sGCardNox;
   @Column(name = "sCompnyID")
   private String sCompnyID;
   @Column(name = "dTransact")
   @Temporal(TemporalType.DATE)
   private Date dTransact;
   @Column(name = "sSourceNo")
   private String sSourceNo;
   @Column(name = "sSourceCd")
   private String sSourceCd;
   @Column(name = "nTranAmtx")
   private double nTranAmtx;
   @Column(name = "nPointsxx")
   private Double nPointsxx;
   @Column(name = "sRemarksx")
   private String sRemarksx;
   @Column(name = "sOTPasswd")
   private String sOTPasswd;
   @Column(name = "cTranStat")
   private String cTranStat;
   @Column(name = "sPostedxx")
   private String sPostedxx;
   @Column(name = "dPostedxx")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dPostedxx;
   @Column(name = "sModified")
   private String sModified;
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitGCardDetailOffline() {
      this.sGCardNox = "";
      this.sCompnyID = "";
      this.dTransact = new Date();
      this.sSourceCd = "";
      this.sSourceNo = "";
      this.nTranAmtx = 0;
      this.nPointsxx = 0.00;
      this.sRemarksx = "";
      this.sOTPasswd = "";
      this.cTranStat = "0";
      
      //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sTransNox");
      laColumns.add("sGCardNox");
      laColumns.add("sCompnyID");
      laColumns.add("dTransact");
      laColumns.add("sSourceNo");
      laColumns.add("sSourceCd");
      laColumns.add("nTranAmtx");
      laColumns.add("nPointsxx");
      laColumns.add("sRemarksx");
      laColumns.add("sOTPasswd");
      laColumns.add("cTranStat");
      laColumns.add("sPostedxx");
      laColumns.add("dPostedxx");
      laColumns.add("sModified");
      laColumns.add("dModified");
   }

   public String getTransNo() {
      return sTransNox;
   }
   public void setTransNo(String sTransNox) {
      this.sTransNox = sTransNox;
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

   public Date getTranDate() {
      return dTransact;
   }

   public void setTranDate(Date dTransact) {
      this.dTransact = dTransact;
   }

   public String getSourceNo() {
      return sSourceNo;
   }

   public void setSourceNo(String sSourceNo) {
      this.sSourceNo = sSourceNo;
   }

   public String getSourceCd() {
      return sSourceCd;
   }

   public void setSourceCd(String sSourceCd) {
      this.sSourceCd = sSourceCd;
   }

   public double getTranAmount() {
      return nTranAmtx;
   }

   public void setTranAmount(double nTranAmtx) {
      this.nTranAmtx = nTranAmtx;
   }

   public Double getPoints() {
      return nPointsxx;
   }

   public void setPoints(Double nPointsxx) {
      this.nPointsxx = nPointsxx;
   }

   public String getRemarks() {
      return sRemarksx;
   }

   public void setRemarks(String sRemarksx) {
      this.sRemarksx = sRemarksx;
   }
   
   public String getOTPassword() {
      return sOTPasswd;
   }

   public void setOTPassword(String sOTPasswd) {
      this.sOTPasswd = sOTPasswd;
   }
   
   public String getTranStat() {
      return cTranStat;
   }

   public void setTranStat(String cTranStat) {
      this.cTranStat = cTranStat;
   }

   public String getPostedBy() {
      return sPostedxx;
   }

   public void setPostedBy(String sPostedxx) {
      this.sPostedxx = sPostedxx;
   }

   public Date getDatePosted() {
      return dPostedxx;
   }

   public void setDatePosted(Date dPostedxx) {
      this.dPostedxx = dPostedxx;
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
      if (!(object instanceof UnitGCardDetailOffline)) {
         return false;
      }
      UnitGCardDetailOffline other = (UnitGCardDetailOffline) object;
      if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitGCardDetailOffline[sTransNox=" + sGCardNox + "]";
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
        case  1: return this.sTransNox;
        case  2: return this.sGCardNox;
        case  3: return this.sCompnyID;
        case  4: return this.dTransact;
        case  5: return this.sSourceNo;
        case  6: return this.sSourceCd;
        case  7: return this.nTranAmtx;
        case  8: return this.nPointsxx;
        case  9: return this.sRemarksx;
        case  10: return this.sOTPasswd;
        case  11: return this.cTranStat;
        case  12: return this.sPostedxx;
        case  13: return this.dPostedxx;
        case  14: return this.sModified;
        case  15: return this.dModified;
        default: return null;
      }
   }

   public String getTable() {
      return "G_Card_Detail_Offline";
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
            case 1: this.sTransNox = (String) foValue; break;
            case 2: this.sGCardNox = (String) foValue; break;
            case 3: this.sCompnyID = (String) foValue; break;
            case 4: this.dTransact = (Date) foValue; break;
            case 5: this.sSourceNo = (String) foValue; break;
            case 6: this.sSourceCd = (String) foValue; break;
            case 7: this.nTranAmtx = (Double) foValue; break;
            case 8: this.nPointsxx = (Double) foValue; break;
            case 9: this.sRemarksx = (String) foValue; break;
            case 10: this.sOTPasswd = (String) foValue; break;
            case 11: this.cTranStat = (String) foValue; break;
            case 12: this.sPostedxx = (String) foValue; break;
            case 13: this.dPostedxx = (Date) foValue; break;
            case 14: this.sModified = (String) foValue; break;
            case 15: this.dModified = (Date) foValue; break;
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