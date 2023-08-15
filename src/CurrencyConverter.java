import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;


public class CurrencyConverter extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	
	public CurrencyConverter() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 618, 479);
			
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		
		this.setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(130, 222, 200, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		String[] choices = {"", "Dollars to Pesos", "Pesos to Dollars", "Dollars to Yen", "Dollars to Pounds", "Dollars to HKD"};
		comboBox = new JComboBox(choices);
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		comboBox.setBounds(353, 222, 114, 37);
		comboBox.addActionListener(this);
		contentPane.add(comboBox);
		
		JLabel instructionLabel = new JLabel("Enter a number to convert");
		instructionLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		instructionLabel.setBounds(208, 156, 259, 37);
		contentPane.add(instructionLabel);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel.setBounds(208, 301, 259, 45);
		contentPane.add(lblNewLabel);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();
		double x = Double.parseDouble(text);
		if(e.getSource()== comboBox) {
			String selected = comboBox.getSelectedItem().toString();
			if(selected.equalsIgnoreCase("Dollars to Pesos")) {
				x = x * 17.094996;
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0, result+3);
				lblNewLabel.setText(output + " Pesos");
			}
			else if(selected.equalsIgnoreCase("Pesos to Dollars")) {
				x = x * 0.0585299;
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0, result+3);
				lblNewLabel.setText(output + " Dollars");
			}
			else if(selected.equalsIgnoreCase("Dollars to Yen")) {
				x = x * 145.61439;
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0, result+3);
				lblNewLabel.setText(output + " Yen");
			}
			else if(selected.equalsIgnoreCase("Dollars to Pounds")) {
				x = x * 0.78684104;
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0, result+3);
				lblNewLabel.setText(output + " Pounds");	
			}
			else if(selected.equalsIgnoreCase("Dollars to HKD")) {
				x = x * 7.8227005;
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0, result+3);
				lblNewLabel.setText(output + " HKD");
			}
			else if(selected.equalsIgnoreCase("Pesos to RMB")) {
				x = x * 7.2859962;
				String s = Double.toString(x);
				int result = s.indexOf(".");
				String output = s.substring(0, result+3);
				lblNewLabel.setText(output + " RMB");
			}
		}
		
	}
}
