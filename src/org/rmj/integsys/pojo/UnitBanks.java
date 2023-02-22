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
 * @author sheryl
 */
@Entity
@Table(name = "Banks")

public class UnitBanks implements Serializable , GEntity{
   private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sBankIDxx")
    private String sBankIDxx;
    @Column(name = "sBankName")
    private String sBankName;
    @Column(name = "sContactP")
    private String sContactP;
    @Column(name = "sAddressx")
    private String sAddressx;
    @Column(name = "sTownIdxx")
    private String sTownIdxx;
    @Column(name = "sTelNoxxx")
    private String sTelNoxxx;
    @Column(name = "sFaxNoxxx")
    private String sFaxNoxxx;
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    public UnitBanks() {
       this.sBankName = "";
       this.cRecdStat = RecordStatus.ACTIVE;

       //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sBankIDxx");
      laColumns.add("sBankName");
      laColumns.add("sContactP");
      laColumns.add("sAddressx");
      laColumns.add("sTownIdxx");
      laColumns.add("sTelNoxxx");
      laColumns.add("sFaxNoxxx");
      laColumns.add("cRecdStat");
      laColumns.add("sModified");
      laColumns.add("dModified");
    }

    public String getBankID() {
        return sBankIDxx;
    }

    public void setBankID(String sBankIDxx) {
        this.sBankIDxx = sBankIDxx;
    }

    public String getBankName() {
        return sBankName;
    }

    public void setBankName(String sBankName) {
        this.sBankName = sBankName;
    }

    public String getContactPerson() {
        return sContactP;
    }

    public void setContactPerson(String sContactP) {
        this.sContactP = sContactP;
    }

    public String getAddress() {
        return sAddressx;
    }

    public void setAddress(String sAddressx) {
        this.sAddressx = sAddressx;
    }

    public String getTownId() {
        return sTownIdxx;
    }

    public void setTownId(String sTownIdxx) {
        this.sTownIdxx = sTownIdxx;
    }

    public String getTelNo() {
        return sTelNoxxx;
    }

    public void setTelNo(String sTelNoxxx) {
        this.sTelNoxxx = sTelNoxxx;
    }

    public String getFaxNo() {
        return sFaxNoxxx;
    }

    public void setFaxNo(String sFaxNoxxx) {
        this.sFaxNoxxx = sFaxNoxxx;
    }

    public String getRecordStat() {
        return cRecdStat;
    }

    public void setRecordStat(String cRecdStat) {
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
        hash += (sBankIDxx != null ? sBankIDxx.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitBanks)) {
            return false;
        }
        UnitBanks other = (UnitBanks) object;
        if ((this.sBankIDxx == null && other.sBankIDxx != null) || (this.sBankIDxx != null && !this.sBankIDxx.equals(other.sBankIDxx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.rmj.integsys.pojo.UnitBanks[sBankIDxx=" + sBankIDxx + "]";
    }

   @Override
    public Object getValue(String fsColumn){
       int lnCol = getColumn(fsColumn);
       if(lnCol > 0){
          return getValue(lnCol);
       }
       else
         return null;
    }
    
   @Override
    public Object getValue(int fnColumn) {
      switch(fnColumn){
         case 1:
            return this.sBankIDxx;
         case 2:
            return this.sBankName;
         case 3:
            return this.sContactP;
         case 4:
            return this.sAddressx;
         case 5:
            return this.sTownIdxx;
         case 6:
            return this.sTelNoxxx;
         case 7:
            return this.sFaxNoxxx;
         case 8:
            return this.cRecdStat;
         case 9:
            return this.sModified;
         case 10:
            return this.dModified;
         default:
            return null; }
    }

   @Override
    public String getTable() {
        return "Banks";
    }

   @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

   @Override
    public String getColumn(int fnCol) {
       if(laColumns.size() < fnCol)
           return "";
       else
           return (String) laColumns.get(fnCol - 1);
    }

   @Override
    public void setValue(String fsColumn, Object foValue){
       int lnCol = getColumn(fsColumn);
       if(lnCol > 0){
          setValue(lnCol, foValue);
       }
    }

   @Override
    public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1:
                this.sBankIDxx = (String)foValue;
                break;
            case 2:
                this.sBankName = (String)foValue;
                break;
            case 3:
                this.sContactP = (String)foValue;
                break;
            case 4:
                this.sAddressx = (String)foValue;
                break;
            case 5:
                this.sTownIdxx = (String)foValue;
                break;
            case 6:
                this.sTelNoxxx = (String)foValue;
                break;
            case 7:
                this.sFaxNoxxx = (String)foValue;
                break;
            case 8:
                this.cRecdStat = (String)foValue;
                break;
            case 9:
                this.sModified = (String)foValue;
                break;
            case 10:
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

