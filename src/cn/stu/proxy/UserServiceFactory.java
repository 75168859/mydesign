package cn.stu.proxy;

public class UserServiceFactory {
	
	public static UserService getInstance(){
		UserServiceImpl us = new UserServiceImpl();
		UserServiceProxy usProxy = new UserServiceProxy();
		usProxy.setUs(us);
		
		 return usProxy;//return us;
		
	}
}
