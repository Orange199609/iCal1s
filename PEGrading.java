package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PEGrading extends JFrame implements ActionListener{
	JButton lowgrade,highgrade;
	Font font = new Font("华文行楷",Font.BOLD,16);
	
	public PEGrading(){
		super("体测成绩快速计算");
		setLayout(null);
	    this.setLocation(75,75);  
	    this.setDefaultCloseOperation(HIDE_ON_CLOSE);
	    
		lowgrade = new JButton("我大一/大二");
		lowgrade.setFont(font);
		lowgrade.setBounds(30,25,140,40);
		
		highgrade = new JButton("我大三/大四");
		highgrade.setFont(font);
		highgrade.setBounds(30,90,140,40);
		
		add(lowgrade);
		add(highgrade);
		lowgrade.addActionListener(this);
		highgrade.addActionListener(this);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==lowgrade){
			LowGrade window = new LowGrade();
			window.setTitle("性别选项");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
			window.setSize(200,200);
		}
		if(e.getSource()==highgrade){
			HighGrade window = new HighGrade();
			window.setTitle("性别选项");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
			window.setSize(200,200);
		}
	}
	

}
