import java.util.Scanner ;
public class digitCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in );
		System.out.print("Please enter a number: ");
		int  a = input.nextInt();
		int sum = 0 ;
		
		while(a>=1) {
			sum +=a%10 ;
			a /= 10 ;
		}
		System.out.print(sum);
	}

}
