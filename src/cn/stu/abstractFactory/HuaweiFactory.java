package cn.stu.abstractFactory;

public class HuaweiFactory extends AbstractFactory {

	@Override
	public Computer createComputer() {
		return new HuaweiComputer();
	}

	@Override
	public Mobile createMobile() {
		return new HuaweiMobile();
	}

}
