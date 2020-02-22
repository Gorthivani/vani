package com.capgemini.healthcare.dao;

import java.util.List;

import com.capgemini.healthcare.dto.DiagnosticCenter;
import com.capgemini.healthcare.exception.HealthException;

public interface IDao {
	public boolean addcenter(DiagnosticCenter d);
	public boolean removecenter(DiagnosticCenter d);
	public List<DiagnosticCenter> displaycenter() throws HealthException;

	}



