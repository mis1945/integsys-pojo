/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.rmj.integsys.pojo;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.rmj.appdriver.iface.GEntity;

/**
 *
 * @author kalyptus
 */
@Entity
@Table(name = "G_Card_Promo_Detail")
public class UnitGCardPromoDetail implements Serializable, GEntity {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sTransNox")
   private String sTransNox;
   @Id
   @Basic(optional = false)
   @Column(name = "sPartsIDx")
   private String sPartsIDx;
   @Column(name = "nEntryNox")
   private Integer nEntryNox;
   @Column(name = "nTranAmtx")
   private Double nTranAmtx;
   @Column(name = "nPointsxx")
   private Double nPointsxx;
   @Column(name = "nQuantity")
   private Integer nQuantity;

   public UnitGCardPromoDetail() {
      this.sPartsIDx = "";
      this.nTranAmtx = 0.00;
      this.nPointsxx = 0.00;
      
      //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sTransNox");
      laColumns.add("nEntryNox");
      laColumns.add("sPartsIDx");
      laColumns.add("nTranAmtx");
      laColumns.add("nPointsxx");
      laColumns.add("nQuantity");
   }

   public String getTransNo() {
      return sTransNox;
   }

   public void setTransNo(String sTransNox) {
      this.sTransNox = sTransNox;
   }

   public String getPartsID() {
      return sPartsIDx;
   }

   public void setPartsID(String sPartsIDx) {
      this.sPartsIDx = sPartsIDx;
   }

   public Integer getEntryNo() {
      return nEntryNox;
   }

   public void setEntryNo(Integer nEntryNox) {
      this.nEntryNox = nEntryNox;
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

   public void setPoints(double nPointsxx) {
      this.nPointsxx = nPointsxx;
   }

   public Integer getQuantity() {
      return nQuantity;
   }

   public void setQuantity(int nQuantity) {
      this.nQuantity = nQuantity;
   }
   
   @Override
   public int hashCode() {
      int hash = 0;
      hash += (sTransNox != null ? sTransNox.hashCode() : 0);
      hash += (sPartsIDx != null ? sPartsIDx.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitGCardPromoDetail)) {
         return false;
      }
      UnitGCardPromoDetail other = (UnitGCardPromoDetail) object;
      if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
         return false;
      }
      if ((this.sPartsIDx == null && other.sPartsIDx != null) || (this.sPartsIDx != null && !this.sPartsIDx.equals(other.sPartsIDx))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitGCardPromoDetail[sTransNox=" + sTransNox + ", sPartsIDx=" + sPartsIDx + "]";
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
            return this.sTransNox;
         case 2:
            return this.nEntryNox;
         case 3:
            return this.sPartsIDx;
         case 4:
            return this.nTranAmtx;
         case 5:
            return this.nPointsxx;
         case 6:
            return this.nQuantity;
         default:
            return null;
      }
   }

   public String getTable() {
      return "G_Card_Promo_Detail";
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
             this.sTransNox = (String) foValue;
             break;
         case 2: 
             this.nEntryNox = (Integer) foValue;
             break;
         case 3: 
             this.sPartsIDx = (String) foValue;
             break;
         case 4: 
             this.nTranAmtx = (Double)foValue;
             break;
         case 5: 
             this.nPointsxx = (Double)foValue;
             break;
         case 6: 
             this.nQuantity = (Integer)foValue;
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
