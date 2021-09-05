package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	//the get method returns the variable value, and the set method sets the value.//
	//getter and setter method name should be matched with their variable//
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	public int getItemsReceived() {
		return itemsReceived;
	}
	public void setItemsReceived(int newitemsReceived) {
		if (itemsReceived>0) {
			this.itemsReceived=newitemsReceived;
		}
		else {
			this.itemsReceived=0;
		}
	}
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	public float getDegreesTurned() {
		return degreesTurned;
	}
	public void setDegreesTurned(float newdegreesTurned) {
		degreesTurned=newdegreesTurned;
		if (degreesTurned<0) {
			degreesTurned=0;
		}
		if (degreesTurned>360) {
			degreesTurned=360;
		}
	}
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	public String getNomenClature() {
		return nomenclature;
	}
	public void setNomenClature(String newnomenclature) {
		if (nomenclature.equals("")) {
			nomenclature.equals(" ");
		}
		else {
			nomenclature.equals(newnomenclature);
		}
	}
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	public Object getMemberObj() {
		return memberObj;
	}
	public void setMemberObj(Object newmemberObj) {
		if (memberObj instanceof String) {
			memberObj=new Object();
		}
		else {
			memberObj=newmemberObj;
		}
	}
	public static void main(String[] args) {
		
	}
}
