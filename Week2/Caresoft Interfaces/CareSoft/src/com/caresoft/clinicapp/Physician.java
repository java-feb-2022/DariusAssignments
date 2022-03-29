package com.caresoft.clinicapp;
import java.util.Date;
import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser {
	
	private ArrayList<String> patientNotes;
	
	//CONSTRUCTOR
	public Physician(Integer id) {
		super(id);
	}

	@Override
	public boolean assignPin(int pin) {
		int length = String.valueOf(pin).length();
		if (length == 4) {
			return true;
		}
		else {
			return false;
		}
		}
		
	@Override
	public boolean accessAuthorized(Integer confirmedAuthId) {
		if (this.id == confirmedAuthId) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void newPatientNotes(String notes, String patienName, Date date) {
		String report = String.format("Datetime Submitted: %s \n", date);
		report += String.format("Reported By ID: %s \n", this.id);
		report += String.format("Patient Name: %s \n", patienName);
		report +=String.format("Notes: %s \n", notes);
		this.patientNotes.add(report);
	}

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

}
