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
	Font font = new Font("华文行楷",Font.BOLD,16);
	
	public Calorie(){//构造方法，设计界面
		super("步数换算卡路里");
		setLayout(new FlowLayout());
		setSize(400,300);
		
		/*在构造方法中进行页面设计*/
		/*主界面*/
		pmain = new JPanel();
		pmain.setLayout(new GridLayout(1,2));
		add(pmain);
		
		/*输入输出界面*/
		pleft = new JPanel();
		pleft.setLayout(new GridLayout(2,1));
		pmain.add(pleft);
		
		/*计算按钮界面*/
		pright = new JPanel();
		pright.setLayout(new FlowLayout());
		pmain.add(pright);
		
		pinput = new JPanel();
		pinput.setLayout(new GridLayout(1,2));
		pleft.add(pinput);
		lamount = new JLabel("您的步数：");
		lamount.setFont(font);
		input = new JTextField(10);
		pinput.add(lamount);
		pinput.add(input);
		
		cal = new JButton("换算");
		cal.setFont(font);
		cal.addActionListener(this);
		pright.add(cal);
		
		poutput = new JPanel();
		poutput.setLayout(new GridLayout(1,2));
		pleft.add(poutput);
		lresult = new JLabel("卡路里");
		lresult.setFont(font);
		output = new JTextField(10);
		poutput.add(output);
		poutput.add(lresult);
	}
	
	public void actionPerformed(ActionEvent e){//所有按钮的action事件监听器
		if(e.getSource() == cal){
			int step = Integer.parseInt(input.getText());
			int calorie = step * 20;
			output.setText(String.valueOf(calorie));
		}
	}
}
