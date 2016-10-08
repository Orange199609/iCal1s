package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.nio.CharBuffer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.*;
import javax.swing.*;

import java.awt.event.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import java.io.*;

@SuppressWarnings("serial")
public class SubjectPrediction extends JFrame implements ActionListener{
	JButton Counting, Reference, Upload;
	JLabel  l[];
	JLabel Statement;
	JTextField text[];
	JPanel  p1,p2,p3;
	JPanel  p[];
	double  x[];
	Font font = new Font("�����п�",Font.BOLD,16);
	
	public SubjectPrediction(){
		super("�ҿƸ���Ԥ��");
		setLayout(null);
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(400,600);
		setLocation(50,50);
		/*��ť����*/
		Counting = new JButton("�������");
		Reference = new JButton("�ο�����");
		Upload = new JButton("�ϴ�����");
		Counting.addActionListener(this);
		Reference.addActionListener(this);
		Upload.addActionListener(this);
		Counting.setFont(font);
		Reference.setFont(font);
		Upload.setFont(font);
		Counting.setBounds(25,20,100,50);
		Reference.setBounds(150,20,100,50);
		Upload.setBounds(275,20,100,50);
		add(Counting);
		add(Reference);
		add(Upload);
		
		/*��������*/
		text = new JTextField[9];
		for(int j=0;j<9;j++){
			text[j] = new JTextField(12);
		}
		text[0].setBounds(205,90,185,22);
		text[1].setBounds(205,120,185,22);
		text[2].setBounds(205,150,185,22);
		text[3].setBounds(205,180,185,22);
		text[4].setBounds(205,210,185,22);
		text[5].setBounds(205,240,185,22);
		text[6].setBounds(205,270,185,22);
		text[7].setBounds(205,300,185,22);
		text[8].setBounds(205,330,185,22);
		
	    l = new JLabel[9];
		l[0] = new JLabel("��Ŀ����");
		l[1] = new JLabel("��ʦ����");
	    l[2] = new JLabel("�γ��Ѷȣ�0-10��");
		l[3] = new JLabel("��ʦ�Ʋ�������0-10��");
		l[4] = new JLabel("��������");
		l[5] = new JLabel("�Ҹ���ʦ��ϵ��������0-10��");
		l[6] = new JLabel("�ҵ���ֵ��0-10��");
		l[7] = new JLabel("�ҵ����˳̶ȣ�0-10��");
		l[8] = new JLabel("ͨ������");

		l[0].setBounds(10,90,185,22);
		l[1].setBounds(10,120,185,22);
		l[2].setBounds(10,150,185,22);
		l[3].setBounds(10,180,185,22);
		l[4].setBounds(10,210,185,22);
		l[5].setBounds(10,240,185,22);
		l[6].setBounds(10,270,185,22);
		l[7].setBounds(10,300,185,22);
		l[8].setBounds(10,330,185,22);
		
		for(int m=0;m<9;m++){
			l[m].setFont(font);
			add(l[m]);
			add(text[m]);
		}
		/*��������*/
		Statement = new JLabel("��Ԥ�⹦�����ս���Ȩ��iCal1s���У������ҿƣ�����Ը�������");
		Statement.setBounds(10,390,380,20);
		add(Statement);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==Counting){
			x = new double[7];
			for(int i=0;i<6;i++){
				x[i] = Double.parseDouble(text[i+2].getText());
			}
			x[6] = (10-x[0])*0.3/10 + x[1]*0.15/10 + x[3]*0.1/10 + x[4]*0.2/10 + x[5]*0.25/10;
			x[6] = x[6]-x[6]*0.1*(1-x[3]/10);
			text[8].setText(String.valueOf(x[6]));
		}
		if(e.getSource()==Reference | e.getSource()==Upload){
			JOptionPane.showMessageDialog(null, "�Բ��𣬸ù������ڿ����У������ڴ���");
		}
	}
	
}
