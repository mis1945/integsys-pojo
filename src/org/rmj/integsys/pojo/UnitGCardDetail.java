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
@Table(name = "G_Card_Detail")
public class UnitGCardDetail implements Serializable, GEntity {
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
   @Column(name = "sOTPasswd")
   private String sOTPasswd;
   @Column(name = "cPointSnt")
   private String cPointSnt;
   @Column(name = "sModified")
   private String sModified;
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitGCardDetail() {
      this.sGCardNox = "";
      this.sCompnyID = "";
      this.sSourceCd = "";
      this.sSourceNo = "";
      this.dTransact = new Date();
      this.nTranAmtx = 0;
      this.nPointsxx = 0.00;
      this.sOTPasswd = "";
      this.cPointSnt = "0";

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
      laColumns.add("sOTPasswd");
      laColumns.add("cPointSnt");
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

   public Date getTransactDate() {
      return dTransact;
   }

   public void setTransactDate(Date dTransact) {
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

   public Double getTranAmount() {
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

   public String getOTPassword() {
      return sOTPasswd;
   }

   public void setOTPassword(String sOTPasswd) {
      this.sOTPasswd = sOTPasswd;
   }

   public String getPointSent() {
      return cPointSnt;
   }

   public void setPointSent(String cPointSnt) {
      this.cPointSnt = cPointSnt;
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
      if (!(object instanceof UnitGCardDetail)) {
         return false;
      }
      UnitGCardDetail other = (UnitGCardDetail) object;

      if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
         return false;
      }

      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitGCardDetail[sTransNox=" + sTransNox + "]";
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
         case 1: return this.sTransNox;
         case 2: return this.sGCardNox;
         case 3: return this.sCompnyID;
         case 4: return this.dTransact;
         case 5: return this.sSourceNo;
         case 6: return this.sSourceCd;
         case 7: return this.nTranAmtx;
         case 8: return this.nPointsxx;
         case 9: return this.sOTPasswd;
         case 10: return this.cPointSnt;
         case 11: return this.sModified;
         case 12: return this.dModified;
         default:
            return null;
      }
   }

   public String getTable() {
      return "G_Card_Detail";
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
            this.sGCardNox = (String) foValue;
            break;
         case  3:
            this.sCompnyID = (String) foValue;
            break;
         case  4:
            this.dTransact = (Date) foValue;
            break;
         case  5:
            this.sSourceNo = (String) foValue;
            break;
         case  6:
            this.sSourceCd = (String) foValue;
            break;
         case  7:
            this.nTranAmtx = (Double) foValue;
            break;
         case  8:
            this.nPointsxx = (Double) foValue;
            break;
         case 9:
             this.sOTPasswd = (String) foValue;
             break;
         case 10:
             this.cPointSnt = (String) foValue;
             break;
         case  11:
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
