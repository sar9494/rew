package sample;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;

public class mouseListener{

	MouseListener n=new MouseListener(){

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			if(SwingUtilities.isLeftMouseButton(e)) {
				 
			 }
			 else if (SwingUtilities.isRightMouseButton(e)) {
				 
			 }
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	};
	}
