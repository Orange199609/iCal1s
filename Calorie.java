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
	
	public Calorie(){//���췽������ƽ���
		setLayout(new FlowLayout());
		/*�ڹ��췽���н���ҳ�����*/
		lamount = new JLabel("���Ĳ�����");
		input = new JTextField(20);
		output = new JTextField(20);
		cal = new JButton("����");
		lresult = new JLabel("��·��");
		add(lamount);
		add(input);
		add(cal);
		add(output);
		add(lresult);
		cal.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){//���а�ť��action�¼�������
		if(e.getSource() == cal){
			int step = Integer.parseInt(input.getText());
			int calorie = step * 20;
			output.setText(String.valueOf(calorie));
		}
	}
}
