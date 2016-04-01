package cn.stu.methodFactory;

//具体产品
public class Apple implements Fruit {

	@Override
	public void grow() {
		System.out.println("apple grow.......");

	}

	@Override
	public void plant() {
		System.out.println("apple plant.......");

	}

	@Override
	public void harvest() {
		System.out.println("apple harvest.......");

	}

}
