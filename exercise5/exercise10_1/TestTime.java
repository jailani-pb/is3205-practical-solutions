package exercise5.exercise10_1;

public class TestTime {

	public static void main(String[] args) {
		System.out.println(new Time());
		System.out.println(new Time(555550000));
		Time time = new Time();
		time.setTime(555550000);
		System.out.println(time);
	}
	
}
