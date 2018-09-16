package week1.day2;

public class StringClass {

	public static void main(String[] args) {
	    
		String str = "Testleaf";
		char[] ch = str.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			System.out.print(ch[i]); 
		}

		/*String nameList = "babu,abhi,ram,gopi,sarath";
		String[] split = nameList.split(",");
		for(String s : split) 
		System.out.println(s);*/
	/*Integer i =10;
	System.out.println(i.toString()+10);
	String s = "10";
	System.out.println(s+10);*/
		
	
	/*String str ="Hello";
	System.out.println(str.length());
	System.out.println(str.charAt(1));
	System.out.println(str.replace('l', 'a'));
	//System.out.println(str.contains("o"));  
	//System.out.println(str.lastIndexOf("l"));
	//System.out.println(str.toUpperCase());
	//System.out.println("trimed "+str.trim());
	//str= str.concat(" World");
	//System.out.println(str.substring(0));
	//System.out.println(str);
    char[] ch = str.toCharArray();
    for(char c : ch) {
    	System.out.println(c); 
    }*/
	}

}




