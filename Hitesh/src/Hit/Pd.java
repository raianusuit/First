package Hit;

class Any {
	private int an;
	public String pub = "public";
	protected String pro = "protected";
	private String pri = "private";
	String def = "defoult";

	void assign(int val) {
		an = val;
		System.out.println(an);
		System.out.println(pri);
	}
}

public class Pd {
	private int a = 5;
	public String pub1 = "public1";
	protected String pro1 = "protected1";
	private  String pri1 = "private1";
	String def1 = "defoult1";
	
//	public static void main(String[] args) {
//		Any any = new Any();
//		any.assign(4);
//		Pd pd = new Pd();
//		System.out.println(pd.a);
//		System.out.println(any.pub);
//		System.out.println(any.def);
//		System.out.println(any.pro);
//
//	}
}
