package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HighGrade extends JFrame implements ActionListener{
	JButton boys,girls;
	Font font = new Font("华文行楷",Font.BOLD,16);
	public HighGrade(){
		super("性别选项");
		setLayout(null);
	    this.setLocation(95,95);  
	    this.setDefaultCloseOperation(HIDE_ON_CLOSE);
	    
		boys = new JButton("我是男生");
		boys.setFont(font);
		boys.setBounds(30,25,140,40);
		
		girls = new JButton("我是女生");
		girls.setFont(font);
		girls.setBounds(30,90,140,40);
		
        add(boys);
		add(girls);
		boys.addActionListener(this);
		girls.addActionListener(this);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boys){
			BoysinHighGrade window = new BoysinHighGrade();
			window.setTitle("大三大四男生体测成绩计算");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
		if(e.getSource()==girls){
			GirlsinHighGrade window = new GirlsinHighGrade();
			window.setTitle("大三大四女生体测成绩计算");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
	}

}
