import java.util.Scanner;
class oop{
	
	public static void main(String args[]){
		
		Scanner sca = new Scanner(System.in);
		
		char D=sca.next().charAt(0);
		sca.nextLine();
		
		System.out.println("The ASCII value of "+D+" is "+ (int)D +	" .");
		
		System.out.println("----------------------------------------------");
		
		for(int i=32;i<127;i++){
		
		System.out.println("The ASCII value of "+(char)i+" is "+ i +	" .");
		
		}
		
		sca.close();
		
	}
}