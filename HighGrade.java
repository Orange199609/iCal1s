package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HighGrade extends JFrame implements ActionListener{
	JButton boys,girls;
	Font font = new Font("�����п�",Font.BOLD,16);
	public HighGrade(){
		super("�Ա�ѡ��");
		setLayout(null);
	    this.setLocation(95,95);  
	    this.setDefaultCloseOperation(HIDE_ON_CLOSE);
	    
		boys = new JButton("��������");
		boys.setFont(font);
		boys.setBounds(30,25,140,40);
		
		girls = new JButton("����Ů��");
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
			window.setTitle("���������������ɼ�����");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
		if(e.getSource()==girls){
			GirlsinHighGrade window = new GirlsinHighGrade();
			window.setTitle("��������Ů�����ɼ�����");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
	}

}
