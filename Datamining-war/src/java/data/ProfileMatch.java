package data;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nishil09
 */
//package current;

public class ProfileMatch {
    
    
   public NewClass nnn(double dis,double f,double p,double g,double v)
    {
        System.out.print(dis);
        int[] s1= new int[300000];
        Connection con = null;
      String a = "",b = "",c = "",d = "",e = "";
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        double limit1 = dis - 0.5;
        double limit2 = dis + 0.5;
        con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/R", "root", "");
        Statement st = con.createStatement();
        
        String s = "Select * from final where manhattanD >= " + limit1 +" "+ "and" + " " + " manhattanD" +"<=" +" " + limit2;
        // String s2 = "Select manhattanD from Manhattan where manhattanD > " + 1.596 +" "+ "and" + " " + " manhattanD" +"<=" +" " + 2.406;
         // String s3 = "Select manhattanD from Manhattan where manhattanD > " + 2.406 +" "+ "and" + " " + " manhattanD" +"<=" +" " + 3.895;
        
          ResultSet rs = st.executeQuery(s);
         // ResultSet rs1 = st1.executeQuery(s2);
          //ResultSet rs2 = st2.executeQuery(s3);
          double size = 0.0;
        int genuine = 0;
        int fake = 0;
         while(rs.next())
        {
           // System.out.println((Integer)rs.getObject("class"));
            if(rs.getInt(5) == 1)
            {
                genuine++;
            }
            else
            {
                fake++;
            }
           
        }
        
          //  s1[counter] = rs.getInt("V1");
    
        //}
        //con.close();
        if(genuine > fake)
        {
            a = "According to Manhattan Distance, Profile Genuine";
        }
        else
        {
         a = "According to Manhattan Distance, Profile Fake";   
        }
        genuine = 0;
        fake = 0;
        limit1 = f - 0.1;
        limit2 = f + 0.1;
        s = "Select * from final where Friend >= " + limit1 +" "+ "and" + " " + " Friend" +"<=" +" " + limit2;
        rs = st.executeQuery(s);
         while(rs.next())
        {
           // System.out.println((Integer)rs.getObject("class"));
            if(rs.getInt(5) == 1)
            {
                genuine++;
            }
            else
            {
                fake++;
            }
           
        }
          if(genuine > fake)
        {
            b = "According to Friends Normalized Value, Profile Genuine";
        }
          else
          {
               b = "According to Friends Normalized Value, Profile Fake";
          }
          genuine = 0;
        fake = 0;
        limit1 = p - 0.1;
        limit2 = p + 0.1;
        s = "Select * from final where photo >= " + limit1 +" "+ "and" + " " + " photo" +"<=" +" " + limit2;
        rs = st.executeQuery(s);
         while(rs.next())
        {
          //  System.out.println((Integer)rs.getObject("class"));
            if(rs.getInt(5) == 1)
            {
                genuine++;
            }
            else
            {
                fake++;
            }
           
        }
          if(genuine > fake)
        {
            c = "According to Photos Normalized Value, Profile Genuine";
        }
          else
          {
               c = "According to Photos Normalized Value, Profile Fake";
          }
          genuine = 0;
        fake = 0;
        limit1 = g - 0.1;
        limit2 = g + 0.1;
        s = "Select * from final where final.group >= " + limit1 +" "+ "and" + " " + " final.group" +"<=" +" " + limit2;
        rs = st.executeQuery(s);
         while(rs.next())
        {
          //  System.out.println((Integer)rs.getObject("class"));
            if(rs.getInt(5) == 1)
            {
                genuine++;
            }
            else
            {
                fake++;
            }
           
        }
          if(genuine > fake)
        {
            d = "According to Groups Normalized Value, Profile Genuine";
        }
          else
          {
               d = "According to Groups Normalized Value, Profile Fake";
          }
          genuine = 0;
        fake = 0;
        limit1 = v - 0.1;
        limit2 = v + 0.1;
        s = "Select * from final where video >= " + limit1 +" "+ "and" + " " + " video" +"<=" +" " + limit2;
        rs = st.executeQuery(s);
         while(rs.next())
        {
           // System.out.println((Integer)rs.getObject("class"));
            if(rs.getInt(5) == 1)
            {
                genuine++;
            }
            else
            {
                fake++;
            }
           
        }
          if(genuine > fake)
        {
            e = "According to Videos Normalized Value, Profile Genuine";
        }
          else
          {
               e = "According to Videos Normalized Value, Profile Fake";
          }
     //   double result = (genuine / fake) * 100.0;
       
        
       NewClass obj = new NewClass(a,b,c,d,e);
       // System.out.print(result);
       // String res = "Profile is genuine by " + result + " % " + "Gen" + genuine + " fake" + fake;
      
        return obj;
        
        }
        catch(ClassNotFoundException e1)
        {
            System.out.print("Something Went wrong");
           
        }
                
        catch(SQLException e1)
        {
            System.out.print("Something Went wrong");
            e1.printStackTrace();
        }
        finally
                {
                    
                }
        return null;
    }
    
}
