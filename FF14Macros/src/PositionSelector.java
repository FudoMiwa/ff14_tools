import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

/**
 * Points to click: Left, Right, Up, Down.
 */
@SuppressWarnings("serial")
public class PositionSelector extends JFrame implements MouseListener{
	private int clickCount;
	private String coordsOutput;
	private Point mouseLocation;
	
	public PositionSelector(){
		clickCount = 1;
		coordsOutput= "";
		
		addMouseListener(this);
		setUndecorated(true);
		setOpacity(0.1f);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new PositionSelector();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		mouseLocation = MouseInfo.getPointerInfo().getLocation();
		
		if(e.getButton() == MouseEvent.BUTTON3){
			switch(clickCount){
				case 1: coordsOutput += mouseLocation.x + ", "; break;
				case 2: coordsOutput += mouseLocation.x +", "; break;
				case 3: coordsOutput += mouseLocation.y + ", "; break;
				case 4: 
					coordsOutput += mouseLocation.y;
					System.out.print(coordsOutput);
					System.exit(EXIT_ON_CLOSE);
			}
			
			clickCount++;
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
}