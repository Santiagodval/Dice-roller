package dados;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.Border;

public class JButtonNoBack extends JButton {

	/**
	 * 
	 */
	
	///////////////////////////////////////
	//									 //
	//	I tried to make a button with no //
	//  background or line, so only the  //
	//	dices where visible, but draw a  //
	//	line anyways and made the        //
	//  background black                 //
 	//                                   //
	///////////////////////////////////////
	
	
	private static final long serialVersionUID = 1L;
	
	public JButtonNoBack(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	public Color background() {
		
		return Color.WHITE; //with null is black/deep grey
		
	}
	
	public Border getBorder() {
		
		return null;
		
	}
	
	

}
