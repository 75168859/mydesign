package cn.stu.abstractFactory;

/**
 * 抽象工厂
 * @author liuhuan
 *
 */
public class Test {
	
	public static void main(String[] args) {
		AbstractFactory appleFactory = new AppleFactory();
		Computer appleComputer = appleFactory.createComputer();
		Mobile appleMobile =  appleFactory.createMobile();
		appleComputer.work();
		appleMobile.work();
		
		
		AbstractFactory huaweiFactory = new HuaweiFactory();
		Computer huaweiComputer = huaweiFactory.createComputer();
		Mobile huaweiMobile = huaweiFactory.createMobile();
		huaweiComputer.work();
		huaweiMobile.work();
	}
	
}
