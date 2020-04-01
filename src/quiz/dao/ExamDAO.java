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
import quiz.pojo.Exam;

/**
 *
 * @author Pravesh
 */
public class ExamDAO {
    public static String getExamId()throws SQLException//beoz we are connecting to the database , so there can be SQL Exception
    { 
    Connection conn=DBConnection.getConnection();
    int rowCount=0;
    String qry="select count(*)as totalrows from Exam";
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery(qry);
    if(rs.next())
        rowCount=rs.getInt(1);
        String newid="EX-"+(rowCount+1);
        return newid;
    }
    public static void getExam(Exam exam)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into exam values(?,?,?)");//two possibilities record milega yaa nahi milega
        ps.setString(1,exam.getExamId());
        ps.setString(2,exam.getLanguage());
        ps.setInt(3,exam.getTotal());
        ps.executeUpdate();
    }
    public static ArrayList<String>examIdBySubject(String subject)throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("select examid from exam where language=? order by examid");
      ps.setString(1,subject);
      ResultSet rs=ps.executeQuery();
      ArrayList<String> examList=new ArrayList();
      while(rs.next())
      {
          examList.add(rs.getString(1));
          
      }
      return examList;
       }
    public static int getQuestionCountByExam(String examId)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select total_question from exam where examid=?");
        ps.setString(1,examId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        int rowCount=rs.getInt(1);
        return rowCount;
        
    }
}

