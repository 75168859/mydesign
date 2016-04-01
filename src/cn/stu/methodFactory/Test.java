package cn.stu.methodFactory;


/***
 * 
 * @author liuhuan
 *
 */
public class Test {
	public static void main(String[] args) {
		//使用者会对具体的工厂产生依赖
		AppleFactory appleFactory = new AppleFactory();
		Fruit apple = appleFactory.getInstance();
		
	}
}
