package cn.stu.simpleFactory;

import java.io.IOException;
import java.util.Properties;

public class FruitFactory {

	private static Properties prop = new Properties();
	static{
		try {
			prop.load(FruitFactory.class.getResourceAsStream("/cn/stu/simpleFactory/fruit.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//不支持反射的语言做到此步即可
	public static Fruit getInstance(String name){
		if("apple".equals(name)){
			return new Apple();
		}else if("banana".equals(name)){
			return new Banana();
		}else{
			throw new RuntimeException("不存在");
		}
	}
	//动态加载类并做强制类型转换，配置文件+反射解耦
	public static Fruit getInstance(){
		try {
			return (Fruit)Class.forName(prop.getProperty("fruit")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
