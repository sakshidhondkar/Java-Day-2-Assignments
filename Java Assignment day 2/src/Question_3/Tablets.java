package Question_3;

class Tablets extends Medicine {
	private String companyName;
	private String address;
	private int ageOfCompany;
	private String businessType;
	
	
	public Tablets(String companyName, String address, int ageOfCompany, String businessType) {
		super();
		this.companyName = companyName;
		this.address = address;
		this.ageOfCompany = ageOfCompany;
		this.businessType = businessType;
	}

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Company Name:"+companyName);
		System.out.println("Company Address:"+address);
		System.out.println("Company Age of Company:"+ageOfCompany);
		System.out.println("Company Business Type:"+businessType);
		
		System.out.println("Tablets Should be store in cool and dry place.");

		
	}
	

}
