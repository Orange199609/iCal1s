package iCalculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calorie extends JFrame implements ActionListener{
	JLabel lamount,lresult;
	JTextField input,output;
	JButton cal;
	
	public Calorie(){//构造方法，设计界面
		setLayout(new FlowLayout());
		/*在构造方法中进行页面设计*/
		lamount = new JLabel("您的步数：");
		input = new JTextField(20);
		output = new JTextField(20);
		cal = new JButton("换算");
		lresult = new JLabel("卡路里");
		add(lamount);
		add(input);
		add(cal);
		add(output);
		add(lresult);
		cal.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){//所有按钮的action事件监听器
		if(e.getSource() == cal){
			int step = Integer.parseInt(input.getText());
			int calorie = step * 20;
			output.setText(String.valueOf(calorie));
		}
	}
}
