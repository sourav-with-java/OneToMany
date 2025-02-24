package com.androjavatech4u;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.androjavatech4u.bean.Answer;
import com.androjavatech4u.bean.Question;


public class App 
{
    public static void main( String[] args )
    {
        
   org.hibernate.Session  openSession2=	new Configuration().configure().buildSessionFactory().openSession();
        Transaction beginTransaction= openSession2.beginTransaction();
        
        Answer answer1=new Answer();
        answer1.setAnswername("What is java");
        answer1.setPostedby("Sourav");
        
        
        Answer answer2=new Answer();
        answer2.setAnswername("What is Servlet");
        answer2.setPostedby("Surya");
    	
      Answer answer3=new Answer();
      answer3.setAnswername("What is java");
      answer3.setPostedby("Sourav");
      
      Answer answer4=new Answer();
      answer4.setAnswername("What is servlet");
      answer4.setPostedby("surya");
      
     List<Answer> list1=new ArrayList<Answer>();
      list1.add(answer1);
      list1.add(answer2);
      
      
      List<Answer> list2=new ArrayList<Answer>();
      list2.add(answer3);
      list2.add(answer4);
      
      Question question1=new Question();
      question1.setQname("What is java");
      question1.setAnswer(list1);
      
      Question question2=new Question();
      question2.setQname("what is Servlet");
      question2.setAnswer(list2);
     
      openSession2.persist(question1);
      openSession2.persist(question2);
    beginTransaction.commit();
      openSession2	.close();
      System.out.println("Data inserted successfully");
    
       
    }
    }
