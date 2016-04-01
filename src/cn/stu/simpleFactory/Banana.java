package cn.stu.simpleFactory;

//具体产品
public class Banana implements Fruit {

	@Override
	public void grow() {
		System.out.println("Banana grow....");
	}

	@Override
	public void plant() {
		System.out.println("Banana plant....");
	}

	@Override
	public void harvest() {
		System.out.println("Banana harvest....");
	}

}
