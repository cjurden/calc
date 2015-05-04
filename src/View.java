import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame{
	private JTextField first = new JTextField(5);
	private JTextField second = new JTextField(5);
	//private JLabel addlbl = new JLabel("+");
	private JButton add = new JButton("+");
	private JButton mult = new JButton("*");
	private JButton sub = new JButton("-");
	private JButton div = new JButton("/");
	private JTextField sol = new JTextField(10);
	
	View(){
		JPanel panel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		panel.add(first);
		//panel.add(addlbl);
		panel.add(second);
		panel.add(add);
		panel.add(sub);
		panel.add(mult);
		panel.add(div);
		panel.add(sol);
		
		this.add(panel);
	}
	
	public int getfirst(){
		return Integer.parseInt(first.getText());
	}
	
	/*public int getaddlbl(){
		return Integer.parseInt(addlbl.getText());
	}*/
	
	public int getsecond(){
		return Integer.parseInt(second.getText());
	}
	
	public int getadd(){
		return Integer.parseInt(add.getText());
	}
	
	public int getsol(){
		return Integer.parseInt(sol.getText());
	}
	
	public void setsol(int solution){
		sol.setText(Integer.toString(solution));
	}
	
	void addcalclistener(ActionListener addbtn){
		add.addActionListener(addbtn);
	}
	
	void subcalclistener(ActionListener subbtn){
		sub.addActionListener(subbtn);
	}
	
	void multcalclistener(ActionListener multbtn){
		mult.addActionListener(multbtn);
	}
	
	void divcalclistener(ActionListener divbtn){
		div.addActionListener(divbtn);
	}
	
	void disperror(String message){
		JOptionPane.showMessageDialog(this, message);
	}
	
	
}
