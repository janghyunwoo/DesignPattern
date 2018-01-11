/**
 * 파일 이름 : Ex129p.java
 * 만든 날짜 : 2017. 12. 11.
 */
package ch3.exercise;

import java.util.Calendar;

/**
 * @author 장현우(ehrtk2003@gmail.com)
 *
 */
public class Ex129p {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		TimeReminder time = new TimeReminder(new RealTime());
		time.reminder();
		

	}

}
class MP3{
	private String[] songList = {"가요", "힙팝", "발라드"};
	
	public void playSong(String songName){
		if(songList.equals(songName)){
			System.out.println("Play : " + songName);
		}else{
			System.out.println("리스트에 없는 노래 입니다.");
		}
	}
	
}

class TimeReminder{
	private TimeProvider m = null;
	private MP3 player = new MP3();
	
	
	public TimeReminder(TimeProvider m) {
		// TODO 자동 생성된 생성자 스텁
		this.m = m;
	}
	
	public void reminder(){
		Calendar cal = Calendar.getInstance();

		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		

	}
	

}

interface TimeProvider{
	
	public abstract void playSong(int time);
}

class FakeTime implements TimeProvider{
	public void playSong(int time){
		System.out.println("페이크 윙윙~");
	}
}

class RealTime implements TimeProvider{

	/* (비Javadoc)
	 * @see ch3.exercise.TimeProvider#playSong()
	 */
	@Override
	public void playSong(int time) {
		// TODO 자동 생성된 메소드 스텁
		if(time>=22){
			System.out.println("리얼 윙윙");
		}
	}
	
}






