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
	JPanel pmain,pleft,pright,pinput,poutput;
	JLabel lamount,lresult,lblank;
	JTextField input,output;
	JButton cal;
	Font font = new Font("�����п�",Font.BOLD,16);
	
	public Calorie(){//���췽������ƽ���
		super("�������㿨·��");
		setLayout(new FlowLayout());
		setSize(400,300);
		
		/*�ڹ��췽���н���ҳ�����*/
		/*������*/
		pmain = new JPanel();
		pmain.setLayout(new GridLayout(1,2));
		add(pmain);
		
		/*�����������*/
		pleft = new JPanel();
		pleft.setLayout(new GridLayout(2,1));
		pmain.add(pleft);
		
		/*���㰴ť����*/
		pright = new JPanel();
		pright.setLayout(new FlowLayout());
		pmain.add(pright);
		
		pinput = new JPanel();
		pinput.setLayout(new GridLayout(1,2));
		pleft.add(pinput);
		lamount = new JLabel("���Ĳ�����");
		lamount.setFont(font);
		input = new JTextField(10);
		pinput.add(lamount);
		pinput.add(input);
		
		cal = new JButton("����");
		cal.setFont(font);
		cal.addActionListener(this);
		pright.add(cal);
		
		poutput = new JPanel();
		poutput.setLayout(new GridLayout(1,2));
		pleft.add(poutput);
		lresult = new JLabel("��·��");
		lresult.setFont(font);
		output = new JTextField(10);
		poutput.add(output);
		poutput.add(lresult);
	}
	
	public void actionPerformed(ActionEvent e){//���а�ť��action�¼�������
		if(e.getSource() == cal){
			int step = Integer.parseInt(input.getText());
			int calorie = step * 20;
			output.setText(String.valueOf(calorie));
		}
	}
}
