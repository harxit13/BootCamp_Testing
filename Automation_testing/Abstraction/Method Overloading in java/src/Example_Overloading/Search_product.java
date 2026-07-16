package Example_Overloading;

public class Search_product {

	public void search(String productName) {
		System.out.println("Search by Product Name");
	}
	public void search(String productName, String brand) {
		System.out.println("Search by Product and brand");
	}
	public void search(String productName, String brand, int price) {
		System.out.println("Search by Product, brand and price");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Search_product s=new Search_product();
            s.search("laptop");
            s.search("laptop","MacBook pro");
            s.search("laptop","MacBook pro", 60000);
	}

}
