/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import quiz.dbutil.DBConnection;

/**
 *
 * @author Pravesh
 */
public class UsersDAO {
    public static boolean findUsers(String userid,String password,String usertype)throws SQLException
{       boolean result;
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and usertype=?");//two possibilities record milega yaa nahi milega
        ps.setString(1,userid);
        ps.setString(2,password);
        ps.setString(3,usertype);
        ResultSet rs=ps.executeQuery();//hamesha banega
        result=rs.next();
        return result;
           
         
         
             
}       
    public static boolean checkUser(String userid)throws SQLException
    { boolean status=true;
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("select * from users where userid=?");
      ps.setString(1,userid);
      ResultSet rs=ps.executeQuery();
      if(rs.next())
      {
          status=false;
          return status;
      }
      
          return status;
          
      }
    
      
       public static int registerStudent(String userid,String password)throws SQLException
    
        {
        boolean check=checkUser(userid);
        int result=0;
        if(check)
        {
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?)");//two possibilities record milega yaa nahi milega
        ps.setString(1,userid);
        ps.setString(2,password);
        ps.setString(3,"Student");
        result=ps.executeUpdate();//hamesha banega
        return result;  
        }
        else
        return result;
}
   public static int changePassword(String userid,String password)throws SQLException
{     
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where userid=? and usertype='Student'");//two possibilities record milega yaa nahi milega
        ps.setString(1,password);
        ps.setString(2,userid);
        int ans=ps.executeUpdate();//hamesha banega
        return ans;  
}
}
