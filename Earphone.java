public class Earphone{
	static String headphoneJack;
	static String earPlacement;
	static String cableFeature;
	static int itemWeight;
	static String waterResistanceLevel;
	String color;
	int price;
	String type;
	int warenty;
	String compatibleDevices;

	static{
		 headphoneJack="wireless";
		earPlacement="In ear";
		cableFeature="withot cable";
		itemWeight = 30;
		waterResistanceLevel = "Water Resistant";
	}

	public Earphone(String color, int price, String type, int warenty, String compatibleDevices){
		this.type = type;
		this.color = color;
		this.price = price;
		this.warenty = warenty;
		this.compatibleDevices = compatibleDevices;
	}

	public static void main(String[] args){

		Earphone earphone = new Earphone("black", 1000, "noise", 1, "CellPhones");
		System.out.println(earphone.headphoneJack);
		System.out.println(earphone.earPlacement);
		System.out.println(earphone.cableFeature);
		System.out.println(earphone.itemWeight);
		System.out.println(earphone.waterResistanceLevel);
		System.out.println(earphone.type);
		System.out.println(earphone.color);
		System.out.println(earphone.price);
		System.out.println(earphone.warenty);
		System.out.println(earphone.compatibleDevices);
		System.out.println("-----------");

		Earphone earphone1 = new Earphone("blue", 2000, "samsang", 2, "Gaming consoles");
		System.out.println(earphone1.headphoneJack);
		System.out.println(earphone1.earPlacement);
		System.out.println(earphone1.cableFeature);
		System.out.println(earphone1.itemWeight);
		System.out.println(earphone1.waterResistanceLevel);
		System.out.println(earphone1.type);
		System.out.println(earphone1.color);
		System.out.println(earphone1.price);
		System.out.println(earphone1.warenty);
		System.out.println(earphone1.compatibleDevices);
		System.out.println("-----------");

		Earphone earphone2 = new Earphone("green", 3000, "bose", 3, "Tablets");
		System.out.println(earphone2.headphoneJack);
		System.out.println(earphone2.earPlacement);
		System.out.println(earphone2.cableFeature);
		System.out.println(earphone2.itemWeight);
		System.out.println(earphone2.waterResistanceLevel);
		System.out.println(earphone2.type);
		System.out.println(earphone2.color);
		System.out.println(earphone2.price);
		System.out.println(earphone2.warenty);
		System.out.println(earphone2.compatibleDevices);
		System.out.println("-----------");

		Earphone earphone3 = new Earphone("Yellow", 4000, "boat", 4, "Laptops");
		System.out.println(earphone3.headphoneJack);
		System.out.println(earphone3.earPlacement);
		System.out.println(earphone3.cableFeature);
		System.out.println(earphone3.itemWeight);
		System.out.println(earphone3.waterResistanceLevel);
		System.out.println(earphone3.type);
		System.out.println(earphone3.color);
		System.out.println(earphone3.price);
		System.out.println(earphone3.warenty);
		System.out.println(earphone3.compatibleDevices);
		System.out.println("-----------");

		Earphone earphone4 = new Earphone("pink", 5000, "apple", 5, "Desktop");
		System.out.println(earphone4.headphoneJack);
		System.out.println(earphone4.earPlacement);
		System.out.println(earphone4.cableFeature);
		System.out.println(earphone4.itemWeight);
		System.out.println(earphone4.waterResistanceLevel);
		System.out.println(earphone4.type);
		System.out.println(earphone4.color);
		System.out.println(earphone4.price);
		System.out.println(earphone4.warenty);
		System.out.println(earphone4.compatibleDevices);
		

	}
	
}

