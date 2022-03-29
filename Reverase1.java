package test;

public class Reverase1 {
static void show() {
	String str = "hello world";
	String str1 ="";
	
	for(int i=str.length()-1;i>=0;--i) {
		str1+=str.charAt(i);
	}
	System.out.println(str1);
}
	public static void main(String[] args) {
		
     show();
	}

}
