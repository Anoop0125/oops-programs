package homeworks;
import java.util.Scanner;
public class ReveStrin {
public static void main(String[] args) {
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word ");
	str=sc.nextLine();
	String rev=" ";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	if(str==rev)
	{System.out.println("The given word is a Palindrome");
	}
	else{
		System.out.println("not a palindrome");
		
	}
	


	
}

}