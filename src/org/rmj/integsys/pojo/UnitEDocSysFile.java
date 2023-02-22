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
 * @author jef
 */
@Entity
@Table(name = "EDocSys_Module")
public class UnitEDocSysFile implements Serializable, GEntity{
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sFileCode")
   private String sFileCode;
   @Column(name = "sBarrCode")
   private String sBarrCode;
   @Column(name = "sBriefDsc")
   private String sBriefDsc;
   @Column(name = "cRecdStat")
   private String cRecdStat;
   @Column(name = "sModified")
   private String sModified;
   @Basic(optional = false)
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitEDocSysFile() {
      this.sFileCode = "";
      this.sBarrCode = "";
      this.sBriefDsc = "";
      this.cRecdStat = RecordStatus.ACTIVE;

      //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sFileCode");
      laColumns.add("sBarrCode");
      laColumns.add("sBriefDsc");
      laColumns.add("cRecdStat");
      laColumns.add("sModified");
      laColumns.add("dModified");

   }

   public String getFileCode() {
      return sFileCode;
   }

   public void setFileCode(String sFileCode) {
      this.sFileCode = sFileCode;
   }

   public String getBarcode() {
      return sBarrCode;
   }

   public void setBarcode(String sBarrCode) {
      this.sBarrCode = sBarrCode;
   }
   
   public String getBriefDescript() {
      return sBriefDsc;
   }

   public void setBriefDescript(String sBriefDsc) {
      this.sBriefDsc = sBriefDsc;
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
      hash += (sFileCode != null ? sFileCode.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitEDocSysFile)) {
         return false;
      }
      UnitEDocSysFile other = (UnitEDocSysFile) object;
      if ((this.sFileCode == null && other.sFileCode != null) || (this.sFileCode != null && !this.sFileCode.equals(other.sFileCode))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitEDocSysFile[sFileCode=" + sFileCode + "]";
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
            return this.sFileCode;
         case 2:
            return this.sBarrCode;
         case 3:
            return this.sBriefDsc;
         case 4:
            return this.cRecdStat;
         case 5:
            return this.sModified;
         case 6:
            return this.dModified;
         default:
            return null;
      }
   }

   public String getTable() {
      return "EDocSys_File";
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
                this.sFileCode = (String)foValue;
                break;
            case 2:
                this.sBarrCode = (String)foValue;
                break;
            case 3:
                this.sBriefDsc = (String)foValue;
                break;
            case 4:
                this.cRecdStat = (String)foValue;
                break;
            case 5:
                this.sModified = (String)foValue;
                break;
            case 6:
                this.dModified = (Date)foValue;
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