package com.capgemini.healthcare.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Appointment {
	List <User> user = new ArrayList<User>();
	long appointmentId;
	LocalDate l;
	boolean approved;
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public LocalDate getL() {
		return l;
	}
	public void setL(LocalDate l) {
		this.l = l;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	@Override
	public String toString() {
		return "Appointment [user=" + user + ", appointmentId=" + appointmentId + ", l=" + l + ", approved=" + approved
				+ "]";
	}
	
	 

}
