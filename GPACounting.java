package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
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

import java.text.DecimalFormat;  


public class GPACounting extends JFrame implements ActionListener{
      
	JPanel p0,p1,p2,p3;                                                          //p0����壬p1�γ���塣p2��ť���
	JPanel[] panel = new JPanel[100];                                         //panel�������ڷ��óɼ������ı���
	JButton adding,conversing,input,output;                                   //������ӡ�ת�������롢�������ܰ�ť
	JLabel  Label1,Label2,Label3,Label4;
	JTextField TotalGPA;
	JTextArea[]  myarea = new JTextArea[100];
	JTextField[] text = new JTextField[200];
	double[] Credit = new double[100];
	double[] Grading = new double[100];                                             //������������
	double[]  GPA = new double[100];                                          //����GPA����
	int    coursenumber = 1;                                                  //��¼�γ�����
	double    gradesum = 0;
	double    creditsum = 0;
	double    gpasum = 0;
	double    FinalGPA = 0;
	String[] course = new String[100];
	String[] credit = new String[100];
	String[] grade  = new String[100];
	DecimalFormat df = new DecimalFormat("######0.00");   
	
	public GPACounting(){
		
		/*�����������岼��*/
		super("������ټ���");
		setLayout(new FlowLayout());
		
		/*�������*/
		p0 = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		panel[0] = new JPanel();
		panel[1] = new JPanel();
		p0.setLayout(new GridLayout(1,3));
		p1.setLayout(new GridLayout(101,3));
		p2.setLayout(new FlowLayout());
		p3.setLayout(new FlowLayout());
		panel[0].setLayout(new GridLayout(1,3));
		panel[1].setLayout(new GridLayout(1,3));
		
		/*�����ı���ͱ�ǩ*/
		myarea[0] = new JTextArea(1,4);
		text[0] = new JTextField(4);
		text[1] = new JTextField(4);
		TotalGPA = new JTextField(8);
		Label1 = new JLabel("�γ�����");
		Label2 = new JLabel("�γ�ѧ��");
		Label3 = new JLabel("�γ̳ɼ�");
		Label4 = new JLabel("���GPAΪ");
	
		/*������ť*/
		adding = new JButton("��ӿγ�");
		conversing = new JButton("���㼨��");
		input = new JButton("��������");
		output = new JButton("��������");
		adding.addActionListener(this);
		conversing.addActionListener(this);
		input.addActionListener(this);
		output.addActionListener(this);
		this.setVisible(true);
		
		/*����ҳ��*/
		add(p0);
		p0.add(p1);
		p0.add(p2);
		p0.add(p3);
		p1.add(panel[0]);
		p1.add(panel[1]);
		p2.add(adding);
		p2.add(conversing);
		p2.add(input);
		p2.add(output);
		p3.add(Label4);
		p3.add(TotalGPA);
		panel[0].add(Label1);
		panel[0].add(Label2);
		panel[0].add(Label3);
		panel[1].add(myarea[0]);
		panel[1].add(text[0]);
		panel[1].add(text[1]);
	}
	
	public void actionPerformed(ActionEvent e){
		
			if(e.getSource()==adding){
				panel[coursenumber+1] = new JPanel();
				panel[coursenumber+1].setLayout(new GridLayout(1,3));
				p1.add(panel[coursenumber+1]);
				myarea[coursenumber+1] = new JTextArea(1,4);
				text[2*coursenumber] = new JTextField(4);
				text[2*coursenumber+1] = new JTextField(4);
				panel[coursenumber+1].add(myarea[coursenumber+1]);
				panel[coursenumber+1].add(text[2*coursenumber]);
				panel[coursenumber+1].add(text[2*coursenumber+1]);
				setVisible(true);
				coursenumber++;
			}
			
			
			if(e.getSource()==conversing){
				
				for(int i=1;i<coursenumber;i++){
					credit[i-1] = text[2*(i-1)].getText();
					grade[i-1] = text[2*i-1].getText();
					Credit[i-1] = Double.parseDouble(credit[i-1]);
					Grading[i-1] = Double.parseDouble(grade[i-1]);
				}
				
				for(int j=0;j<(coursenumber-1);j++){
					if(Grading[j]>=90){
						GPA[j]=4.0;
						}else if(Grading[j]<90&&Grading[j]>=85){
							GPA[j]=3.7;
						}else if(Grading[j]<85&&Grading[j]>=82){
							GPA[j]=3.3;
						}else if(Grading[j]<82&&Grading[j]>=78){
							GPA[j]=3.0;
						}else if(Grading[j]<78&&Grading[j]>=75){
							GPA[j]=2.7;
						}else if(Grading[j]<75&&Grading[j]>=72){
							GPA[j]=2.3;
						}else if(Grading[j]<72&&Grading[j]>=68){
							GPA[j]=2.0;
						}else if(Grading[j]<68&&Grading[j]>=64){
							GPA[j]=1.7;
						}else if(Grading[j]<64&&Grading[j]>=60){
							GPA[j]=1.0;
						}else{
							GPA[j]=0;
						}
					creditsum += Credit[j];
					gpasum += Credit[j]*GPA[j];
				}
				
				FinalGPA = gpasum / creditsum ;
				
				TotalGPA.setText(String.valueOf(new java.text.DecimalFormat("#.00").format(FinalGPA)));
		}
	}
}
