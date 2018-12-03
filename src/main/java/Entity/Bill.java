package Entity;
import java.util.ArrayList;

public class Bill {

	private ArrayList<Article> artBill = new ArrayList<Article>();
	private ArrayList<Article> artInventory = new ArrayList<Article>();
	private int day;
	private int month;
	private int year;
	private float total;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(ArrayList<Article> artBill, ArrayList<Article> artInventory, int day, int month, int year,
			float total) {
		super();
		this.artBill = artBill;
		this.artInventory = artInventory;
		this.day = day;
		this.month = month;
		this.year = year;
		this.total = total;
	}
	public ArrayList<Article> getArtBill() {
		return artBill;
	}
	public void setArtBill(ArrayList<Article> artBill) {
		this.artBill = artBill;
	}
	public ArrayList<Article> getArtInventory() {
		return artInventory;
	}
	public void setArtInventory(ArrayList<Article> artInventory) {
		this.artInventory = artInventory;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}

	
	
	/*public boolean AddArticleToBill(Article art) 
	{
		
	}*/
}
