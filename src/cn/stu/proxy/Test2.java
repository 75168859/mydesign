package cn.stu.proxy;

/**
 * 动态代理
 *
 */
public class Test2 {
	
	public static void main(String[] args) {
		UserServiceImpl us = new UserServiceImpl();
		/*ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(us);
		UserService usProxy = (UserService)pfb.getProxy();
		usProxy.delUser();
		usProxy.updateUser();*/
		
		ProxyInvocationHandler pih = new ProxyInvocationHandler(us);
		UserService usProxy2 = (UserService)pih.getProxy();
		usProxy2.delUser();
		usProxy2.updateUser();

	}
	
}
