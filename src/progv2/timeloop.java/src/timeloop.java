import java.util.ArrayList;
import java.util.Scanner;
public class timeloop {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxTal = input.nextInt();
			String a = " Abracadabra";
		
			if (maxTal >= 0 && maxTal <=100) {
			
		 for (int tal = 1 ; tal <= maxTal ; tal++){
			 System.out.println(tal + a);
		 }
	}
			else {
				System.out.println("skitunge");
			}
}
}