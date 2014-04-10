import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Macro{
	static Robot robot;
	
	public static void main(String[] args) {
		try {
			robot = new Robot();
		} catch (AWTException e) {e.printStackTrace();}
		
		crafting();
		//fishing();
		//fight3();
		//banemite();
	}
	
	private static void crafting(){
		for(int i = 0; i < 48; i++){
			leftclick(726, 849, 561, 578);
			sleep(5000, 1000);
			klickKey(KeyEvent.VK_1);
			sleep(30000, 8000);
			klickKey(KeyEvent.VK_2);
			sleep(15000, 5000);
		}
	}
	
	private static void fishing(){
		for(int i = 0; i < 2000; i++){
			klickKey(KeyEvent.VK_1);
			robot.delay(23000);
		}
	}
	
	private static void fight3(){
		while(true){
			sleep(5000, 3000);
			klickKey(KeyEvent.VK_TAB);
			klickKey(KeyEvent.VK_1);
			sleep(30000, 30000);

		}
	}
	
	private static void fight2(){
		while(true){
			sleep(5000, 3000);
			klickKey(KeyEvent.VK_TAB);
			klickKey(KeyEvent.VK_1);
			sleep(60000, 0);
			sleep(30000, 30000);

		}
	}
	
	private static void banemite(){
		while(true){
			sleep(5000, 3000);
			klickKey(KeyEvent.VK_TAB);
			klickKey(KeyEvent.VK_1);
			sleep(40000, 20000);
		}
	}
	
	private static void aldgoat(){
		sleep(5000, 3000);
		
		while(true){
			klickKey(KeyEvent.VK_TAB);
			klickKey(KeyEvent.VK_1);
			sleep(40000, 20000);
		}
	}
	
	private static void sleep(int ms, int maxTimelag){
		robot.delay(ms + randomInt(0, maxTimelag));
	}
	
	private static void klickKey(int button){
		robot.keyPress(button);
		sleep(100, 400);
		robot.keyRelease(button);
	}
	
	/**
	 * 
	 * @param xCoordLeft - Left border of button to click
	 * @param xCoordRight - Right border of button to click
	 * @param yCoordUp - Upper border of button to click
	 * @param yCoordDown - Lower border of button to click
	 */
	private static void leftclick(int xCoordLeft, int xCoordRight, int yCoordUp, int yCoordDown){
		robot.mouseMove(randomInt(xCoordLeft, xCoordRight), randomInt(yCoordUp, yCoordDown));
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		sleep(500, 500);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	private static int randomInt(int lowestValue, int highestValue){
		Random rnd = new Random();
		return lowestValue + rnd.nextInt(highestValue-lowestValue);
	}
}
