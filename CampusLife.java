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
		setLayout(new GridLayout(4,1));   //����4*1�Ľ���
		bc1 = new JButton("Ь�뻻��");
		bc2 = new JButton("������ټ���");
		bc3 = new JButton("�������㿨·��");
		bc4 = new JButton("������۸�Ա�");
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
			window.setTitle("Ь�뻻��");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
			window.setVisible(true);
	       }
		
		if(e.getSource() == bc2){
			GPACounting window = new GPACounting();
			window.setTitle("GPA���ټ���");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
	   
		if(e.getSource() == bc3){
			Calorie window = new Calorie();
			window.setTitle("�������㿨·��");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
		
		
       }
}
