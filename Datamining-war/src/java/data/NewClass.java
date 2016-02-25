package data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nishil09
 */
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class NewClass {
    
  public String overAllResult;
   public String friendResult;
   public String photoResult;
   public String groupResult;
   public String videoResult;
    
    public NewClass(String a,String b,String c,String d,String e)
    {
        this.overAllResult = a;
        this.friendResult = b;
        this.photoResult = c;
        this.groupResult = d;
        this.videoResult = e;
        
    }    

   
    
}
