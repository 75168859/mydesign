package cn.stu.single;

/**
 * 复杂枚举
 * @author liuhuan
 *
 */
public enum MyWeekDay {
 MON{
	@Override
	public MyWeekDay nextDay() {
		return null;
	}
},TUE(){
	@Override
	public MyWeekDay nextDay() {
		return null;
	}
},WED(3){
	@Override
	public MyWeekDay nextDay() {
		return null;
	}
};
 //编译器编译的时候会翻译成   public static final WeekDay MON
 
 private MyWeekDay(){}
 private MyWeekDay(int n ){}
 public abstract MyWeekDay nextDay();
}

//一个对象的子类重写了toString
enum X{
	x1{
		@Override
		public String toString() {
			return super.toString();
		}
	}
}
