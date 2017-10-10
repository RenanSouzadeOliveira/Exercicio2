package exercicio2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface extends JFrame{
	double fahrenheit, celsius;
	
	Calculo calc = new Calculo();
	JLabel lblfahrenheit = new JLabel("Fahrenheit");
	JLabel lblcelsius = new JLabel("Celsius");
	
	JTextField txtfahrenheit = new JTextField();
	JTextField txtcelsius = new JTextField();
	
	JButton btnCalculo = new JButton("Calcular");
	
	public Interface(){
		super("Conversão de graus");
		Container paine = this.getContentPane();
		
		paine.add(lblfahrenheit);
		lblfahrenheit.setBounds(20,20,245,40);
		
		paine.add(lblcelsius);
		lblcelsius.setBounds(20, 90, 245, 40);
		
		paine.add(txtfahrenheit);
		txtfahrenheit.setBounds(100,30,140,20);
		
		paine.add(txtcelsius);
		txtcelsius.setBounds(100,100,140,20);
		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 fahrenheit = Double.parseDouble(txtfahrenheit.getText());
				 txtcelsius.setText("" + calc.graus(fahrenheit));
			 }
		 });
		btnCalculo.setBounds(110,160,100,40);
		
		txtcelsius.setEditable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		Interface cad = new Interface();
		
	}
}
