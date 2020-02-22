package com.capgemini.healthcare.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.healthcare.dto.DiagnosticCenter;
import com.capgemini.healthcare.dto.Test;
import com.capgemini.healthcare.exception.HealthException;

public class Dao implements IDao {
	private Map<String,Test>map;
	HashMap<String,DiagnosticCenter>cMap;
	ArrayList<Test>listOfTests=new ArrayList<Test>();
	public  Dao() 
	{
	cMap=new HashMap<String,DiagnosticCenter>();

	}

	
		public boolean addCenter(DiagnosticCenter center) throws HealthException {
			if(cMap.containsKey(center.getCenterid()))
			{
			throw new HealthException("center already exist");
			}
			else
			{
			List<Test>list=new ArrayList<Test>();
			Test test=new Test();
			test.setTestName("blood test");
			list.add(test);
			Test test1=new Test();
			test.setTestName("blood group");
			list.add(test1);
			Test test2=new Test();
			test.setTestName("blood pressure");
			list.add(test2);
			center.setListOfTests(list);
			cMap.put(center.getCenterid(),center);


			}
			return true;
			}
			public List<DiagnosticCenter>displaycenter() throws HealthException{
			Collection<DiagnosticCenter> col=cMap.values();
			List<DiagnosticCenter>list=new ArrayList<DiagnosticCenter>(col);
			return list;
			}


			
	

	public boolean removecenter(DiagnosticCenter d) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean addcenter(DiagnosticCenter d) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
