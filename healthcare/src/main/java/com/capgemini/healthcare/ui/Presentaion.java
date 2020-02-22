package com.capgemini.healthcare.ui;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


import com.capgemini.healthcare.dto.DiagnosticCenter;
import com.capgemini.healthcare.dto.Test;
import com.capgemini.healthcare.service.Service;



public class Presentaion {

	
		
		public static void main(String[] args) throws Exception   {
		Service s=new Service();
		ArrayList<Test>listsOfTests= new ArrayList<Test>();
		int choice=0;
		Test test=new Test();
		Scanner sc=new Scanner(System.in);


		while(choice!=4) {
		System.out.println("   Admin ");
		    System.out.println("1. addCenter");
		    System.out.println("2. displayCenter");
		   /* System.out.println("3. addTest");
		    System.out.println("4. removeTest");*/
		       System.out.println("Enter your choose :");
		       choice=sc.nextInt();
		switch(choice) {
		case 1:
		try
		{

		DiagnosticCenter dc=new DiagnosticCenter();
		System.out.println("Enter center name:");
		sc.nextLine();
		String centerName=sc.nextLine();
		dc.setCentername(centerName);
		s.addcenter(dc);
		String centerId=dc.getCenterid();
		System.out.println("id="+centerId);
		System.out.println("Center added successfully");
		
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		case 2:
		try
		{
		List<DiagnosticCenter>l=s.displaycenter();
		for(DiagnosticCenter d:l) {
		String ci=d.getCenterid()+" "+d.getCentername();
		System.out.println(ci);
		List<Test>t=d.getListOfTests();

		for(Test y:t)
		{
		String tname=y.getTestName();
		System.out.println(tname);
		}
		System.out.println(l);
		}

		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		}


		}

	}

}
