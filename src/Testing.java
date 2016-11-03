

class Testing{
	public static void main(String[] args){
		Singleton tmp = Singleton.getSingleInstance();
		tmp.str = "otha";
		System.out.println(tmp.str);
		int[] a = new int[]{1,2};
		try{
			System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			String s=e.getClass().getName();
			System.out.println(s);
		}
		System.out.println("Ading otha");
	}
}

class Singleton{
    private static Singleton s = new Singleton();
    public String str;
    private Singleton(){
    }
    public static Singleton getSingleInstance(){
        return s;
    }
}