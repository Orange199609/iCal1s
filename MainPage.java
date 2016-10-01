package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPage extends JFrame implements ActionListener{
	JPanel p1;                            //�½�һ�����
	JButton bc1,bc2,bc3;
	Box box1;
	Font font = new Font("�����п�",0,12);
	public MainPage(){             //��ƽ���
		setLayout(new GridLayout(3,1));   //���֣�3*1��
		bc1 = new JButton("��������");    
		bc2 = new JButton("У԰����");
		bc3 = new JButton("���׿���");       //����������ť
		add(bc1);
		add(bc2);
		add(bc3);                         //�Ѱ�ť��ӵ������
		bc1.addActionListener(this);
		bc2.addActionListener(this);
		bc3.addActionListener(this);      //ע�������
	}                              //�������������
	
	public void actionPerformed(ActionEvent e){  //���а�ť��action�¼�������
		if(e.getSource() == bc1){             //bbasic��ť�����
			Basic window = new Basic();
			window.setTitle("��������");            //����������汻����
			window.setFont(font);
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);       //��ӹرհ�ť
			window.pack();
			window.setVisible(true);
		} 
		
		if(e.getSource() == bc2){             //bbasic��ť�����
			CampusLife window = new CampusLife();
			window.setTitle("У԰����");           //У԰������汻����
			window.setFont(font);
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);       //��ӹرհ�ť
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
