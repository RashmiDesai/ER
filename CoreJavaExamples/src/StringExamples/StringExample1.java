package StringExamples;

public class StringExample1 {

	public static void main(String[] args) 
	{
		String str = "Rashmi";
		
		
		System.out.println("String length is :"+str.length());
		
		String revStr = "";
		for(int i=str.length()-1;i>= 0;i--)
		{
			revStr = revStr+str.charAt(i);
		}
		System.out.println("Reversed String is : "+revStr);
	}

}
