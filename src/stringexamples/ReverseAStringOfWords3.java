package stringexamples;



public class ReverseAStringOfWords3 {

	public static void main(String[] args) {
		
		String str="tomorrow";
		
		String output="";
		//t3m3223w
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='o')
			{
				output+="3";
			}
			else if(ch=='r')
			{
				output+="2";
			}
			else
			{
				output+=ch;
			}
			
		}
		
		System.out.print(output);
	}

}
