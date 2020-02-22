package com.capgemini.healthcare.service;

import java.util.List;
import java.util.Random;

import com.capgemini.healthcare.dao.Dao;
import com.capgemini.healthcare.dao.IDao;
import com.capgemini.healthcare.dto.DiagnosticCenter;
import com.capgemini.healthcare.exception.HealthException;

public class Service implements IService {
	private Dao user;
	 public Service()
	 {
	  user=new Dao();
	 }
	

	
		public boolean addcenter(DiagnosticCenter d) throws HealthException {
		
			// TODO Auto-generated method stub
			String name=d.getCentername();
			boolean flag=name.matches("[a-zA-Z]+");
			if(!flag)
			{
			throw new HealthException("center name should contain only alphabets");
			}
			Random random= new Random();
			int id= random.nextInt(100)+1000;
			String s=Integer.toString(id);
			d.setCenterid(s);
			user.addCenter(d);
			return true;
			
	}

		
	public boolean removecenter(DiagnosticCenter d) {
		// TODO Auto-generated method stub
		return false;
	}


	public  List<DiagnosticCenter>  displaycenter() {
		// TODO Auto-generated method stub
		return null;
	}

}
