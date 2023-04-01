class Bank 
{
	String bankName="State Bank Of India";
	String bankLocation="Near Edgewood, bhubaneswar";
	String ifscCode="SBIN0005159";
	int      empStrength=1200;

	public static void main(String[] args) 
	{
		Bank b = new Bank();
		System.out.println(b.bankName);
		System.out.println(b.bankLocation);
		System.out.println(b.ifscCode);
		System.out.println(b.empStrength);
	}
}
/*
State Bank Of India
Near Edgewood, bhubaneswar
SBIN0005159
1200
*/
