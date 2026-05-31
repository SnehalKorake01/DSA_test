import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int sum=0;
		int store=n;
		int evenCount=0;
		int oddCount=0;
		while(n!=0){
			int rem=n%10;
			if(rem%2==0){
				evenCount++;
			}
			else{
				oddCount++;
			}
			sum=sum+rem;
			n=n/10;
		}
		if(store%sum==0){
			System.out.println("Harshad number");
		}
		else{
			System.out.println("not harshad number");
		}
		System.out.println("Even Digit Count:"+evenCount);
		System.out.println("Odd Digit Count:"+oddCount);
	}
}
	