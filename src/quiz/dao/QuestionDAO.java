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
import java.util.ArrayList;
import quiz.dbutil.DBConnection;
import quiz.pojo.QuestionStore;
import quiz.pojo.Questions;

/**
 *
 * @author Pravesh
 */
public class QuestionDAO {
    public static void addQuestions(QuestionStore qstore)throws SQLException
    {
        String qry="insert into questions values(?,?,?,?,?,?,?,?,?)";
        ArrayList<Questions>questionList=qstore.getAllQuestion();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        for(Questions s:questionList)
        {
            ps.setString(1,s.getExamid());
            ps.setInt(2,s.getQno());
            ps.setString(3,s.getQuestion());
            ps.setString(4,s.getAnswer1());
            ps.setString(5,s.getAnswer2());
            ps.setString(6,s.getAnswer3());
            ps.setString(7,s.getAnswer4());
            System.out.println("Correct Answer:"+s.getCorrectAnswer());
            ps.setString(8,s.getCorrectAnswer());  
            ps.setString(9,s.getLanguage());
            ps.executeUpdate();
            
        }
    }
    public static ArrayList<Questions> getQuestionsByExamId(String examId)throws SQLException
    {
        String qry="select * from questions where examid=? order by qno";
        ArrayList<Questions> questionList=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,examId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            int qno=rs.getInt(2);
            String question=rs.getString(3);
            String option1=rs.getString(4);
            String option2=rs.getString(5);
            String option3=rs.getString(6);
            String option4=rs.getString(7);
            String correctAnswer=rs.getString(8);
            String language=rs.getString(9);
            Questions obj=new Questions(examId,qno,language,option1,option2,option3,option4,correctAnswer,question);
            questionList.add(obj);
        }
        return questionList;
        
    }
     public static void updateQuestions(QuestionStore qstore)throws SQLException
    {
        String qry="update questions set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=? where examid=? and qno=?";
        ArrayList<Questions>questionList=qstore.getAllQuestion();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        for(Questions s:questionList)
        {
            
            
            ps.setString(1,s.getQuestion());
            ps.setString(2,s.getAnswer1());
            ps.setString(3,s.getAnswer2());
            ps.setString(4,s.getAnswer3());
            ps.setString(5,s.getAnswer4());
            ps.setString(6,s.getCorrectAnswer());  
            ps.setString(7,s.getExamid());
            ps.setInt(8,s.getQno());
            ps.executeUpdate();
            
        }
    } 
    }
