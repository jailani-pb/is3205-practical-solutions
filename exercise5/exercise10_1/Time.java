package exercise5.exercise10_1;

public class Time {

	private long hour;
	private long minute;
	private long second;
	
	public Time() {
		this(0);
	}
	
	public Time(long elapseTime) {
		setTime(System.currentTimeMillis() + elapseTime);
	}
	
	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public long getHour() {
		return hour;
	}
	
	public long getMinute() {
		return minute;
	}
	
	public long getSecond() {
		return second;
	}
	
	public void setTime(long elapseTime) {
		long totalMilliseconds = elapseTime;
		long totalSeconds = totalMilliseconds / 1000;
		this.second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		this.minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		this.hour = totalHours % 24;
	}
	
	@Override
	public String toString() {
		return this.hour + ":" + this.minute + ":" + this.second;
	}
	
}




