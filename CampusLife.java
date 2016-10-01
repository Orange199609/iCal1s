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
	JButton bc1,bc2,bc3,bc4,bc5;
	
	public CampusLife(){
		setLayout(new GridLayout(5,1));   //����5*1�Ľ���
		bc1 = new JButton("Ь�뻻��");
		bc2 = new JButton("������ټ���");
		bc3 = new JButton("�������㿨·��");
		bc4 = new JButton("������۸�Ա�");
		bc5 = new JButton("�����ɼ����ټ���");
		add(bc1);
		add(bc2);
		add(bc3);
		add(bc4);
		add(bc5);
		bc1.addActionListener(this);
		bc2.addActionListener(this);
		bc3.addActionListener(this);
		bc4.addActionListener(this);
		bc5.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == bc1){
			ShoeSizeConvertion window = new ShoeSizeConvertion();
			window.setTitle("Ь�뻻��");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
	       }
		
		if(e.getSource() == bc2){
			GPACounting window = new GPACounting();
			window.setTitle("GPA���ټ���");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
	   
		if(e.getSource() == bc3){
			Calorie window = new Calorie();
			window.setTitle("�������㿨·��");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
		
		if(e.getSource() == bc4){
			TaxiAppComparison window = new TaxiAppComparison();
			window.setTitle("�������۸�Ա�");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
		
		if(e.getSource() == bc5){
			PEGrading window = new PEGrading();
			window.setTitle("�����ɼ����ټ���");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
		
       }
}
