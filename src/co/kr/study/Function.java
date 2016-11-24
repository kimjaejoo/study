package co.kr.study;


public class Function {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String s = "Hello world";
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("hello world");
		sb.reverse();
		
		System.out.println(sb.toString());
		
		String[] world = {"H","e","l","l","o", "w","o","r","l","d"};
		System.out.println(world);
		for (int i = 0; i < world.length; i++) {
			System.out.print(world[i]);
		}
		System.out.println();
		for (int i = world.length-1; i >= 0; i--) {
			System.out.print(world[i]);
		}
		System.out.println();
		Function f = new Function();
		System.out.print(f.Hello(s));
		String  ss = f.world(world);
		
	}
	

	
	
	public StringBuffer Hello(String s){		
		StringBuffer sb = new StringBuffer();
		return sb.append(s).reverse();
	}
	
	public String world (String[] s){
		for (int i = s.length -1; i >= 0 ; i--) {
			System.out.println(s[i]);
			return s[i];
		}
		return "";
	}
	
	
}
