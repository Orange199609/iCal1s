package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPage extends JFrame implements ActionListener{
	JPanel p1;                            //新建一个面板
	JButton bc1,bc2,bc3;
	Box box1;
	Font font = new Font("华文行楷",0,12);
	public MainPage(){             //设计界面
		setLayout(new GridLayout(3,1));   //布局（3*1）
		bc1 = new JButton("基础计算");    
		bc2 = new JButton("校园生活");
		bc3 = new JButton("进阶酷炫");       //设置三个按钮
		add(bc1);
		add(bc2);
		add(bc3);                         //把按钮添加到面板上
		bc1.addActionListener(this);
		bc2.addActionListener(this);
		bc3.addActionListener(this);      //注册监听器
	}                              //构造主界面完成
	
	public void actionPerformed(ActionEvent e){  //所有按钮的action事件监听器
		if(e.getSource() == bc1){             //bbasic按钮被点击
			Basic window = new Basic();
			window.setTitle("基础计算");            //基础计算界面被创建
			window.setFont(font);
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);       //添加关闭按钮
			window.pack();
			window.setVisible(true);
		} 
		
		if(e.getSource() == bc2){             //bbasic按钮被点击
			CampusLife window = new CampusLife();
			window.setTitle("校园生活");           //校园生活界面被创建
			window.setFont(font);
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);       //添加关闭按钮
			window.pack();
			window.setVisible(true);
		} 
		

	}
	
	public static void main(String[] args){
		MainPage window = new MainPage();
		window.setSize(400,400);
		window.setTitle("iCal");
		window.setLocation(200,300);
		window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		window.pack();
		window.setVisible(true);
	}
	
	

}
