import java.util.Scanner;

public class StringEx10 {
	public static String cutFirst(String str1, String str2){
		String s1 = str1.substring(1, str1.length());
		String s2 = str2.substring(1, str2.length());
		String s3;
		
		s3 = s1.concat(s2);
		
		return s3;
	}
	
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		String string1;
		String string2;
		
		System.out.println("Enter the first string: ");
		string1 = input.nextLine();
		
		System.out.println("Enter the first string: ");
		string2 = input.nextLine();
		
		System.out.println(cutFirst(string1, string2));
		
		input.close();
	}
}
