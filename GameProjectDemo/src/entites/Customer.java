package entites;


import abstracts.IEntity;

public class Customer implements IEntity {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int dateOfBirth;
	private boolean isOfficer;
	private boolean isStudent;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String firstName, String lastName, String nationalityId, int dateOfBirth, boolean isOfficer, boolean isStudent) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.isOfficer = isOfficer;
		this.isStudent = isStudent;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	public int getDateOfBirth() {
	    return dateOfBirth;
	}
	
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isOfficer() {
		return isOfficer;
	}

	public void setOfficer(boolean isOfficer) {
		this.isOfficer = isOfficer;
	}

	public boolean isStudent() {
		return isStudent;
	}

	public void setStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}

}
