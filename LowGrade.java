package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LowGrade extends JFrame implements ActionListener{

	JButton boys,girls;
	JPanel  p1;
	public LowGrade(){
		super("性别选项");
		setLayout(new FlowLayout());
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1));
		add(p1);
		boys = new JButton("我是男生");
		girls = new JButton("我是女生");
		p1.add(boys);
		p1.add(girls);
		boys.addActionListener(this);
		girls.addActionListener(this);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boys){
			BoysinLowGrade window = new BoysinLowGrade();
			window.setTitle("大一大二男生体测成绩计算");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
		if(e.getSource()==girls){
			GirlsinLowGrade window = new GirlsinLowGrade();
			window.setTitle("大一大二女生体测成绩计算");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
	}
}
