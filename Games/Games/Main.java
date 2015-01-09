import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
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
	JButton numGame, unoGame;
	
	public Menu(){
		createGui();
	}
	
	public void createGui(){
		this.setTitle("Game");
		this.setResizable(true);
		jtAreaOutput = new JTextArea(10, 31);
		jtAreaOutput.setEditable(false);
		numGame = new JButton("NumberGame");
		unoGame = new JButton("UnoGame");
		JScrollPane scrollPane = new JScrollPane(jtAreaOutput, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		GridBagLayout gridBag = new GridBagLayout();
		Container contentPane = getContentPane();
		contentPane.setLayout(gridBag);
		
		GridBagConstraints b1 = new GridBagConstraints();
		b1.gridx = 1;
		b1.gridy = 1;
		contentPane.add(numGame, b1);
		GridBagConstraints b2 = new GridBagConstraints();
		b2.gridx = 2;
		b2.gridy = 1;
		contentPane.add(unoGame, b2);
		
		numGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	
            }
		});
		unoGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	
            }
		});
	}
	
	
	
	public void addText(String str){
		jtAreaOutput.append(str);
		jtAreaOutput.setCaretPosition(jtAreaOutput.getDocument().getLength());
	}
}


}