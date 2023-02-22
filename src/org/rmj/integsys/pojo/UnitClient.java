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
@Table(name = "Client_Master")
public class UnitClient implements Serializable, GEntity{
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sClientID")
   private String sClientID;
   @Column(name = "sLastName")
   private String sLastName;
   @Column(name = "sFrstName")
   private String sFrstName;
   @Column(name = "sMiddName")
   private String sMiddName;
   @Column(name = "sSuffixNm")
   private String sSuffixNm;
   @Column(name = "cGenderCd")
   private String cGenderCd;
   @Column(name = "cCvilStat")
   private String cCvilStat;
   @Column(name = "sCitizenx")
   private String sCitizenx;
   @Column(name = "dBirthDte")
   @Temporal(TemporalType.DATE)
   private Date dBirthDte;
   @Column(name = "sBirthPlc")
   private String sBirthPlc;
   @Column(name = "sHouseNox")
   private String sHouseNox;
   @Column(name = "sAddressx")
   private String sAddressx;
   @Column(name = "sTownIDxx")
   private String sTownIDxx;
   @Column(name = "sPhoneNox")
   private String sPhoneNox;
   @Column(name = "sMobileNo")
   private String sMobileNo;
   @Column(name = "sEmailAdd")
   private String sEmailAdd;
   @Column(name = "cEducLevl")
   private String cEducLevl;
   @Column(name = "sRelgnIDx")
   private String sRelgnIDx;
   @Column(name = "sTaxIDNox")
   private String sTaxIDNox;
   @Column(name = "sSSSNoxxx")
   private String sSSSNoxxx;
   @Column(name = "sAddlInfo")
   private String sAddlInfo;
   @Column(name = "sCompnyNm")
   private String sCompnyNm;
   @Column(name = "sOccptnID")
   private String sOccptnID;
   @Column(name = "nGrssIncm")
   private Double nGrssIncm;
   @Column(name = "sClientNo")
   private String sClientNo;
   @Column(name = "sSpouseID")
   private String sSpouseID;
   @Column(name = "sFatherID")
   private String sFatherID;
   @Column(name = "sMotherID")
   private String sMotherID;
   @Column(name = "sSiblngID")
   private String sSiblngID;
   @Column(name = "cClientTp")
   private String cClientTp;
   @Column(name = "cLRClient")
   private String cLRClient;
   @Column(name = "cMCClient")
   private String cMCClient;
   @Column(name = "cSCClient")
   private String cSCClient;
   @Column(name = "cSPClient")
   private String cSPClient;
   @Column(name = "cCPClient")
   private String cCPClient;
   @Column(name = "cRecdStat")
   private String cRecdStat;
   @Column(name = "sModified")
   private String sModified;
   @Basic(optional = false)
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitClient() {
      this.dBirthDte = Util.toDate("1901-01-01", "yyyy-MM-dd");
      this.sLastName = "";
      this.sFrstName = "";
      this.sMiddName = "";
      this.sSuffixNm = "";
      this.sBirthPlc = "";
      this.sTownIDxx = "";
      this.cCvilStat = "0";
      this.cCPClient = "0";
      this.cLRClient = "0";
      this.cMCClient = "0";
      this.cSCClient = "0";
      this.cSPClient = "0";
      this.cRecdStat = RecordStatus.ACTIVE;

       //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sClientID");
      laColumns.add("sLastName");
      laColumns.add("sFrstName");
      laColumns.add("sMiddName");
      laColumns.add("sSuffixNm");
      laColumns.add("cGenderCd");
      laColumns.add("cCvilStat");
      laColumns.add("sCitizenx");
      laColumns.add("dBirthDte");
      laColumns.add("sBirthPlc");
      laColumns.add("sHouseNox");
      laColumns.add("sAddressx");
      laColumns.add("sTownIDxx");
      laColumns.add("sPhoneNox");
      laColumns.add("sMobileNo");
      laColumns.add("sEmailAdd");
      laColumns.add("cEducLevl");
      laColumns.add("sRelgnIDx");
      laColumns.add("sTaxIDNox");
      laColumns.add("sSSSNoxxx");
      laColumns.add("sAddlInfo");
      laColumns.add("sCompnyNm");
      laColumns.add("sOccptnID");
      laColumns.add("nGrssIncm");
      laColumns.add("sClientNo");
      laColumns.add("sSpouseID");
      laColumns.add("sFatherID");
      laColumns.add("sMotherID");
      laColumns.add("sSiblngID");
      laColumns.add("cClientTp");
      laColumns.add("cLRClient");
      laColumns.add("cMCClient");
      laColumns.add("cSCClient");
      laColumns.add("cSPClient");
      laColumns.add("cCPClient");
      laColumns.add("cRecdStat");
      laColumns.add("sModified");
      laColumns.add("dModified");

   }

   public String getClientID() {
      return sClientID;
   }

   public void setClientID(String sClientID) {
      this.sClientID = sClientID;
   }

   public String getLastName() {
      return sLastName;
   }

   public void setLastName(String sLastName) {
      this.sLastName = sLastName;
   }

   public String getFirstName() {
      return sFrstName + (sSuffixNm.length() == 0 ? "" : " " + sSuffixNm);
   }

   public void setFirstName(String sFrstName) {
      this.sFrstName = sFrstName ;
   }

   public String getMiddName() {
      return sMiddName;
   }

   public void setMiddName(String sMiddName) {
      this.sMiddName = sMiddName;
   }

   public void setSuffixName(String sSuffixNm) {
      this.sSuffixNm = sSuffixNm;
   }
   
   public String getGenderCd() {
      return cGenderCd;
   }

   public void setGenderCd(String cGenderCd) {
      this.cGenderCd = cGenderCd;
   }

   public String getCivilStat() {
      return cCvilStat;
   }

   public void setCivilStat(String cCvilStat) {
      this.cCvilStat = cCvilStat;
   }

   public String getCitizen() {
      return sCitizenx;
   }

   public void setCitizen(String sCitizenx) {
      this.sCitizenx = sCitizenx;
   }

   public Date getBirthDate() {
      return dBirthDte;
   }

   public void setBirthDate(Date dBirthDte) {
      this.dBirthDte = dBirthDte;
   }

   public String getBirthPlace() {
      return sBirthPlc;
   }

   public void setBirthPlace(String sBirthPlc) {
      this.sBirthPlc = sBirthPlc;
   }

   public String getHouseNo() {
      return sHouseNox;
   }

   public void setHouseNo(String sHouseNox) {
      this.sHouseNox = sHouseNox;
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

   public String getPhoneNo() {
      return sPhoneNox;
   }

   public void setPhoneNo(String sPhoneNox) {
      this.sPhoneNox = sPhoneNox;
   }

   public String getMobileNo() {
      return sMobileNo;
   }

   public void setMobileNo(String sMobileNo) {
      this.sMobileNo = sMobileNo;
   }

   public String getEmailAdd() {
      return sEmailAdd;
   }

   public void setEmailAdd(String sEmailAdd) {
      this.sEmailAdd = sEmailAdd;
   }

   public String getEducationalLevel() {
      return cEducLevl;
   }

   public void getEducationalLevel(String cEducLevl) {
      this.cEducLevl = cEducLevl;
   }

   public String getReligion() {
      return sRelgnIDx;
   }

   public void getReligion(String sRelgnIDx) {
      this.sRelgnIDx = sRelgnIDx;
   }
   
   public String getTaxIDNo() {
      return sTaxIDNox;
   }

   public void setTaxIDNo(String sTaxIDNox) {
      this.sTaxIDNox = sTaxIDNox;
   }

   public String getSSSNumber() {
      return sSSSNoxxx;
   }

   public void setSSSNumber(String sSSSNoxxx) {
      this.sSSSNoxxx = sSSSNoxxx;
   }

   public String getAddtlInfo() {
      return sAddlInfo;
   }

   public void setAddtlInfo(String sAddlInfo) {
      this.sAddlInfo = sAddlInfo;
   }

   public String getCompany() {
      return sCompnyNm;
   }

   public void setCompany(String sCompnyNm) {
      this.sCompnyNm = sCompnyNm;
   }

   public String getOccptnID() {
      return sOccptnID;
   }

   public void setOccptnID(String sOccptnID) {
      this.sOccptnID = sOccptnID;
   }

   public double getGrossIncome() {
      return nGrssIncm;
   }

   public void setGrossIncome(double nGrssIncm) {
      this.nGrssIncm = nGrssIncm;
   }

   public String getClientNo() {
      return sClientNo;
   }

   public void setClientNo(String sClientNo) {
      this.sClientNo = sClientNo;
   }

   public String getSpouseID() {
      return sSpouseID;
   }

   public void setSpouseID(String sSpouseID) {
      this.sSpouseID = sSpouseID;
   }

   public String getFatherID() {
      return sFatherID;
   }

   public void setFatherID(String sFatherID) {
      this.sFatherID = sFatherID;
   }

   public String getMotherID() {
      return sMotherID;
   }

   public void setMotherID(String sMotherID) {
      this.sMotherID = sMotherID;
   }

   public String getSiblingID() {
      return sSiblngID;
   }

   public void setSiblingID(String sSiblngID) {
      this.sSiblngID = sSiblngID;
   }

   public String getClientTp() {
      return cClientTp;
   }

   public void setClientTp(String cClientTp) {
      this.cClientTp = cClientTp;
   }

   public String getLRClient() {
      return cLRClient;
   }

   public void setLRClient(String cLRClient) {
      this.cLRClient = cLRClient;
   }

   public String getMCClient() {
      return cMCClient;
   }

   public void setMCClient(String cMCClient) {
      this.cMCClient = cMCClient;
   }

   public String getSCClient() {
      return cSCClient;
   }

   public void setSCClient(String cSCClient) {
      this.cSCClient = cSCClient;
   }

   public String getSPClient() {
      return cSPClient;
   }

   public void setSPClient(String cSPClient) {
      this.cSPClient = cSPClient;
   }

   public String getCPClient() {
      return cCPClient;
   }

   public void setCPClient(String cCPClient) {
      this.cCPClient = cCPClient;
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
      hash += (sClientID != null ? sClientID.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitClient)) {
         return false;
      }
      UnitClient other = (UnitClient) object;
      if ((this.sClientID == null && other.sClientID != null) || (this.sClientID != null && !this.sClientID.equals(other.sClientID))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitClient[sClientID=" + sClientID + "]";
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
            return this.sClientID;
         case 2:
            return this.sLastName; 
         case 3:
            return this.sFrstName + (sSuffixNm.length() == 0 ? "" : " " + sSuffixNm);
         case 4:
            return this.sMiddName;
         case 5: return "";    
         case 6:
            return this.cGenderCd;
         case 7:
            return this.cCvilStat;
         case 8:
            return this.sCitizenx;
         case 9:
            return this.dBirthDte;
         case 10:
            return this.sBirthPlc;
         case 11:
            return this.sHouseNox;
         case 12:
            return this.sAddressx;
         case 13:
            return this.sTownIDxx;
         case 14:
            return this.sPhoneNox;
         case 15:
            return this.sMobileNo;
         case 16:
            return this.sEmailAdd;
         case 17:
            return this.cEducLevl;
         case 18:
            return this.sRelgnIDx;
         case 19:
            return this.sTaxIDNox;
         case 20:
            return this.sSSSNoxxx;
         case 21:
            return this.sAddlInfo;
         case 22:
            return this.sCompnyNm;
         case 23:
            return this.sOccptnID;
         case 24:
            return this.nGrssIncm;
         case 25:
            return this.sClientNo;
         case 26:
            return this.sSpouseID;
         case 27:
            return this.sFatherID;
         case 28:
            return this.sMotherID;
         case 29:
            return this.sSiblngID;
         case 30:
            return this.cClientTp;
         case 31:
            return this.cLRClient;
         case 32:
            return this.cMCClient;
         case 33:
            return this.cSCClient;
         case 34:
            return this.cSPClient;
         case 35:
            return this.cCPClient;
         case 36:
            return this.cRecdStat;
         case 37:
            return this.sModified;
         case 38:
            return this.dModified;
         default:
            return null;
      }
   }

   public String getTable() {
      return "Client_Master";
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
                this.sClientID = (String)foValue;
                break;
            case 2:
                this.sLastName = (String)foValue;
                break;
            case 3:
                this.sFrstName = (String)foValue;
                break;
            case 4:
                this.sMiddName = (String)foValue;
                break;
            case 5:
                this.sSuffixNm = (String)foValue;
                break;
            case 6:
                this.cGenderCd = (String)foValue;
                break;
            case 7:
                this.cCvilStat = (String)foValue;
                break;
            case 8:
                this.sCitizenx = (String)foValue;
                break;
            case 9:
                this.dBirthDte = (Date)foValue;
                break;
            case 10:
                this.sBirthPlc = (String)foValue;
                break;
            case 11:
                this.sHouseNox = (String)foValue;
                break;
            case 12:
                this.sAddressx = (String)foValue;
                break;
            case 13:
                this.sTownIDxx = (String)foValue;
                break;
            case 14:
                this.sPhoneNox = (String)foValue;
                break;
            case 15:
                this.sMobileNo = (String)foValue;
                break;
            case 16:
                this.sEmailAdd = (String)foValue;
                break;
            case 17:
                this.cEducLevl = (String) foValue;
                break;
            case 18:
                this.sRelgnIDx = (String) foValue;
                break;
            case 19:
                this.sTaxIDNox = (String)foValue;
                break;
            case 20:
                this.sSSSNoxxx = (String)foValue;
                break;
            case 21:
                this.sAddlInfo = (String)foValue;
                break;
            case 22:
                this.sCompnyNm = (String)foValue;
                break;
            case 23:
                this.sOccptnID = (String)foValue;
                break;
            case 24:
                this.nGrssIncm = (Double)foValue;
                break;
            case 25:
                this.sClientNo = (String)foValue;
                break;
            case 26:
                this.sSpouseID = (String)foValue;
                break;
            case 27:
                this.sFatherID = (String)foValue;
                break;
            case 28:
                this.sMotherID = (String)foValue;
                break;
            case 29:
                this.sSiblngID = (String)foValue;
                break;
            case 30:
                this.cClientTp = (String)foValue;
                break;
            case 31:
                this.cLRClient = (String)foValue;
                break;
            case 32:
                this.cMCClient = (String)foValue;
                break;
            case 33:
                this.cSCClient = (String)foValue;
                break;
            case 34:
                this.cSPClient = (String)foValue;
                break;
            case 35:
                this.cCPClient = (String)foValue;
                break;
            case 36:
                this.cRecdStat = (String)foValue;
                break;
            case 37:
                this.sModified = (String)foValue;
                break;
            case 38:
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
