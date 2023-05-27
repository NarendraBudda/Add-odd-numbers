import java.util.Scanner;
class evenoddsum{
	public static void main(String[] input){
		int num1;
		int evensum=0;
		int oddsum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		num1 = sc.nextInt();
		while(num1!=0){
			int reminder =(num1%10);
			if(reminder%2==0){
				evensum=evensum+reminder;
			}
			else{
				oddsum=oddsum+reminder;
			}
			num1= num1/10;
		}
			System.out.println("sum of even digits in number "+evensum);
			System.out.println("sum of odd digits in number "+oddsum);
	}
}