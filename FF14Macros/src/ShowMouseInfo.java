import java.awt.MouseInfo;
import javax.swing.*;
import java.awt.GridLayout;;

public class ShowMouseInfo {
	ShowMouseInfo(){
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(5, 1));
		
		JLabel xCoord = new JLabel();
		JLabel yCoord = new JLabel();
		
		frame.add(xCoord);
		frame.add(yCoord);
		
		frame.setVisible(true);
		
		while(true){
			xCoord.setText("xCoord : " + MouseInfo.getPointerInfo().getLocation().x);
			yCoord.setText("yCoord : " + MouseInfo.getPointerInfo().getLocation().y);
			frame.pack();
		}
	}
	
	public static void main(String[] args){
		new ShowMouseInfo();
	}
}
