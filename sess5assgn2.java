package session5assignment2;

class building{
	
	public void getGarden(int height, int numOfFloors){	//method to check presence of garden
		if(height>=100 && numOfFloors>=20){	// buildings with height greater than 100m; floors>20 have garden
			System.out.println("This building has a garden");
		}else{
			System.out.println("This building does not have a garden");
		}
	}	
}
class skyScraper extends building{
	
	public void printHeight(){
		System.out.println("The height of the Sky scraper is 200 meters");
		super.getGarden(200, 50);
		System.out.println("This sky scraper also has an Infinity swimming pool");
		
	}
}
class commercial extends building{
	public void printHeight(){
		System.out.println("");
		System.out.println("The height of the commercial building is 100 meters");
		super.getGarden(100, 25);
		System.out.println("This sky scraper also has a common swimming pool");
	}	
}
class residential extends building{
	public void printHeight(){
		System.out.println("");
		System.out.println("The height of the Residential building is 50 meters");
		super.getGarden(50, 10);
	}
}
public class sess5assgn2 {

	public static void main(String[] args) {
		skyScraper build = new skyScraper();
		build.printHeight();
		
		commercial build2 = new commercial();
		build2.printHeight();
		
		residential build3 = new residential();
		build3.printHeight();
		
		}

}
