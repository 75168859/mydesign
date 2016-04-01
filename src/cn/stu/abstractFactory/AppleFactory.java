package cn.stu.abstractFactory;

public class AppleFactory extends AbstractFactory {

	@Override
	public Computer createComputer() {
		return new AppleComputer();
	}

	@Override
	public Mobile createMobile() {
		return new AppleMobile();
	}

}
