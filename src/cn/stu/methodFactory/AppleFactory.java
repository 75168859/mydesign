package cn.stu.methodFactory;

//具体工厂
public class AppleFactory extends FruitFactory {

	@Override
	public Fruit getInstance() {
		return new Apple();
	}

}
