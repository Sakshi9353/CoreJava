public class Mobile{
	int price;
	String model;
	String color;
	String brand;
	static string type;
	static{
		System.out.println("Static Block");
		type = "Smart phone";
	}

	public Mobile(int price, String model, String color, String brand, String type){
	System.out.println("Constructor Executed");
    this.price = price;
    this.model = model;
    this.color = color;
    this.brand = brand;
    this.type = type;
	}

	public static void main(String[] args){

		Mobile mobile = new Mobile(17000, "Note 7 pro", "black", "Redmi", "smartphone");

		Mobile mobile = new Mobile(15000, "Note 8", "white", "Samsung", "smartphone");


		
		//mobile.brand = "Redmi";
		//Mobile mobile2 = new Mobile();
		////mobile2.brand = "oppo";
		//mobile2.model = "f19";
		//mobile2.color = "blue";
		//mobile2.price = 22000;
		//mobile2.type = "smartphone";



		System.out.println(mobile.brand);
		System.out.println(mobile.model);
		System.out.println(mobile.color);
		System.out.println(mobile.price);
		System.out.println(mobile.type);
       
       
        System.out.println("---------------------------");

		
		System.out.println(mobile1.brand);
		System.out.println(mobile1.model);
		System.out.println(mobile1.color);
		System.out.println(mobile1.price);
		System.out.println(mobile1.type);
       
       
       // System.out.println("---------------------------");

        
        //System.out.println(mobile2.brand);
		//System.out.println(mobile2.model);
		//System.out.println(mobile2.color);
		//System.out.println(mobile2.price);
		//
		System.out.println(mobile2.type);
       
	}
}
