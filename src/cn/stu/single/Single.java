package cn.stu.single;

public class Single {
	private static Single single = null;
	
	private Single(){}
	public static synchronized Single getInstance(){
		if(single == null){
			single = new Single();
		}
		return single;
	}
}

class Single1{
	private static Single1 single1 = new Single1();
	private Single1(){}
	public static Single1 getInstance(){
		return single1;
	}
}




