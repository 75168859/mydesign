package cn.stu.single;

public abstract class WeekDay {
	private WeekDay(){}
	
	public static final WeekDay MON = new WeekDay() {
		
		@Override
		public WeekDay nextDay() {
			return TUE;
		}
	};
	
	public static final WeekDay TUE = new WeekDay() {
		
		@Override
		public WeekDay nextDay() {
			return WED;
		}
	};
	
	public static final WeekDay WED = null;

	
	public abstract WeekDay nextDay();
}
