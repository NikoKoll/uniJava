package javafx.unipi.core;

public class TelecommunicationCompany {

	private int companycode; //μοναδικός κωδικός
	private int companyphone;	//τηλέφωνο
	private String email;	//e-mail
	private String companyname;	//επωνυμία εταιρίας
	
	//Constructor
	public TelecommunicationCompany(int companycode, int companyphone, String email, String companyname) {
		this.companycode = companycode;
		this.companyphone = companyphone;
		this.email = email;
		this.companyname = companyname;
	}
	
	//Getters setters
	public int getCompanycode() {
		return companycode;
	}

	public void setCompanycode(int companycode) {  				//magda int<-->String
		this.companycode = companycode;
	}

	public int getPhone() {
		return companyphone;
	}

	public void setPhone(int phone) {
		this.companyphone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	//toString
	@Override
	public String toString() {
		return "Telecommunication Company [Company code=" + companycode + ", Company phone=" + companyphone + ", email=" + email
				+ ", Company name=" + companyname + "]";
	}
	
	

}