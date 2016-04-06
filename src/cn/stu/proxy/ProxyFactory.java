package cn.stu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	
	private Object target;
	
	private InvocationHandler handler;
	
	public ProxyFactory(Object target, InvocationHandler handler) {
		this.target = target;
		this.handler = handler;
	}


	public Object getProxy(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
	}
	
	
}
