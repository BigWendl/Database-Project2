package progress;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UI {
	
	private String[] loginTypes = {"User","Moderator"};
	
	private JFrame lScreen = new JFrame("Login");
	private JPanel panel = new JPanel(new GridBagLayout());
	
	private JLabel uLabel = new JLabel("Username:    ");
	private JLabel tLabel = new JLabel("Type:    ");
	
	private JTextField uField = new JTextField();
	
	private JComboBox<String> tDrop = new JComboBox<String>(loginTypes);
	
	private JButton lButton = new JButton("Login");
	
	public void createLogin() {
		
		lScreen.setVisible(true);
		lScreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		lScreen.setSize(400, 225);
		lScreen.setResizable(false);	
		lScreen.setLocationRelativeTo(null);
		
		lButton.setPreferredSize(new Dimension(100,25));
		tDrop.setPreferredSize(new Dimension(100,20));
		uField.setPreferredSize(new Dimension(100,20));
				
		GridBagConstraints g = new GridBagConstraints();
		g.gridx = 0;
		g.gridy = 0;
		g.anchor = GridBagConstraints.LINE_END;
		
		panel.add(uLabel, g);
		g.gridy++;
		g.insets = new Insets(10,0,0,0);
		panel.add(tLabel, g);
		
		g.anchor = GridBagConstraints.CENTER;
		g.gridy--;
		g.gridx++;
		g.insets = new Insets(0,0,0,0);
		
		panel.add(uField, g);
		g.gridy++;
		g.insets = new Insets(15,0,0,0);
		panel.add(tDrop, g);
		g.gridy++;
		g.insets = new Insets(22,0,0,0);
		panel.add(lButton, g);
		
		lScreen.add(panel);	
	}

}
