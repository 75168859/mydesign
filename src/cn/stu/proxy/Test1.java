package cn.stu.proxy;

public class Test1 {
	public static void main(String[] args) {
		
		UserService us = UserServiceFactory.getInstance();
		us.delUser();
		
		us.updateUser();
	}
}
