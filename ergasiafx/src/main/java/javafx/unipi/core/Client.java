package javafx.unipi.core;

public class Client {
	
	private String licensenumber; //αριθμός ταυτότητας
	private int afm; //Α.Φ.Μ.
	private String name;	//onama	
	private String surname;	//eponimo
	private String job;	//ιδιότητα (ιδιώτης, φοιτητής ή επαγγελματίας)
	private String adress;	//διεύθυνση
	private String email;	//τηλέφωνο
	private int phone;	//e-mail
	
	//Constructor
	public Client(String licensenumber, int afm, String name, String surname, String job, String adress, String email,
			int phone) {
		this.licensenumber = licensenumber;
		this.afm = afm;
		this.name = name;
		this.surname = surname;
		this.job = job;
		this.adress = adress;
		this.email = email;
		this.phone = phone;
	}
	
	//Getters setters
	public String getLicensenumber() {
		return licensenumber;
	}

	public void setLicensenumber(String licensenumber) {
		this.licensenumber = licensenumber;
	}

	public int getAfm() {
		return afm;
	}

	public void setAfm(int afm) {
		this.afm = afm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	//toString
	@Override
	public String toString() {
		return "Client [License number=" + licensenumber + ", A.F.M =" + afm + ", Name=" + name + ", Surname=" + surname
				+ ", Job=" + job + ", Adress=" + adress + ",  e-mail=" + email + ", Phone=" + phone + "]";
	}
	
	

}
