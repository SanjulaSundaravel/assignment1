package Assignment.week1;

public class PrimeNumber {

	public static void main(String[] args) {
	int input=13;
	boolean flag= false;
	for(int i=2;i<=input/2; i++) {
		if(input%i==0)
			flag =true;
		break;
	}
	if(flag==false)
		System.out.println("The number "+input+"  is Prime");
	else
		System.out.println("The number "+input+"  is not Prime");

	}

}
