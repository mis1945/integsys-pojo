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
@Table(name = "Branch")
public class UnitBranch implements Serializable, GEntity{
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sBranchCd")
   private String sBranchCd;
   @Column(name = "sBranchNm")
   private String sBranchNm;
   @Column(name = "sCompnyID")
   private String sCompnyID;
   @Column(name = "sAddressx")
   private String sAddressx;
   @Column(name = "sTownIDxx")
   private String sTownIDxx;
   @Column(name = "sManagerx")
   private String sManagerx;
   @Column(name = "sSellCode")
   private String sSellCode;
   @Column(name = "cWareHous")
   private String cWareHous;
   @Column(name = "sTelNumbr")
   private String sTelNumbr;
   @Column(name = "cRecdStat")
   private String cRecdStat;
   @Column(name = "dExportxx")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dExportxx;
   @Column(name = "cMainOffc")
   private String cMainOffc;
   @Column(name = "sModified")
   private String sModified;
   @Basic(optional = false)
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitBranch() {
      this.sBranchNm = "";
      this.sAddressx = "";
      this.sTownIDxx = "";
      this.sCompnyID = "";
      this.cWareHous = "0";
      this.cMainOffc = "0";
      this.cRecdStat = RecordStatus.ACTIVE;

       //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sBranchCd");
      laColumns.add("sBranchNm");
      laColumns.add("sCompnyID");
      laColumns.add("sAddressx");
      laColumns.add("sTownIDxx");
      laColumns.add("sManagerx");
      laColumns.add("sSellCode");
      laColumns.add("cWareHous");
      laColumns.add("sTelNumbr");
      laColumns.add("cRecdStat");
      laColumns.add("dExportxx");
      laColumns.add("cMainOffc");
      laColumns.add("sModified");
      laColumns.add("dModified");
   }

   public String getBranchCd() {
      return sBranchCd;
   }

   public void setBranchCd(String sBranchCd) {
      this.sBranchCd = sBranchCd;
   }

   public String getBranchNm() {
      return sBranchNm;
   }

   public void setBranchNm(String sBranchNm) {
      this.sBranchNm = sBranchNm;
   }

   public String getCompanyID() {
      return sCompnyID;
   }

   public void setCompanyID(String sCompnyID) {
      this.sCompnyID = sCompnyID;
   }

   public String getAddress() {
      return sAddressx;
   }

   public void setAddress(String sAddressx) {
      this.sAddressx = sAddressx;
   }

   public String getTownID() {
      return sTownIDxx;
   }

   public void setTownID(String sTownIDxx) {
      this.sTownIDxx = sTownIDxx;
   }

   public String getManager() {
      return sManagerx;
   }

   public void setManager(String sManagerx) {
      this.sManagerx = sManagerx;
   }

   public String getSellCode() {
      return sSellCode;
   }

   public void setSellCode(String sSellCode) {
      this.sSellCode = sSellCode;
   }

   public String getWareHouse() {
      return cWareHous;
   }

   public void setWareHouse(String cWareHous) {
      this.cWareHous = cWareHous;
   }

   public String getTelNumbr() {
      return sTelNumbr;
   }

   public void setTelNumbr(String sTelNumbr) {
      this.sTelNumbr = sTelNumbr;
   }

   public String getRecdStat() {
      return cRecdStat;
   }

   public void setRecdStat(String cRecdStat) {
      this.cRecdStat = cRecdStat;
   }

   public Date getDateExport() {
      return dExportxx;
   }

   public void setDateExport(Date dExportxx) {
      this.dExportxx = dExportxx;
   }

   public String getMainOffice() {
      return cMainOffc;
   }

   public void setMainOffice(String cMainOffc) {
      this.cMainOffc = cMainOffc;
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
      hash += (sBranchCd != null ? sBranchCd.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitBranch)) {
         return false;
      }
      UnitBranch other = (UnitBranch) object;
      if ((this.sBranchCd == null && other.sBranchCd != null) || (this.sBranchCd != null && !this.sBranchCd.equals(other.sBranchCd))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitBranch[sBranchCd=" + sBranchCd + "]";
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
            return this.sBranchCd;
         case 2:
            return this.sBranchNm;
         case 3:
            return this.sCompnyID;
         case 4:
            return this.sAddressx;
         case 5:
            return this.sTownIDxx;
         case 6:
            return this.sManagerx;
         case 7:
            return this.sSellCode;
         case 8:
            return this.cWareHous;
         case 9:
            return this.sTelNumbr;
         case 10:
            return this.cRecdStat;
         case 11:
            return this.dExportxx;
         case 12:
            return this.cMainOffc;
         case 13:
            return this.sModified;
         case 14:
            return this.dModified;
         default:
            return null;
       }
   }

   public String getTable() {
      return "Branch";
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
                this.sBranchCd = (String)foValue;
                break;
            case 2:
                this.sBranchNm = (String)foValue;
                break;
            case 3:
                this.sCompnyID = (String)foValue;
                break;
            case 4:
                this.sAddressx = (String)foValue;
                break;
            case 5:
                this.sTownIDxx = (String)foValue;
                break;
            case 6:
                this.sManagerx = (String)foValue;
                break;
            case 7:
                this.sSellCode = (String)foValue;
                break;
            case 8:
                this.cWareHous = (String)foValue;
                break;
            case 9:
                this.sTelNumbr = (String)foValue;
                break;
            case 10:
                this.cRecdStat = (String)foValue;
                break;
            case 11:
                this.dExportxx = (Date)foValue;
                break;
            case 12:
                this.cMainOffc = (String)foValue;
                break;
            case 13:
                this.sModified = (String)foValue;
                break;
            case 14:
                this.dModified = (Date)foValue;
                break;

        }
   }

   @Override
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
