package tiil.edu;

public class Time {
	int hour;
	int minute;
	int second;
	//khong can kiem tra gia tri
	
	public Time(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public void setHour(int hour) {
		this.hour = hour;
		return;
	}
	public void setMinute(int minute) {
		this.minute = minute;
		return;
	}
	public void setSecond(int second) {
		this.second = second;
		return;
	}
	public void setTime(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		return;
	}
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}
	
	public Time nextSecond() {
		second++;
		if(second == 60) {
			second = 0;
			minute++;
			if(minute == 60) {
				minute = 0;
				hour++;
				if(hour == 24)
					hour = 0;
			}
		}
		return this;
	}
	public Time previousSecond() {
		second--;
		if(second < 0) {
			second = 59;
			minute--;
			if(minute < 0) {
				minute = 59;
				hour--;
				if(hour < 0) {
					hour = 23;
				}
			}
		}
		
		return this;
	}
	
}
