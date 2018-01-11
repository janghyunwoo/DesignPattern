/**
 * ���� �̸� : Ex129p.java
 * ���� ��¥ : 2017. 12. 11.
 */
package ch3.exercise;

import java.util.Calendar;

/**
 * @author ������(ehrtk2003@gmail.com)
 *
 */
public class Ex129p {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		TimeReminder time = new TimeReminder(new RealTime());
		time.reminder();
		

	}

}
class MP3{
	private String[] songList = {"����", "����", "�߶��"};
	
	public void playSong(String songName){
		if(songList.equals(songName)){
			System.out.println("Play : " + songName);
		}else{
			System.out.println("����Ʈ�� ���� �뷡 �Դϴ�.");
		}
	}
	
}

class TimeReminder{
	private TimeProvider m = null;
	private MP3 player = new MP3();
	
	
	public TimeReminder(TimeProvider m) {
		// TODO �ڵ� ������ ������ ����
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
		System.out.println("����ũ ����~");
	}
}

class RealTime implements TimeProvider{

	/* (��Javadoc)
	 * @see ch3.exercise.TimeProvider#playSong()
	 */
	@Override
	public void playSong(int time) {
		// TODO �ڵ� ������ �޼ҵ� ����
		if(time>=22){
			System.out.println("���� ����");
		}
	}
	
}






