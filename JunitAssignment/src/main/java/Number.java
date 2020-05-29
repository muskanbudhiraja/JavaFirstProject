
public class Number {

	int checkPrime(int x) throws Exception
	{
		if(x<0) throw new Exception("negative number");
		if(x==0 )
			return 0;
		if(x==1)
			return 0;
		for(int i=2; i<=x/2; i++)
		{
			
			if(x%i ==0)
				return 0;
		}
		return 1;
	}
	
	boolean checkArmstrong(int x) throws Exception
	{
		int no=0;
		int x1=x;
		int m;
		if(x<0) throw new Exception("negative number");
		while(x1%10 !=0)
		{
			m=x1%10;
			x1=x1/10;
			no+=m*m*m;
		}
		if(no==x)
			return true;
		return false;
	}
	
	boolean checkPalindrome(int x) throws Exception
	{
		int originalNo=x;
		int reverseNo=0;
		if(x<0) throw new Exception("negative number");
		while(x %10 !=0)
		{
			int no;
			no=x%10;
			x=x/10;
			reverseNo=reverseNo*10+no;
		}
		if(originalNo == reverseNo)
			return true;
		return false;
	}
}
