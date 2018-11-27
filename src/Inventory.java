import java.util.ArrayList;

public class Inventory {

	private ArrayList<Article> articles = new ArrayList<Article>();
	

	public Inventory(ArrayList<Article> articles) {
		super();
		this.articles = articles;
	}

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}

	public boolean NewArticle ( String name, float priceC, float priceVC, float priceVS, String type, int cant) 
	{
		Article art = new Article (name,priceC, priceVC, priceVS, type, cant);
		articles.add(art);
		return true;
	
	}
	
	public boolean NewArticleLocal (int code, String name, float priceC, float priceVC, float priceVS, String type, int cant) 
	{
		Article art = new Article (code,name,priceC, priceVC, priceVS, type, cant);
		articles.add(art);
		return true;
	
	}
	
	public boolean DeleteArticle (int code) 
	{
		
		for(int i=0; i<articles.size() ; i++)
		{
			
			if(articles.get(i).getCode() == code)
			{
				articles.remove(i);
				return true;
			}
		}
		return false;
	}
}
