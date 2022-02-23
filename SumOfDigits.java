package Assignment.week1;

public class SumOfDigits {

	public static void main(String[] args) {
		int input=123;
		int sum=0;
		while(input>0)
		{
			sum=sum+input%10;
			input= input/10;
		}
		System.out.println(sum);
	}

}
