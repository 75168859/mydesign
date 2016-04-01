package cn.stu.prototype;

public class Test {
	public static void main(String[] args) {
		User u = new User();
		Address address = new Address();
		u.setAddress(address);
		User u1 = null;
		
		try {
//			u1 = (User)u.clone();//浅拷贝
			u1 = (User)u.deepClone();//深拷贝
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(u==u1);
		System.out.println(u.getAddress() == u1.getAddress());
		
	}
}
