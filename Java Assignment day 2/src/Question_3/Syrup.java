package Question_3;

public class Syrup extends Medicine {
	 private String companyName;
	 private String address;
	 private int ageOfCompany;
	 
	public Syrup(String companyName, String address, int ageOfCompany) {
		super();
		this.companyName = companyName;
		this.address = address;
		this.ageOfCompany = ageOfCompany;
	}
 
	@Override
	public void displayLabel()
	{
		// TODO Auto-generated method stub
		System.out.println("Comapny Name:"+companyName);
		System.out.println("Company Address:"+address);
		System.out.println("Age of Company:"+ageOfCompany);
		System.out.println("Before taking this medication, tell your Dr or pharmacist.\nDuiring pregnancy, this mediciation should be used only if clearly needed. ");
		
	}
	 

}
