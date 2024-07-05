package com.inherit2;
import org.hibernate.Session;
import org.hibernate.Transaction;
	public class Test {
	    public static void main(String[] args) {
	    	Transaction tr=null;
	    	try(Session ses= Hbutil.getSessionFactory().openSession()){
	    		tr=ses.beginTransaction();
	    		Employee e1=new Employee("Ramesh");
	    		RegEmployee e2=new RegEmployee(5500,"sales","Suresh");
	    		Trainee e3=new Trainee("6 months",200,"Umesh");
	    		ses.persist(e1);
	    		ses.persist(e2);
	    		ses.persist(e3);
	    		tr.commit();
	    		ses.close();
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    }


}
