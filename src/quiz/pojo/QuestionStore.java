/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pojo;

import java.util.ArrayList;

/**
 *
 * @author Pravesh
 */
public class QuestionStore {
    ArrayList<Questions>questionList;
    public QuestionStore()
    {
     questionList=new ArrayList<>();   
        
    }
    public void addQuestion(Questions q)
    {
        questionList.add(q);
    }
    public Questions getQuestion(int pos)
    {
        return questionList.get(pos);
    }
    public void removeQuestion(int pos)
    {
        questionList.remove(pos);
    }
    
    public void setQuestion(int pos,Questions q)
    {
        questionList.add(pos,q);
    }
    public ArrayList<Questions> getAllQuestion()
    {
        return questionList;
    }
    public int getCount()
    {
        return questionList.size();
    }
    
    
}
