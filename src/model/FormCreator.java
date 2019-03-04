package model;

public class FormCreator {
	private String FName;
	private String LName;
	private String Age;
	
	
	
	public FormCreator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormCreator(String fname, String lname, String a) {
		Format(fname, lname, a);
	}
	
	
	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	
	
	public void Format (String fname, String lname, String a ) {
		String partfn = fname.substring(0,1);
		String partln = lname.substring(0,1);
		String lastpartfn = fname.substring(1);
		String lastpartln = lname.substring(1);
		
		FName = partfn + lastpartfn;
		LName = partln + lastpartln;
		Age = a;
	}
}
