public class BlahMain {

	public static void main(String[] args) {
		System.out.println("blah");
		String a = null;
		//npe in the next line
		a.substring(0);
		a = a;
		
	}
}
