package String;

import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: “iNeuron”
		//Output: “norueNi”
		
		reverse("iNeuron");
		
		System.out.println(reverse1("Think Twice")) ;
		
		anagram("LISTEN","SILENT");
		
		
		
		anagram("LISTEN","SILENR");
		
		
		
		pangram();
		
		
		printRep("AAbCCRR");
		
	}
	
	
	public static String reverse(String s){
		
		char []arr=s.toCharArray();
		
		char []arr1=new char[arr.length];
		
		int count=0;

		for(int i=arr.length-1;i>=0;i--) {
			
			arr1[count] = arr[i];
			
			count++;
		}
		
		String revString="";
		
		for(char i:arr1) {
			
			
			revString=revString+i;
			
		}
		
		System.out.println(revString);
		
		return revString;
	}
	
	
	public static String reverse1(String s) {
		
		String s1="";
		String s2="";
		int mid=0;
		for(int i=0;i<s.length();i++) {
			
		if(s.charAt(i)==' ') {
			
			mid=i;
			
			
		}
			
		}
		
		for(int i=0;i<mid;i++) {
			
			
			s1=s1+s.charAt(i);
			
		}
		
		for(int i=mid+1;i<s.length();i++) {
					
					
					s2=s2+s.charAt(i);
					
				}
		
		String result=reverse(s1)+" "+reverse(s2);
		
		return result.toLowerCase();
		
		
		
	}
	
	public static void  anagram(String s1,String s2) {
		
		if(s1.length()!=s2.length()) {
			
			System.out.println("Not an anagram");
			
			
			
		}
		
		int count=0;
		
		for(int i=0;i<s1.length();i++) {
			
			char c=s1.charAt(i);
			
			for(int j:s2.toCharArray()) {
				
				if(c==j) {
					
					count++;
					
				}
				
			}
			
			
		}
		
		if(count==s1.length()||count==s2.length()) {
			
			
			System.out.println("Anagram toh hai");
			
			
			
		}else {
			
			System.out.println("Not an anagram");
			
			
			
		}
		
		
	}
	public static void pangram() {
	String str = "The quick brown fox jumps over the lazy dog";
    boolean[] alphaList = new boolean[26];
    int index = 0;
    int flag = 1;
    for (int i = 0; i < str.length(); i++) {
       if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
          index = str.charAt(i) - 'A';
       }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
	          index = str.charAt(i) - 'a';
	    }
	    alphaList[index] = true;
	 }
	 for (int i = 0; i <= 25; i++) {
	    if (alphaList[i] == false)
	    flag = 0;
	 }
	 
	 if (flag == 1)
	    System.out.print("\nThe above string is a pangram.");
	 else
	    System.out.print("\nThe above string is not a pangram.");
	 
	 System.out.println();

	}
	

	public static void printRep(String s) {
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		 {
			char c=s.charAt(i);
			
			for(int j=0;j<s.length();j++) {
				
				if(j==i) {
					
					continue;
					
				}
				
				
				
				if(c==s.charAt(j)) {
					
					
					count++;
					
				}
				
				
				if(count>1) {
					
					
					System.out.print(c);
					
					count=0;
					
					break;
					
					
				}
				
			}
			
			
			
			
			
			
		}
		
		System.out.println();
		
		
	}
	
	public static void alphabetically(String str) {
		
		
		char charArray[] = str.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(new String(charArray));
	      
	      
		
	}
	
	public static void countVC(String s) {
		
		int v=0;
		int c=0;
		for(char e:s.toCharArray()) {
			
			
			if(e=='A'||e=='E'||e=='I'||e=='O'||e=='U') {
				
				v++;
				
				
			}else {
				
				
				c++;
				
			}
			
			
		}
		
		
		System.out.println("Vowels :-"+v+" "+"Consonants :-"+c);
		
		
	}
	
	
	public static void specialNo(String s) {
		
		int n=0;
		
		int special=0;
		
		for(char e:s.toCharArray()) {
					
					
					if(e>='A'&&e<='Z') {
						
						n++;
						
						
					}else {
						
						
						special++;
						
					}
					
					
				}
		
		System.out.println("special no is :- "+ special);
				
		
	}
	
 }

