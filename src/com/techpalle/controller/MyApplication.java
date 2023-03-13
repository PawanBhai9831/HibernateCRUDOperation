package com.techpalle.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techpalle.pawan.Department;

public class MyApplication {

	public static void main(String[] args) 
	{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();	
		
		Session s = sf.openSession();
		
       Transaction t=s.beginTransaction();
       
       //insert the data
       /*Department d1=new Department("training","btm");
       s.save(d1);
       Department d2=new Department("development","hsr");
       s.save(d2);
       Department d3=new Department("sales","bommanahalli");
       s.save(d3);*/
       
       //print or read the data
       /*String d1 = s.get(Department.class, 1).getDeptName();
       System.out.println(d1);*/
       
      /* Department d1 = s.get(Department.class, 1);
       System.out.println(d1.getDeptName());
      
       Department d2 = s.get(Department.class, 2);
       System.out.println(d2.getDeptName());
      
       Department d3 = s.get(Department.class, 3);
       System.out.println(d3.getDeptName());*/
       
       //update the record
      /* Department y=s.get(Department.class, 2);
       y.setLocation("marathalli");
      s.update(y);*/
       
       //delete the record
        Department z=s.get(Department.class, 1);
        s.delete(z);
       
       t.commit();
       
       s.close();
       
       sf.close();
		
	}
}
