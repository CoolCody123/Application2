class Mobile
{
	int imeiNum=12345;
	String model="IQZ7 Pro";
	String brandName="IQ";
	double price=17500.00;
	String warrenty="2 years";
	String color="glossy black";
	String assosories="charger,earphone,backcover";
	public static void main(String[] args) 
	{
		Mobile m = new Mobile();
		System.out.println(m.imeiNum);
		System.out.println(m.model);
		System.out.println(m.brandName);
		System.out.println(m.price);
		System.out.println(m.warrenty);
		System.out.println(m.color);
		System.out.println(m.assosories);
		System.out.println(10+"ratan"+(20+5)+("naresh"+3+3));
		System.out.println(10+"ratan"+3*10/2+"naresh");
	}
}
