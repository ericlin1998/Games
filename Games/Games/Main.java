import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {
	
	
	public static void main(String[] args){
		
	}

	
	

public class Menu extends JFrame{
	JTextArea jtAreaOutput;
	JButton button;
	
	public Menu(){
		createGui();
	}
	
	public void createGui(){
		this.setTitle("Game");
		this.setResizable(true);
		jtAreaOutput = new JTextArea(10, 31);
		jtAreaOutput.setEditable(false);
		
	}
}


}