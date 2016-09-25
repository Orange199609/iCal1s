package iCalculator;

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

class CampusLife extends JFrame implements ActionListener{
	JPanel p1;
	JButton bc1,bc2,bc3,bc4;
	
	public CampusLife(){
		setLayout(new GridLayout(4,1));   //设置4*1的界面
		bc1 = new JButton("鞋码换算");
		bc2 = new JButton("绩点快速计算");
		bc3 = new JButton("步数换算卡路里");
		bc4 = new JButton("打车软件价格对比");
		add(bc1);
		add(bc2);
		add(bc3);
		add(bc4);
		bc1.addActionListener(this);
		bc2.addActionListener(this);
		bc3.addActionListener(this);
		bc4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == bc1){
			ShoeSizeConvertion window = new ShoeSizeConvertion();
			window.setTitle("鞋码换算");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
			window.setVisible(true);
	       }
		
		if(e.getSource() == bc2){
			GPACounting window = new GPACounting();
			window.setTitle("GPA快速计算");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
	   
		if(e.getSource() == bc3){
			Calorie window = new Calorie();
			window.setTitle("步数换算卡路里");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
		
		
       }
}
