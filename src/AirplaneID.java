import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class AirplaneID extends JFrame{
	int spotEng = 3;
	String spotLoc = "body";
	String spotType = "jet";
	int idEng;
	String idLoc;
	String idType;
	
	ButtonGroup numbEng = new ButtonGroup();
	JRadioButton oneEngRadioButton = new JRadioButton();
	JRadioButton twoEngRadioButton = new JRadioButton();
	JRadioButton threeEngRadioButton = new JRadioButton();
	JRadioButton fourEngRadioButton = new JRadioButton();
	JPanel sizePanel = new JPanel();
	
	JPanel typePanel = new JPanel();
	ButtonGroup typeEng = new ButtonGroup();
	JRadioButton jetRadioButton = new JRadioButton();
	JRadioButton propellerRadioButton = new JRadioButton();
	
	public AirplaneID() {
		setTitle("AirplaneIdentification");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				exitForm(evt);
			}
		});
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints c;
		getContentPane().setBackground(Color.BLUE);
		
		sizePanel.setLayout(new GridBagLayout());
		sizePanel.setBorder(BorderFactory.createTitledBorder("Number of engines"));
		sizePanel.setBackground(Color.PINK);
		
		oneEngRadioButton.setText("1 engine");
		oneEngRadioButton.setSelected(true); // sets default conditions
		oneEngRadioButton.setBackground(Color.PINK);
		numbEng.add(oneEngRadioButton);
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.WEST;
		sizePanel.add(oneEngRadioButton, c);
		oneEngRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sizeRadioButtonActionPerformed(e);
			}
		});
		
		twoEngRadioButton.setText("2 engines");
		twoEngRadioButton.setBackground(Color.PINK);
		numbEng.add(twoEngRadioButton);
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 1;
		c.anchor = GridBagConstraints.WEST;
		sizePanel.add(twoEngRadioButton, c);
		twoEngRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sizeRadioButtonActionPerformed(e);
			}
		});
		
		threeEngRadioButton.setText("3 engines");
		threeEngRadioButton.setBackground(Color.PINK);
		numbEng.add(threeEngRadioButton);
		c = new GridBagConstraints(); // erases anything had in gridBagConstraints before
		c.gridx = 0;
		c.gridy = 2;
		c.anchor = GridBagConstraints.WEST;
		sizePanel.add(threeEngRadioButton, c);
		threeEngRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sizeRadioButtonActionPerformed(e);
			}
		});
		
		fourEngRadioButton.setText("4 engines");
		fourEngRadioButton.setBackground(Color.PINK);
		numbEng.add(fourEngRadioButton);
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 3;
		c.anchor = GridBagConstraints.WEST;
		sizePanel.add(fourEngRadioButton, c);
		fourEngRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sizeRadioButtonActionPerformed(e);
			}
		});
		
		c = new GridBagConstraints(); // erase the old ones
		c.gridx = 0;
		c.gridy = 0;
		getContentPane().add(sizePanel, c); // adds size panel to the JFrame at position 0,0 on the JFrame
		// end of size panel
		
		
		jetRadioButton.setText("Eat In");
		jetRadioButton.setSelected(true);
		jetRadioButton.setBackground(Color.PINK);
		typeEng.add(jetRadioButton);
		c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.WEST;
		typePanel.add(jetRadioButton, c);
		jetRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				typeRadioButtonPerformed(e);
			}
		});
		
		takeOutRadioButton.setText("Eat Out");
		takeOutRadioButton.setBackground(LightPink);
		whereButtonGroup.add(takeOutRadioButton);
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 0;
		c.anchor = GridBagConstraints.WEST;
		locationPanel.add(takeOutRadioButton, c);
		takeOutRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				whereRadioButtonPerformed(e);
			}
		});
		
		setSize(400, 300);
		//pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int) (0.5 * (screenSize.width - getWidth())), // sets in center of screen
				(int) (0.5 * (screenSize.height - getHeight())),
				getWidth(), getHeight()); //screenSize.width owned by Dimension, getWidth() owned by JFrame

		
	}
	
	private void exitForm(WindowEvent evt){ 
		System.exit(0);
	}
	
	private void sizeRadioButtonActionPerformed(ActionEvent e) {
		
	}
	
	private void typeRadioButtonPerformed(ActionEvent e) {
		
	}
	
	public  void createAirplaneData() {
		// do this in AirplaneID class
		AirplaneData F15 = new AirplaneData();
			F15.setNumberEngines(2);
			F15.setEngineType("jet");
			F15.setEngineLocation("body");
		
		AirplaneData F16 = new AirplaneData();
			F16.setNumberEngines(1);
			F16.setEngineType("jet");
			F16.setEngineLocation("body");
		
		AirplaneData F18 = new AirplaneData();
			F18.setNumberEngines(2);
			F18.setEngineType("jet");
			F18.setEngineLocation("body");
		
		AirplaneData F22 = new AirplaneData();
			F22.setNumberEngines(2);
			F22.setEngineType("jet");
			F22.setEngineLocation("body");
		
		AirplaneData F35 = new AirplaneData();
			F35.setNumberEngines(1);
			F35.setEngineType("jet");
			F35.setEngineLocation("body");
		
		AirplaneData A10 = new AirplaneData();
			A10.setNumberEngines(2);
			A10.setEngineType("jet");
			A10.setEngineLocation("rear");

		
	}
	
	
	private void engineNumb() {
		if (spotEng == 1) {
			
		} else if (spotEng == 2) {
			
		} else if (spotEng == 3) {
			
		} else if (spotEng == 4) {
			
		} else {
			
		}
		
	}
	
	private void engineLoc() {
		if (spotLoc.equals("body")) {
			
		} else if (spotLoc.equals("wings")) {
			
		} else if (spotLoc.equals("rear")) {
						
		} else {
			
		}
		
	}
	
	private void engineType() {
		if (spotType.equals("jet")) {
			
		} else if (spotType.equals("propeller")) {
			
		} else {
			
		}
		
	}
	
	public void determiner() {
		
	}
	
}




