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
import java.sql.Statement;
import java.util.ArrayList;
import quiz.dbutil.DBConnection;
import quiz.pojo.Performance;
import quiz.pojo.StudentStore;

/**
 *
 * @author Pravesh
 */
public class PerformanceDAO {
    public static ArrayList<String> getAllStudentId()throws SQLException
    {    ArrayList<String> studentIdList=new ArrayList();
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
ResultSet rs=st.executeQuery("select distinct userid from performance");
    while(rs.next())
    {
       String id=rs.getString(1);
       studentIdList.add(id);
       
    }
    return studentIdList;
    }
    public static ArrayList<String>getAllExamId(String studentId)throws SQLException
    {  String qry="select examid from performance where userid=?";
       ArrayList<String> studentIdList=new ArrayList();
        Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement(qry);
       ps.setString(1,studentId);
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {  
           String id=rs.getString(1);
           studentIdList.add(id);
       }
       return studentIdList;
    }
     public static StudentStore getScore(String studentId,String examId)throws SQLException
     {
        String qry="select language,per from performance where userid=? and examid=?";
        Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement(qry);
       ps.setString(1,studentId);
       ps.setString(2,examId);
       ResultSet rs=ps.executeQuery();
       rs.next();
       StudentStore scoreObj=new StudentStore();
       scoreObj.setLanguage(rs.getString(1));
       scoreObj.setPercent(rs.getDouble(2));
       return scoreObj;
       
       
               
     }
     public static ArrayList<Performance> getAllData()throws SQLException
     {
         String qry="select * from performance";
         ArrayList<Performance> performanceList=new ArrayList<Performance>();
         Connection conn=DBConnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
       while(rs.next())
       {
        String userId=rs.getString("userid");
        String language=rs.getString("language");
        String examId=rs.getString("examid");
        int wrong=rs.getInt("wrong");
        int right=rs.getInt("right");
        int unattempted=rs.getInt("unattempted");
        double per=rs.getDouble("per");
        Performance p=new Performance(userId,examId,wrong,right,unattempted,per,language);
        performanceList.add(p);
       }
       return performanceList;  
     }
     public static void addPerformance(Performance performance)throws SQLException
     {
       Connection conn=DBConnection.getConnection();
       String qry="insert into performance values(?,?,?,?,?,?,?)";
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,performance.getUserId());
        ps.setString(2,performance.getExamId());
        ps.setInt(3,performance.getRight());
         ps.setInt(4,performance.getWrong());
         ps.setInt(5,performance.getUnattempted());
         ps.setDouble(6,performance.getPer());
        ps.setString(7,performance.getLanguage());
        ps.executeUpdate();
       }
}
