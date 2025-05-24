class Account
{
	public String acc_no;
	public double balance;
	

	static
	{
		public static int perDayTransactionLimit=10;
	}

	Account()
	{

	}

	Account(String a, double b)
	{
		acc_no=a;
		balance=b;
	}


	public void show_AccInfo()
	{
		System.out.println("Account no: "+acc_no);
		System.out.println("Balance: " +balance);
		System.out.println("number of transaction: "+perDayTransactionLimit);

	}