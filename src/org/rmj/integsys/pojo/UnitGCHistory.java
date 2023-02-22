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
import org.rmj.appdriver.constants.TransactionStatus;
import org.rmj.appdriver.iface.GEntity;

/**
 *
 * @author kalyptus
 */
@Entity
@Table(name = "G_Card_History")
public class UnitGCHistory implements Serializable, GEntity {
   private static final long serialVersionUID = 1L;

   @Id
   @Basic(optional = false)
   @Column(name = "sGCardNox")
   private String sGCardNox;
   @Id
   @Basic(optional = false)
   @Column(name = "dTransact")
   @Temporal(TemporalType.DATE)
   private Date dTransact;
   @Id
   @Basic(optional = false)
   @Column(name = "cCardStat")
   private String cCardStat;
   @Column(name = "nTranLine")
   private String nTranLine;
   @Column(name = "sRemarksx")
   private String sRemarksx;
   @Column(name = "cTranStat")
   private String cTranStat;
   @Column(name = "sModified")
   private String sModified;
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;

   public UnitGCHistory() {
      this.cTranStat = TransactionStatus.STATE_OPEN;

       //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sGCardNox");
      laColumns.add("nTranLine");
      laColumns.add("dTransact");
      laColumns.add("cCardStat");
      laColumns.add("sRemarksx");
      laColumns.add("cTranStat");
      laColumns.add("sModified");
      laColumns.add("dModified");
   }

   public void setGCardNo(String sGCardNox) {
      this.sGCardNox = sGCardNox;
   }

   public String getGCardNo() {
      return sGCardNox;
   }

   public String getTranLine() {
      return nTranLine;
   }

   public void setTranLine(String nTranLine) {
      this.nTranLine = nTranLine;
   }

   public Date getTransactDate() {
      return dTransact;
   }

   public void setTransactDate(Date dTransact) {
      this.dTransact = dTransact;
   }

   public String getCardStat() {
      return cCardStat;
   }

   public void setCardStat(String cCardStat) {
      this.cCardStat = cCardStat;
   }

   public String getRemarks() {
      return sRemarksx;
   }

   public void setRemarks(String sRemarksx) {
      this.sRemarksx = sRemarksx;
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
      hash += (sGCardNox != null ? sGCardNox.hashCode() : 0);
      hash += (nTranLine != null ? nTranLine.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitGCHistory)) {
         return false;
      }
      UnitGCHistory other = (UnitGCHistory) object;
      if ((this.sGCardNox == null && other.sGCardNox != null) || (this.sGCardNox != null && !this.sGCardNox.equals(other.sGCardNox))) {
         return false;
      }
      if ((this.nTranLine == null && other.nTranLine != null) || (this.nTranLine != null && !this.nTranLine.equals(other.nTranLine))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitGCHistory[GCardNo=" + sGCardNox + ", nTranLine=" + nTranLine + "]";
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
            return this.sGCardNox;
         case 2:
            return this.nTranLine;
         case 3:
            return this.dTransact;
         case 4:
            return this.cCardStat;
         case 5:
            return this.sRemarksx;
         case 6:
            return this.cTranStat;
         case 7:
            return this.sModified;
         case 8:
            return this.dModified;
         default:
            return null;
      }
   }

   public String getTable() {
      return "G_Card_History";
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
            this.nTranLine = (String) foValue;
            break;
         case 3:
            this.dTransact = (Date) foValue;
            break;
         case 4:
            this.cCardStat = (String) foValue;
            break;
         case 5:
            this.sRemarksx = (String) foValue;
            break;
         case 6:
            this.cTranStat = (String) foValue;
            break;
         case 7:
            this.sModified = (String) foValue;
            break;
         case 8:
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
