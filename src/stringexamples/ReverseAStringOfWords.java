package stringexamples;

public class ReverseAStringOfWords {

	public static void main(String[] args) {
		
		String s1="My Name is Sudheer";
		
		String[] words=s1.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i].toString());
			if(i!=0)
			{
				System.out.print(" ");
			}
		}
		
		



	}

}
