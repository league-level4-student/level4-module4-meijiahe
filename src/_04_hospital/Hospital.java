package _04_hospital;

import java.util.ArrayList;

public class Hospital {
 ArrayList<Doctor> docs = new ArrayList<Doctor>();
 ArrayList<Patient> patients = new ArrayList<Patient>();
 public ArrayList <Doctor> getDoctors() {
		return docs;
		
	}
 public ArrayList <Patient> getPatients() {
		return patients;
		
	}
 //void because we are not returning anything//
 //inside the parentheses is that we are asking for this variable//
 public void addDoctor(Doctor d) {
	 docs.add(d);
 }

 public void addPatient (Patient patient) {
	  System.out.println(patients.size());
	  patients.add(patient);
  }

 public void assignPatientsToDoctors() {
	 
 }
  
}