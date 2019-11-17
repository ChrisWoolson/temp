import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Setup implements KeyListener{

	JFrame frame = new JFrame();
	JPanel panelLevel = new JPanel();
	JPanel panelNames = new JPanel();
	JLabel labelLevel = new JLabel();
	JLabel labelNames = new JLabel();
	
	ArrayList <String> levelNumber = new ArrayList<String>();
	int currentLevel = 0;
	public static void main(String[] args) {
		Setup set = new Setup();
		set.setup();
	
	}
	
	
	
	public void setup() {
		System.out.println("ran setup");
		
		
		levelNumber.add("Level 1");
		levelNumber.add("Level 2");
		levelNumber.add("Level 3");
		levelNumber.add("Level 4");
		levelNumber.add("Level 5");
		
		
		frame.add(panelLevel,BorderLayout.NORTH);
		frame.add(panelNames,BorderLayout.SOUTH);
		
		
		labelLevel.setVisible(true);
		labelNames.setVisible(true);
		
		panelLevel.add(labelLevel);
		panelNames.add(labelNames);
		
		labelLevel.setText("levels");
		labelNames.setText("Names");

		frame.setVisible(true);
		frame.pack();
		
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == 32) {
			
			if(currentLevel==5) {
				currentLevel=0;
			}
			else {
				currentLevel++;
			}
			System.out.println(currentLevel );
		
		
		
		
		}
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
