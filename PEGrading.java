package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PEGrading extends JFrame implements ActionListener{
	JButton lowgrade,highgrade;
	JPanel  p1;
	public PEGrading(){
		super("体测成绩计算");
		setLayout(new FlowLayout());
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1));
		add(p1);
		lowgrade = new JButton("我大一/大二");
		highgrade = new JButton("我大三/大四");
		p1.add(lowgrade);
		p1.add(highgrade);
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
		}
		if(e.getSource()==highgrade){
			HighGrade window = new HighGrade();
			window.setTitle("性别选项");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
	}
	

}
