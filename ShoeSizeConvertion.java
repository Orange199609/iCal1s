package iCalculator;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
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

public class ShoeSizeConvertion extends JFrame implements ActionListener{
	JPanel   p1,p2,p3,p4,p5,p6;                 //划出三个面板
	JButton  bcoversing,bpoint,bbackspace;        //确定两个按钮
	JButton[]  b = new JButton[10];    //建立JButton数组'
	JTextField text1,text2,text3;            //建立两个文本框
	JLabel   Label1,Label2,Label3;     //建立三个标签
	double   x;
	double   y;                        //记录输入的数据
	String s = new String("");
	String c = new String("");
	Font font = new Font("华文行楷",Font.BOLD,16);
	
	public ShoeSizeConvertion(){
		super("鞋码换算");
		setLayout(new FlowLayout());       //整体页面流式布局
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p1.setLayout(new GridLayout(3,1));
		p2.setLayout(new GridLayout(4,3));
		p3.setLayout(new FlowLayout());
		p4.setLayout(new GridLayout(1,2));
		p5.setLayout(new GridLayout(1,2));
		p6.setLayout(new GridLayout(1,2));
		
		text1 = new JTextField(12);
		text1.setFont(font);
		
		text2 = new JTextField(12);
		text2.setFont(font);
		
		text3 = new JTextField(12);
		text3.setFont(font);
		
		bcoversing = new JButton("转换");
		bcoversing.setFont(font);
		
		bpoint = new JButton(".");
		bpoint.setFont(font);
		
		bbackspace = new JButton("退格");
		bbackspace.setFont(font);
		
		Label1 = new JLabel("脚长/cm");
		Label1.setFont(font);
		
		Label2 = new JLabel("对应男士欧码");
		Label2.setFont(font);
		
		Label3 = new JLabel("对应女士欧码");
		Label3.setFont(font);
		
		this.setVisible(true);
		
		/*设置p1 panel*/
		p1.add(p4);
		p1.add(p5);
		p1.add(p6);
		p4.add(Label1);
		p4.add(text1);
		p5.add(Label2);
		p5.add(text2);
		p6.add(Label3);
		p6.add(text3);
		
		
		/*设置p2 panel*/
		for(int i=0;i<=8;i++){
			b[i] = new JButton(Integer.toString(i+1));
			b[i].setFont(font);
			p2.add(b[i]);
			b[i].addActionListener(this);
		}
		b[9] = new JButton("0");
		b[9].setFont(font);
		p2.add(b[9]);
		b[9].addActionListener(this);
		p2.add(bpoint);
		bbackspace = new JButton("退格");
		bbackspace.setFont(font);
		p2.add(bbackspace);
		bbackspace.addActionListener(this);
		bpoint.addActionListener(this);
		
		/*设置p3 panel*/
		p3.add(bcoversing);
		bcoversing.addActionListener(this);
		
		add(p1);
		add(p2);
		add(p3);
	}
	
	public void actionPerformed(ActionEvent e){
		
		for(int i=0;i<=9;i++){
		      if(e.getSource()== b[i] ||  e.getSource()== bpoint){ //判断按下的是否为数字按钮或小数点按钮
		      s = s+e.getActionCommand();                             
		      text1.setText(s);
		      break;
			 }
			}
		
		if(e.getSource()==bbackspace){
			text1.setText("");
			s="";
		}
		
		if(e.getSource()==bcoversing){
			x = Double.parseDouble(s);
			y = Double.parseDouble(s);
			x = (int)(2*x - 10);
			y = (int)(2*y - 9);
		    s = String.valueOf(x);
		    text2.setText(s);
		    c = String.valueOf(y);
		    text3.setText(c);
		 }
		
	}
}
