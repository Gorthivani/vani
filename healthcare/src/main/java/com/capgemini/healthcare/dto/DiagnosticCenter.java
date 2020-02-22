package com.capgemini.healthcare.dto;

import java.util.ArrayList;
import java.util.List;

public class DiagnosticCenter {
	List<Test> listOfTests = new ArrayList<Test>();
	List<Appointment> appointmentList = new ArrayList<Appointment>();
	public List<Test> getListOfTests() {
		return listOfTests;
	}
	public void setListOfTests(List<Test> listOfTests) {
		this.listOfTests = listOfTests;
	}
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}
	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}
	

  private  String centername;
   private String centerid;
 
public String getCentername() {
	return centername;
}
public void setCentername(String centername) {
	this.centername = centername;
}
public  String getCenterid() {
	return centerid;
}
public void setCenterid(String centerid) {
	this.centerid = centerid;
}

public DiagnosticCenter(String centername, String centerid) {
	super();
	this.centername = centername;
	this.centerid = centerid;
}
public DiagnosticCenter() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "DiagnosticCenter [centername=" + centername + ", centerid=" + centerid + "]";
}
}


   
