package javaclasswork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TemperatureConvertor extends JFrame implements ActionListener{
		private JTextField celsiusTextField;
		private JTextField fahrenheitTextField;
		public TemperatureConvertor() {
			//set Frame Properties
			setTitle("Temperature Convertor");
			setSize(300,150);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// Creating JPanel
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(3,2));
			//create and add components
			JLabel celciusLabel = new JLabel("Celcius");
			celsiusTextField = new JTextField();
			JLabel fahrenheitLabel = new JLabel("Fahrenheit");
			fahrenheitTextField = new JTextField();
			fahrenheitTextField.setEditable(false);
			JButton convertButton=new JButton("Convert");
			//Registering Button---> action listener
			convertButton.addActionListener(this);
			
			panel.add(celciusLabel);
			panel.add(celsiusTextField);
			panel.add(fahrenheitLabel);
			panel.add(fahrenheitTextField);
			panel.add(new JLabel());
			panel.add(convertButton);
			
			add(panel);
		}
			public static void main(String args []) {
				TemperatureConvertor temp = new TemperatureConvertor();
				temp.setVisible(true);
			}
		public void actionPerformed(ActionEvent e) {
			double celsius = Double.parseDouble(celsiusTextField.getText());
			double fahrenheit = (celsius*9/5)+32;
			fahrenheitTextField.setText(String.format("%.2f", fahrenheit));
					
		}
}
