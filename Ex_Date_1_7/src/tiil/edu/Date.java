package tiil.edu;

public class Date {
	int day;
	int month;
	int year;
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day = day;
		return;
	}
	public void setMonth(int month) {
		this.month = month;
		return;
	}
	public void setYear(int year) {
		this.year = year;
		return;
	}
	public void setDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		return;
	}
	public String toString() {
		return String.format("%02d/%02d/%02d",day,month,year);
	}
	
}
