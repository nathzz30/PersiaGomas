package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {

	private int code;
	private String name;
	private float priceC;
	private float priceVC;
	private float priceVS;
	private String type;
	private int cant;
	
	public Article(String name, float priceC, float priceVC, float priceVS, String type, int cant) {
		super();
		
		this.name = name;
		this.priceC = priceC;
		this.priceVC = priceVC;
		this.priceVS = priceVS;
		this.type = type;
		this.cant = cant;
	}
	
	public Article(int code, String name, float priceC, float priceVC, float priceVS, String type, int cant) {
		super();
		this.code = code;
		this.name = name;
		this.priceC = priceC;
		this.priceVC = priceVC;
		this.priceVS = priceVS;
		this.type = type;
		this.cant = cant;
	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name = "article_code")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPriceC() {
		return priceC;
	}

	public void setPriceC(float priceC) {
		this.priceC = priceC;
	}

	public float getPriceVC() {
		return priceVC;
	}

	public void setPriceVC(float priceVC) {
		this.priceVC = priceVC;
	}

	public float getPriceVS() {
		return priceVS;
	}

	public void setPriceVS(float priceVS) {
		this.priceVS = priceVS;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}


	
	
	
}
