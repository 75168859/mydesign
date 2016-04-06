package cn.stu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理处理器
 *
 */
public class ProxyInvocationHandler implements InvocationHandler {

	private Object target;
	
	public ProxyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ProxyInvocationHandler...before..");
		method.invoke(target, args);
		System.out.println("ProxyInvocationHandler...after..");
		return null;
	}
	
	public Object getProxy(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	

}
