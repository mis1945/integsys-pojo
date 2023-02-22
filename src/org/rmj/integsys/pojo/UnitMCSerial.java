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
 * @author Administrator
 */
@Entity
@Table(name = "MC_Serial")
public class UnitMCSerial implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sSerialID")
    private String sSerialID;
    @Column(name = "sBranchCd")
    private String sBranchCd;
    @Column(name = "sEngineNo")
    private String sEngineNo;
    @Column(name = "sFrameNox")
    private String sFrameNox;
    @Column(name = "sModelIDx")
    private String sModelIDx;
    @Column(name = "sColorIDx")
    private String sColorIDx;
    @Column(name = "sMCInvIDx")
    private String sMCInvIDx;
    @Column(name = "cSoldStat")
    private String cSoldStat;
    @Column(name = "cLocation")
    private String cLocation;
    @Column(name = "cDeliverd")
    private String cDeliverd;
    @Column(name = "cRegister")
    private String cRegister;
    @Column(name = "sSalesInv")
    private String sSalesInv;
    @Column(name = "cCSRValid")
    private String cCSRValid;
    @Column(name = "cPNPClear")
    private String cPNPClear;
    @Column(name = "sWarrntNo")
    private String sWarrntNo;
    @Column(name = "sCompnyID")
    private String sCompnyID;
    @Column(name = "sClientID")
    private String sClientID;
    @Column(name = "sCoCltID1")
    private String sCoCltID1;
    @Column(name = "sCoCltID2")
    private String sCoCltID2;
    @Column(name = "sFileNoxx")
    private String sFileNoxx;
    @Column(name = "sRegORNox")
    private String sRegORNox;
    @Column(name = "sCRENoxxx")
    private String sCRENoxxx;
    @Column(name = "sCRNoxxxx")
    private String sCRNoxxxx;
    @Column(name = "sPlateNoP")
    private String sPlateNoP;
    @Column(name = "sPlateNoH")
    private String sPlateNoH;
    @Column(name = "sStickrNo")
    private String sStickrNo;
    @Column(name = "nLedgerNo")
    private String nLedgerNo;
    @Column(name = "nYearModl")
    private Integer nYearModl;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    public UnitMCSerial() {
      this.sSerialID = "";
      this.sBranchCd = "";
      this.sEngineNo = "";
      this.sFrameNox = "";
      this.sModelIDx = "";
      this.sColorIDx = "";
      this.sMCInvIDx = "";
      this.cSoldStat = "";
      this.cLocation = "";
      this.cDeliverd = "";
      this.cRegister = "";
      this.sSalesInv = "";
      this.cCSRValid = "";
      this.cPNPClear = "";
      this.sWarrntNo = "";
      this.sCompnyID = "";
      this.sClientID = "";
      this.sCoCltID1 = "";
      this.sCoCltID2 = "";
      this.sFileNoxx = "";
      this.sRegORNox = "";
      this.sCRENoxxx = "";
      this.sCRNoxxxx = "";
      this.sPlateNoP = "";
      this.sPlateNoH = "";
      this.sStickrNo = "";
      this.nLedgerNo = "";
      this.nYearModl = 0;

       //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sSerialID");
      laColumns.add("sBranchCd");
      laColumns.add("sEngineNo");
      laColumns.add("sFrameNox");
      laColumns.add("sModelIDx");
      laColumns.add("sColorIDx");
      laColumns.add("sMCInvIDx");
      laColumns.add("cSoldStat");
      laColumns.add("cLocation");        
      laColumns.add("cDeliverd");
      laColumns.add("cRegister");
      laColumns.add("sSalesInv");        
      laColumns.add("cCSRValid");
      laColumns.add("cPNPClear");
      laColumns.add("sWarrntNo");        
      laColumns.add("sCompnyID");
      laColumns.add("sClientID");
      laColumns.add("sCoCltID1");        
      laColumns.add("sCoCltID2");
      laColumns.add("sFileNoxx");
      laColumns.add("sRegORNox");        
      laColumns.add("sCRENoxxx");
      laColumns.add("sCRNoxxxx");
      laColumns.add("sPlateNoP");        
      laColumns.add("sPlateNoH");
      laColumns.add("sStickrNo");
      laColumns.add("nLedgerNo");        
      laColumns.add("nYearModl");
    }

    public String getSerialID() {
        return sSerialID;
    }

    public void setSerialID(String sSerialID) {
        this.sSerialID = sSerialID;
    }

    public String getBranchCd() {
        return sBranchCd;
    }

    public void setBranchCd(String sBranchCd) {
        this.sBranchCd = sBranchCd;
    }

    public String getEngineNo() {
        return sEngineNo;
    }

    public void setEngineNo(String sEngineNo) {
        this.sEngineNo = sEngineNo;
    }

    public String getFrameNo() {
        return sFrameNox;
    }

    public void setFrameNo(String sFrameNox) {
        this.sFrameNox = sFrameNox;
    }

    public String getModelID() {
        return sModelIDx;
    }

    public void setModelID(String sModelIDx) {
        this.sModelIDx = sModelIDx;
    }

    public String getColorID() {
        return sColorIDx;
    }

    public void setColorID(String sColorIDx) {
        this.sColorIDx = sColorIDx;
    }

    public String getMCInvID() {
        return sMCInvIDx;
    }

    public void setMCInvID(String sMCInvIDx) {
        this.sMCInvIDx = sMCInvIDx;
    }

    public String getSoldStat() {
        return cSoldStat;
    }

    public void setSoldStat(String cSoldStat) {
        this.cSoldStat = cSoldStat;
    }

    public String getLocation() {
        return cLocation;
    }

    public void setLocation(String cLocation) {
        this.cLocation = cLocation;
    }

    public String getIsDelivered() {
        return cDeliverd;
    }

    public void setIsDeliverd(String cDeliverd) {
        this.cDeliverd = cDeliverd;
    }

    public String getIsRegister() {
        return cRegister;
    }

    public void setIsRegister(String cRegister) {
        this.cRegister = cRegister;
    }

    public String getSalesInvoice() {
        return sSalesInv;
    }

    public void setSalesInvoice(String sSalesInv) {
        this.sSalesInv = sSalesInv;
    }

    public String getIsCSRValid() {
        return cCSRValid;
    }

    public void setIsCSRValid(String cCSRValid) {
        this.cCSRValid = cCSRValid;
    }

    public String getIsPNPClear() {
        return cPNPClear;
    }

    public void setIsPNPClear(String cPNPClear) {
        this.cPNPClear = cPNPClear;
    }

    public String getWarrantyNo() {
        return sWarrntNo;
    }

    public void setWarrantyNo(String sWarrntNo) {
        this.sWarrntNo = sWarrntNo;
    }

    public String getCompanyID() {
        return sCompnyID;
    }

    public void setCompanyID(String sCompnyID) {
        this.sCompnyID = sCompnyID;
    }

    public String getClientID() {
        return sClientID;
    }

    public void setClientID(String sClientID) {
        this.sClientID = sClientID;
    }

    public String getCoClientID1() {
        return sCoCltID1;
    }

    public void setCoClientID1(String sCoCltID1) {
        this.sCoCltID1 = sCoCltID1;
    }

    public String getCoClientID2() {
        return sCoCltID2;
    }

    public void setCoClientID2(String sCoCltID2) {
        this.sCoCltID2 = sCoCltID2;
    }

    public String getFileNo() {
        return sFileNoxx;
    }

    public void setFileNo(String sFileNoxx) {
        this.sFileNoxx = sFileNoxx;
    }

    public String getRegORNo() {
        return sRegORNox;
    }

    public void setRegORNo(String sRegORNox) {
        this.sRegORNox = sRegORNox;
    }

    public String getCRENo() {
        return sCRENoxxx;
    }

    public void setCRENo(String sCRENoxxx) {
        this.sCRENoxxx = sCRENoxxx;
    }

    public String getCRNo() {
        return sCRNoxxxx;
    }

    public void setCRNo(String sCRNoxxxx) {
        this.sCRNoxxxx = sCRNoxxxx;
    }

    public String getPlateNoP() {
        return sPlateNoP;
    }

    public void setPlateNoP(String sPlateNoP) {
        this.sPlateNoP = sPlateNoP;
    }

    public String getPlateNoH() {
        return sPlateNoH;
    }

    public void setPlateNoH(String sPlateNoH) {
        this.sPlateNoH = sPlateNoH;
    }

    public String getStickerNo() {
        return sStickrNo;
    }

    public void setStickerNo(String sStickrNo) {
        this.sStickrNo = sStickrNo;
    }

    public String getLedgerNo() {
        return nLedgerNo;
    }

    public void setLedgerNo(String nLedgerNo) {
        this.nLedgerNo = nLedgerNo;
    }

    public Integer getYearModel() {
        return nYearModl;
    }

    public void setYearModel(Integer nYearModl) {
        this.nYearModl = nYearModl;
    }

    public String getModifiedBy() {
        return sModified;
    }

    public void setModifiedBy(String sModified) {
        this.sModified = sModified;
    }

    public Date getModifiedDate() {
        return dModified;
    }

    public void setModifiedDate(Date dModified) {
        this.dModified = dModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sSerialID != null ? sSerialID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitMCSerial)) {
            return false;
        }
        UnitMCSerial other = (UnitMCSerial) object;
        if ((this.sSerialID == null && other.sSerialID != null) || (this.sSerialID != null && !this.sSerialID.equals(other.sSerialID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.rmj.integsys.pojo.UnitMCSerial[ sSerialID=" + sSerialID + " ]";
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
            return this.sSerialID;
         case 2: 
            return this.sBranchCd;
         case 3: 
            return this.sEngineNo;
         case 4: 
            return this.sFrameNox;
         case 5: 
            return this.sModelIDx;
         case 6: 
            return this.sColorIDx;
         case 7: 
            return this.sMCInvIDx;
         case 8: 
            return this.cSoldStat;
         case 9: 
            return this.cLocation;        
         case 10: 
            return this.cDeliverd;
         case 11: 
            return this.cRegister;
         case 12: 
            return this.sSalesInv;        
         case 13: 
            return this.cCSRValid;
         case 14: 
            return this.cPNPClear;
         case 15: 
            return this.sWarrntNo;        
         case 16: 
            return this.sCompnyID;
         case 17: 
            return this.sClientID;
         case 18: 
            return this.sCoCltID1;        
         case 19: 
            return this.sCoCltID2;
         case 20: 
            return this.sFileNoxx;
         case 21: 
            return this.sRegORNox;        
         case 22: 
            return this.sCRENoxxx;
         case 23: 
            return this.sCRNoxxxx;
         case 24: 
            return this.sPlateNoP;        
         case 25: 
            return this.sPlateNoH;
         case 26: 
            return this.sStickrNo;
         case 27: 
            return this.nLedgerNo;        
         case 28: 
            return this.nYearModl;
         default:
            return null;
      }
   }

   public String getTable() {
      return "MC_Serial";
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
            this.sSerialID = (String) foValue; 
            break;
         case 2: 
            this.sBranchCd = (String) foValue; 
            break;
         case 3: 
            this.sEngineNo = (String) foValue; 
            break;
         case 4: 
            this.sFrameNox = (String) foValue; 
            break;
         case 5: 
            this.sModelIDx = (String) foValue; 
            break;
         case 6: 
            this.sColorIDx = (String) foValue; 
            break;
         case 7: 
            this.sMCInvIDx = (String) foValue; 
            break;
         case 8: 
            this.cSoldStat = (String) foValue; 
            break;
         case 9: 
            this.cLocation = (String) foValue; 
            break;        
         case 10: 
            this.cDeliverd = (String) foValue; 
            break;
         case 11: 
            this.cRegister = (String) foValue; 
            break;
         case 12: 
            this.sSalesInv = (String) foValue; 
            break;        
         case 13: 
            this.cCSRValid = (String) foValue; 
            break;
         case 14: 
            this.cPNPClear = (String) foValue; 
            break;
         case 15: 
            this.sWarrntNo = (String) foValue; 
            break;        
         case 16: 
            this.sCompnyID = (String) foValue; 
            break;
         case 17: 
            this.sClientID = (String) foValue; 
            break;
         case 18: 
            this.sCoCltID1 = (String) foValue; 
            break;        
         case 19: 
            this.sCoCltID2 = (String) foValue; 
            break;
         case 20: 
            this.sFileNoxx = (String) foValue; 
            break;
         case 21: 
            this.sRegORNox = (String) foValue; 
            break;        
         case 22: 
            this.sCRENoxxx = (String) foValue; 
            break;
         case 23: 
            this.sCRNoxxxx = (String) foValue; 
            break;
         case 24: 
            this.sPlateNoP = (String) foValue; 
            break;        
         case 25: 
            this.sPlateNoH = (String) foValue; 
            break;
         case 26: 
            this.sStickrNo = (String) foValue; 
            break;
         case 27: 
            this.nLedgerNo = (String) foValue; 
            break;        
         case 28: 
            this.nYearModl = (Integer) foValue; 
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
