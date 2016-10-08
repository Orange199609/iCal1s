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

import java.util.Date; 
import java.util.Calendar; 

public class TaxiAppComparison extends JFrame implements ActionListener{
	
     JButton Counting = new JButton("����۸�");    //����۸�ť
     JPanel  p1,p2,p3,p4,p5,p6;                  //����6�����
     JTextField text1,text2,text3,text4;         //����4���ı���
     JLabel  label1,label2,label3,label4;        //����3����ǩ
     double  distance;                           //��¼Ŀ�ĵ��������֮��ľ���
     double  messlevel;                          //��¼·��ӵ�µȼ�
     double  money1,money2;                      //��¼���ִ�����ļ۸�
     double  waitingminutes;
     double  basicminutes;
     String  total1 = new String("");
     String  total2 = new String("");
     Calendar c = Calendar.getInstance();
     int hour = c.get(Calendar.HOUR_OF_DAY);
     Font font = new Font("�����п�",Font.BOLD,16);
     
     public TaxiAppComparison(){
    	 
    	 /*��������*/
    	 super("��������ٱȼ�");
 		 setLayout(new GridLayout(1,2));
 		 
 		 p1 = new JPanel();
 		 p1.setLayout(new GridLayout(4,1));
 		 add(p1);
 		 
 		 p2 = new JPanel();
 		 p2.setLayout(new FlowLayout());
 		 add(p2);
 		 
 		 p3 = new JPanel();
 		 p3.setLayout(new GridLayout(1,2));
 		 p1.add(p3);
 		 
 		 label1 = new JLabel("������/km");
 		 label1.setFont(font);
 		 p3.add(label1);
 		 text1 = new JTextField(12);
 		 p3.add(text1);
 		 
 		 p4 = new JPanel();
		 p4.setLayout(new GridLayout(1,2));
		 p1.add(p4);
		 label2 = new JLabel("Ԥ��ӵ��ָ��(0-10)");
		 label2.setFont(font);
		 p4.add(label2);
		 text2 = new JTextField(12);
		 p4.add(text2);
		 
		 p5 = new JPanel();
 		 p5.setLayout(new GridLayout(1,2));
 		 p1.add(p5);
 		 label3 = new JLabel("UberԤ�Ƽ۸�");
 		 label3.setFont(font);
 		 p5.add(label3);
 		 text3 = new JTextField(12);
 		 p5.add(text3);
 		 
 		 p6 = new JPanel();
		 p6.setLayout(new GridLayout(1,2));
		 p1.add(p6);
		 label4 = new JLabel("�ε�Ԥ�Ƽ۸�");
		 label4.setFont(font);
		 p6.add(label4);
		 text4 = new JTextField(12);
		 p6.add(text4);
		 
		 
		 Counting.addActionListener(this);
		 Counting.setFont(font);
		 p2.add(Counting);
		 this.setVisible(true);
     }
     
  public void actionPerformed(ActionEvent e){
    	 
    	 if(e.getSource()==Counting){
    		 distance = Double.parseDouble(text1.getText());
    		 messlevel = Double.parseDouble(text2.getText()); 
    		 basicminutes = (double)(distance/30)*60;
    		 waitingminutes = basicminutes + messlevel*6;
    		 money1 = 2.4*distance + 0.3*waitingminutes;
    		 if(distance>=12){
    			 money1 += 1*(distance-12);
    		 }
    		 if(((hour>=23)&(hour<=24))|((hour>=0)&(hour<=5))) 
    			 money1 += distance*0.5;
    		 }
    	     if(money1<13){
    			 money1 = 13;
    		 }
    	     
    		 money2 = 2.17*distance + 0.3*waitingminutes;
    		 if(hour>=7&hour<=9){
    			 money2 = 1.8*money2;
    		 }
    		 if(hour>=11&hour<=13){
    			 money2 = 1.5*money2;
    		 }
    		 if(hour>=17&hour<=20){
    			 money2 = 2.1*money2;
    		 }
    		 if(money2<15){
    			 money2 = 15;
    		 }
    		 total1 = String.valueOf(new java.text.DecimalFormat("#.00").format(money1));
    		 total2 = String.valueOf(new java.text.DecimalFormat("#.00").format(money2));
    		 text3.setText(total2);
    		 text4.setText(total1);
    	 }
     }

   