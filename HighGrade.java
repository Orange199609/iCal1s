package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HighGrade extends JFrame implements ActionListener{
	
	JButton boys,girls;
	JPanel  p1;
	public HighGrade(){
		super("�Ա�ѡ��");
		setLayout(new FlowLayout());
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1));
		add(p1);
		boys = new JButton("��������");
		girls = new JButton("����Ů��");
		p1.add(boys);
		p1.add(girls);
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
