package cn.stu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 
 * 产生代理对象的工厂
 *代理处理器
 */
public class ProxyFactoryBean implements InvocationHandler{

	private Object target;//目标对象 生成这个对象的代理
	
	public void setTarget(Object target) {
		this.target = target;
	}
	// target的代理对象产生后，任何方法的调用都会被invoke方法拦截
	// 如 掉 targetProxy.g(参数） 掉这个方法，就会被invoke方法拦截
	// args方法的参数
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(" InvocationHandler......权限、事务、日志...");
//		method.invoke(target, args);// 如果这句话不出现目标方法是不会被调用的。
		System.out.println("InvocationHandler.......事务、日志...");
		return null;
	}

	/**
	 * 产生代理对象
	 * （类加载器，目标对象实现的接口，代理处理器）
	 * @return
	 */
	public Object getProxy(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
	}
	
	
}




