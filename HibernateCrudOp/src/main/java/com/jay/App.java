package com.jay;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jay.Entity.User;

public class App 
{
    public static void main( String[] args )
    {
//    	User user1 = new User();
//    	user1.setId(1);
//    	user1.setName("jay");
//    	user1.setEmail("jay@gmail.com");
//    	user1.setPassword("jay123");
//    	user1.setGender("male");
//    	user1.setCity("Pune");
    	
    	User user2 = new User();
    	user2.setName("Suresh");
    	user2.setEmail("suresh@gmail.com");
    	user2.setPassword("suresh123");
    	user2.setGender("male");
    	user2.setCity("Dhule");
    	
        Configuration cfg = new Configuration();
        cfg.configure("/com/jay/config/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        //--------Insert Operation------------//
        
//        try
//        {
//        session.save(user2);
//        transaction.commit();
//        
//        System.out.println("User Details added SuccessFully :)");
//        }
//        catch(Exception e)
//        {
//        	transaction.rollback();
//        	e.printStackTrace();
//        	
//        	System.out.println("Something May Wrong... :( ");
//        }
        
        
        
        
        
        
        
     //---------Select Operation----------// get data from database
        
//        try
//        {
//        	User user = session.get(User.class, 4L); // get data in user object
//        	
//        	if(user != null)
//        	{
//        		System.out.println(user.getId());
//            	System.out.println((user.getName()));
//            	System.out.println(user.getEmail());
//            	System.out.println(user.getPassword());
//            	System.out.println(user.getGender());
//            	System.out.println(user.getCity());
//        	}
//        	else
//        	{
//        		System.out.println("User not found...!");
//        	}
//        	
//        	
//        }
//        catch(Exception e)
//        {
//        	e.printStackTrace();
//        }

        
        
        
    
        
        //--------------Update Operation--------------//
        
    
        
//        try
//        {
//        	User user = session.get(User.class, 2L);
//        	user.setCity("Nanded"); 
//        	session.saveOrUpdate(user);
//        	transaction.commit();
//        	
//        	System.out.println("Updated Details Successfully");
//        }
//        
//        catch(Exception e)
//        {
//        	transaction.rollback();
//        	System.out.println("Could Not Update...:(");
//        }

        
        
        
        
        
        
        
        //------------------Delete Data------------//
        
        try
        {
        	User user = new User();
        	user.setId(2L);
        	
        	session.delete(user);
        	transaction.commit();
        	
        	System.out.println("User Deleted Successfully");
        }
        catch(Exception e)
        {
        	transaction.commit();
        	e.printStackTrace();
        	
        	System.out.println("Something went wrong...:(");
        }
    }
}
