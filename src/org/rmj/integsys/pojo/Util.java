/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.rmj.integsys.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author kalyptus
 */
public class Util {
    public static Date toDate(String date, String format){
       Date loDate = null;
       try{
			 //Be sure to follow the format specified
			 SimpleDateFormat sf = new SimpleDateFormat(format);
			 loDate = sf.parse(date);
       }
          catch(ParseException e){
          //Nothing to do;
       }

       return loDate;
    }
}

