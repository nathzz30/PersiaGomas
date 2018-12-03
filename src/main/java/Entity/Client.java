package Entity;

public class Client {

	private String name;
	private int cedula;
	private String lastName;
	private String address;
	private int phone;
	private int year;
	private int month;
	private int day;
	private String details;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String name, int cedula, String lastName, String address, int phone, int year, int month, int day,
			String details) {
		super();
		this.name = name;
		this.cedula = cedula;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.year = year;
		this.month = month;
		this.day = day;
		this.details = details;
	}
	
	public Client(String name, int cedula, String lastName, String address, int phone, int year, int month, int day	) {
		super();
		this.name = name;
		this.cedula = cedula;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.year = year;
		this.month = month;
		this.day = day;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
	
}
