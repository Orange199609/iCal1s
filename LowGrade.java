package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LowGrade extends JFrame implements ActionListener{

	JButton boys,girls;
	JPanel  p1;
	public LowGrade(){
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
			BoysinLowGrade window = new BoysinLowGrade();
			window.setTitle("��һ����������ɼ�����");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
		if(e.getSource()==girls){
			GirlsinLowGrade window = new GirlsinLowGrade();
			window.setTitle("��һ���Ů�����ɼ�����");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
	}
}
