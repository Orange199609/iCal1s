package iCalculator;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class MainPage extends JFrame implements ActionListener{
	JPanel p1;                            //�½�һ�����
	JButton bc1,bc2,bc3;
	Font font = new Font("�����п�",Font.BOLD,21);
	JLabel ltitle,lver;
	
	public MainPage(){             //��ƽ���
		super("iCal1s");
	    setLocation(32, 32);  
	    setSize(254,350);  
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setResizable(false);
	    show();
		setLayout(null);   //�޲���
		
		//--------ʵ�������пؼ�---------
		ltitle = new JLabel("iCal1s",JLabel.CENTER);
		ltitle.setFont(new Font("�����п�",Font.BOLD, 24));
		ltitle.setBounds(0,0,254,62);
		
		bc1 =new JButton("��������");
        bc1.setIcon(new ImageIcon("D://iCalͼ��/������.png"));
		bc1.setForeground(Color.black); 
		bc1.setFont(font);
		bc1.addActionListener(this);
		bc1.setBounds(42,62,170,62);
		
		bc2 =new JButton("У԰����");
        bc2.setIcon(new ImageIcon("D://iCalͼ��/У԰.png"));
		bc2.setForeground(Color.black); 
		bc2.setFont(font);
		bc2.addActionListener(this);
		bc2.setBounds(42,134,170,62);
		
		bc3 =new JButton("�ҿ�Ԥ��");
        bc3.setIcon(new ImageIcon("D://iCalͼ��/�ҿ�.png"));
		bc3.setForeground(Color.black); 
		bc3.setFont(font);
		bc3.addActionListener(this);
		bc3.setBounds(42,206,170,62);
		
		lver = new JLabel("�汾��:20161009.1",JLabel.CENTER);
		lver.setFont(new Font("����",Font.BOLD, 12));
		lver.setBounds(42,280,170,62);
		//---------------------------------------------------------
		
		add(ltitle);
		add(bc1);
		add(bc2);
		add(bc3);
		add(lver);
	}                              //�������������
	
	public void actionPerformed(ActionEvent e){  //���а�ť��action�¼�������
		if(e.getSource() == bc1){             //bc1��ť�����
			Basic window = new Basic();
			window.setTitle("��������");            //����������汻����
			window.setFont(font);
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);       //��ӹرհ�ť
			window.pack();
			window.setVisible(true);
			window.setResizable(false);
			
		} 
		
		if(e.getSource() == bc2){             //bc2��ť�����
			CampusLife window = new CampusLife();
			window.setTitle("У԰����");           //У԰������汻����
			window.setFont(font);
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);       //��ӹرհ�ť
			window.pack();
			window.setSize(254,350);
			window.setVisible(true);
			window.setResizable(false);
		} 
		
		if(e.getSource() == bc3){
		    SubjectPrediction window = new SubjectPrediction();
		    window.setTitle("�ҿ�Ԥ��");           //�ҿ�Ԥ����汻����
			window.setFont(font);
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);       //��ӹرհ�ť
			window.pack();
			window.setSize(400,450);
			window.setVisible(true);
			window.setResizable(false);
		}
	}
	
	public static void main(String[] args){
	    try {  
	          // select Look and Feel  
	          UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");  
	          // start application  
	          new MainPage();  
	    }  
	    catch (Exception ex) {  
	          ex.printStackTrace();  
	    }  
	}
	
	

}