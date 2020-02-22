package com.capgemini.healthcare.service;

import java.util.ArrayList;

import com.capgemini.healthcare.dto.DiagnosticCenter;
import com.capgemini.healthcare.exception.HealthException;

public interface IService {
	
	
	ArrayList<DiagnosticCenter> centerlist = new ArrayList();

	public boolean addcenter(DiagnosticCenter d) throws HealthException;

	public boolean removecenter(DiagnosticCenter d);


}
