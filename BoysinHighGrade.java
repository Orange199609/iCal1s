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

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BoysinHighGrade extends JFrame implements ActionListener{
	
	JButton counting;
	JTextField textheight,textweight,textlungcontent,textfiftymeters1,textfiftymeters2,textsittingpush,textjump,textpullup,textthousandmeters1,textthousandmeters2,textmajor,texttotal,texttest,textskippingrope;
	JLabel labelheight1,labelheight2,labelweight1,labelweight2,labellungcontent1,labellungcontent2,labelfiftymeters1,labelfiftymeters2,labelsittingpush1,labelsittingpush2,labeljump1,labeljump2,labelpullup1,labelpullup2,labelthousandmeters1,labelthousandmeters2,labelthousandmeters3,labelmajor1,labelmajor2,labeltotal1,labeltotal2,labeltest1,labeltest2,labelskippingrope1,labelskippingrope2,labelblank;
	JPanel pmain,pleft,pright,pheight,pweight,plungcontent,pfiftymeters,psittingpush,pjump,ppullup,pthousandmeters,pmajor,ptotal,ptest,pskippingrope;
	double height,weight,lungcontent,fiftymeters1,fiftymeters2,sittingpush,jump,pullup,thousandmeters1,thousandmeters2,major,total,test;
    double BMIgrade,lungcontentgrade,fiftymetersgrade,sittingpushgrade,jumpgrade,pullupgrade,thousandmetersgrade,skippingropegrade,BMI;
    String s = new String("");
    
	public BoysinHighGrade(){
		super("���������������ɼ�����");
		setLayout(new FlowLayout());
		/*������*/
		pmain = new JPanel();
		pmain.setLayout(new GridLayout(1,2));
		add(pmain);
		
		/*�ɼ�����*/
		pleft = new JPanel();
		pleft.setLayout(new GridLayout(12,1));
		pmain.add(pleft);
		
		/*���㰴ť����*/
		pright = new JPanel();
		pright.setLayout(new FlowLayout());
		pmain.add(pright);
		
		/*����ɼ�*/
		/*���*/
		pheight = new JPanel();
		pheight.setLayout(new GridLayout(1,3));
		pleft.add(pheight);
		labelheight1 = new JLabel("���");
		textheight = new JTextField(10);
		labelheight2 = new JLabel("m");
		pheight.add(labelheight1);
		pheight.add(textheight);
		pheight.add(labelheight2);
		/*����*/
		pweight = new JPanel();
		pweight.setLayout(new GridLayout(1,3));
		pleft.add(pweight);
		labelweight1 = new JLabel("����");
		textweight = new JTextField(10);
		labelweight2 = new JLabel("kg");
		pweight.add(labelweight1);
		pweight.add(textweight);
		pweight.add(labelweight2);
		/*�λ���*/
		plungcontent = new JPanel();
		plungcontent.setLayout(new GridLayout(1,3));
		pleft.add(plungcontent);
		labellungcontent1 = new JLabel("�λ���");
		textlungcontent = new JTextField(10);
		labellungcontent2 = new JLabel("ml");
		plungcontent.add(labellungcontent1);
		plungcontent.add(textlungcontent);
		plungcontent.add(labellungcontent2);
		/*50��*/
		pfiftymeters = new JPanel();
		pfiftymeters.setLayout(new GridLayout(1,4));
		pleft.add(pfiftymeters);
		labelfiftymeters1 = new JLabel("50��");
		textfiftymeters1 = new JTextField(1);
		labelfiftymeters2 = new JLabel("��");
		textfiftymeters2 = new JTextField(1);
		labelblank = new JLabel("");
		pfiftymeters.add(labelfiftymeters1);
		pfiftymeters.add(textfiftymeters1);
		pfiftymeters.add(labelfiftymeters2);
		pfiftymeters.add(textfiftymeters2);
		pfiftymeters.add(labelblank);
		/*��λ��ǰ��*/
		psittingpush = new JPanel();
		psittingpush.setLayout(new GridLayout(1,3));
		pleft.add(psittingpush);
		labelsittingpush1 = new JLabel("��λ��ǰ��");
		textsittingpush = new JTextField(3);
		labelsittingpush2 = new JLabel("cm");
		psittingpush.add(labelsittingpush1);
		psittingpush.add(textsittingpush);
		psittingpush.add(labelsittingpush2);
		/*������Զ*/
		pjump = new JPanel();
		pjump.setLayout(new GridLayout(1,3));
		pleft.add(pjump);
		labeljump1 = new JLabel("������Զ");
		textjump = new JTextField(10);
		labeljump2 = new JLabel("cm");
		pjump.add(labeljump1);
		pjump.add(textjump);
		pjump.add(labeljump2);
		/*��������*/
		ppullup = new JPanel();
		ppullup.setLayout(new GridLayout(1,3));
		pleft.add(ppullup);
		labelpullup1 = new JLabel("��������");
		textpullup = new JTextField(10);
		labelpullup2 = new JLabel("��");
		ppullup.add(labelpullup1);
		ppullup.add(textpullup);
		ppullup.add(labelpullup2);
		/*1000��*/
		pthousandmeters = new JPanel();
		pthousandmeters.setLayout(new GridLayout(1,5));
		pleft.add(pthousandmeters);
		labelthousandmeters1 = new JLabel("1000��������");
		textthousandmeters1 = new JTextField(1);
		labelthousandmeters2 = new JLabel("��");
		textthousandmeters2 = new JTextField(1);
		labelthousandmeters3 = new JLabel("��");
		pthousandmeters.add(labelthousandmeters1);
		pthousandmeters.add(textthousandmeters1);
		pthousandmeters.add(labelthousandmeters2);
		pthousandmeters.add(textthousandmeters2);
		pthousandmeters.add(labelthousandmeters3);
		/*ר���*/
		pmajor = new JPanel();
		pmajor.setLayout(new GridLayout(1,3));
		pleft.add(pmajor);
		labelmajor1 = new JLabel("ר��ε÷�");
		textmajor = new JTextField(10);
		labelmajor2 = new JLabel("��");
		pmajor.add(labelmajor1);
		pmajor.add(textmajor);
		pmajor.add(labelmajor2);
		/*�����÷�*/
		pskippingrope = new JPanel();
		pskippingrope.setLayout(new GridLayout(1,3));
		pleft.add(pskippingrope);
		labelskippingrope1 = new JLabel("�����÷�");
		textskippingrope = new JTextField(10);
		labelskippingrope2 = new JLabel("��");
		pskippingrope.add(labelskippingrope1);
		pskippingrope.add(textskippingrope);
		pskippingrope.add(labelskippingrope2);
		/*���÷�*/
		ptest = new JPanel();
		ptest.setLayout(new GridLayout(1,3));
		pleft.add(ptest);
	    labeltest1 = new JLabel("���÷�");
	    texttest = new JTextField(10);
	    labeltest2 = new JLabel("��");
	    ptest.add(labeltest1);
	    ptest.add(texttest);
	    ptest.add(labeltest2);
		/*�ܷ�*/
		ptotal = new JPanel();
		ptotal.setLayout(new GridLayout(1,3));
		pleft.add(ptotal);
		labeltotal1 = new JLabel("�ܷ�");
		texttotal = new JTextField(10);
		labeltotal2 = new JLabel("��");
		ptotal.add(labeltotal1);
		ptotal.add(texttotal);
		ptotal.add(labeltotal2);
		/*�Ҳ಼��*/
		counting = new JButton("����÷�");
		counting.addActionListener(this);
		pright.add(counting);
		
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==counting){
			/*����BMI�÷�*/
			height = Double.parseDouble(textheight.getText());
			weight = Double.parseDouble(textweight.getText());
			BMI = weight/(height*height);
			if(BMI>=17.9 & BMI<=23.9) BMIgrade = 100;
			else if( (BMI<=17.8) | (BMI>=24.0&BMI<=27.9)) BMIgrade = 80;
			else if( BMI>=28.0 ) BMIgrade = 60;
			/*����λ����÷�*/
			lungcontent = Double.parseDouble(textlungcontent.getText());
			if(lungcontent>=5140) lungcontentgrade = 100;
			else if(lungcontent>=5020) lungcontentgrade = 95;
			else if(lungcontent>=4900) lungcontentgrade = 90;
			else if(lungcontent>=4650) lungcontentgrade = 85;
			else if(lungcontent>=4400) lungcontentgrade = 80;
			else if(lungcontent>=4280) lungcontentgrade = 78;
			else if(lungcontent>=4160) lungcontentgrade = 76;
			else if(lungcontent>=4040) lungcontentgrade = 74;
			else if(lungcontent>=3920) lungcontentgrade = 72;
			else if(lungcontent>=3800) lungcontentgrade = 70;
			else if(lungcontent>=3680) lungcontentgrade = 68;
			else if(lungcontent>=3560) lungcontentgrade = 66;
			else if(lungcontent>=3440) lungcontentgrade = 64;
			else if(lungcontent>=3320) lungcontentgrade = 62;
			else if(lungcontent>=3200) lungcontentgrade = 60;
			else if(lungcontent>=3030) lungcontentgrade = 50;
			else if(lungcontent>=2860) lungcontentgrade = 40;
			else if(lungcontent>=2690) lungcontentgrade = 30;
			else if(lungcontent>=2520) lungcontentgrade = 20;
			else if(lungcontent>=2350) lungcontentgrade = 10;
			else lungcontentgrade = 0;
			/*����50�׵÷�*/
			fiftymeters1 = Double.parseDouble(textfiftymeters1.getText());
			fiftymeters2 = Double.parseDouble(textfiftymeters2.getText());
			if(fiftymeters1<=5) fiftymetersgrade = 100;
			else if(fiftymeters1 == 6){
				if(fiftymeters2<=6) fiftymetersgrade = 100;
				else if(fiftymeters2 == 7) fiftymetersgrade = 95;
				else if(fiftymeters2 == 8) fiftymetersgrade = 90;
				else if(fiftymeters2 == 9) fiftymetersgrade = 85;
			}else if(fiftymeters1 == 7){
				if(fiftymeters2 == 0) fiftymetersgrade = 80;
				else if(fiftymeters2 <= 2) fiftymetersgrade = 78;
				else if(fiftymeters2 <= 4) fiftymetersgrade = 76;
				else if(fiftymeters2 <= 6) fiftymetersgrade = 74;
				else if(fiftymeters2 <= 8) fiftymetersgrade = 72;
			}else if(fiftymeters1 == 8){
				if(fiftymeters2 == 0) fiftymetersgrade = 70;
				else if(fiftymeters2 <= 2) fiftymetersgrade = 68;
				else if(fiftymeters2 <= 4) fiftymetersgrade = 66;
				else if(fiftymeters2 <= 6) fiftymetersgrade = 64;
				else if(fiftymeters2 <= 8) fiftymetersgrade = 62;
			}else if(fiftymeters1 == 9){
				if(fiftymeters2 == 0) fiftymetersgrade = 60;
				else if(fiftymeters2 <= 2) fiftymetersgrade = 50;
				else if(fiftymeters2 <= 4) fiftymetersgrade = 40;
				else if(fiftymeters2 <= 6) fiftymetersgrade = 30;
				else if(fiftymeters2 <= 8) fiftymetersgrade = 20;
			}else if(fiftymeters1 == 10){
				
				if(fiftymeters2 == 0) fiftymetersgrade = 10;
				else fiftymetersgrade = 0;
			}else fiftymetersgrade = 0;
			/*��λ��ǰ���÷ּ���*/
			sittingpush = Double.parseDouble(textsittingpush.getText());
			if(sittingpush >= 25.1) sittingpushgrade = 100;
			else if(sittingpush >= 23.3) sittingpushgrade = 95;
			else if(sittingpush >= 21.5) sittingpushgrade = 90;
			else if(sittingpush >= 19.9) sittingpushgrade = 85;
			else if(sittingpush >= 18.2) sittingpushgrade = 80;
			else if(sittingpush >= 16.8) sittingpushgrade = 78;
			else if(sittingpush >= 15.4) sittingpushgrade = 76;
			else if(sittingpush >= 14.0) sittingpushgrade = 74;
			else if(sittingpush >= 12.6) sittingpushgrade = 72;
			else if(sittingpush >= 11.2) sittingpushgrade = 70;
			else if(sittingpush >= 9.8)  sittingpushgrade = 68;
			else if(sittingpush >= 8.4)  sittingpushgrade = 66;
			else if(sittingpush >= 7.0)  sittingpushgrade = 64;
			else if(sittingpush >= 5.6)  sittingpushgrade = 62;
			else if(sittingpush >= 4.2)  sittingpushgrade = 60;
			else if(sittingpush >= 3.2)  sittingpushgrade = 50;
			else if(sittingpush >= 2.2)  sittingpushgrade = 40;
			else if(sittingpush >= 1.2)  sittingpushgrade = 30;
			else if(sittingpush >= 0.2) sittingpushgrade = 20;
			else if(sittingpush >= -0.8) sittingpushgrade = 10;
			else sittingpushgrade = 0;
			/*������Զ�÷�*/
			jump = Double.parseDouble(textjump.getText());
			if(jump >= 275) jumpgrade = 100;
			else if(jump >= 270) jumpgrade = 95;
			else if(jump >= 265) jumpgrade = 90;
			else if(jump >= 258) jumpgrade = 85;
			else if(jump >= 250) jumpgrade = 80;
			else if(jump >= 246) jumpgrade = 78;
			else if(jump >= 242) jumpgrade = 76;
			else if(jump >= 238) jumpgrade = 74;
			else if(jump >= 234) jumpgrade = 72;
			else if(jump >= 230) jumpgrade = 70;
			else if(jump >= 226) jumpgrade = 68;
			else if(jump >= 222) jumpgrade = 66;
			else if(jump >= 218) jumpgrade = 64;
			else if(jump >= 214) jumpgrade = 62;
			else if(jump >= 210) jumpgrade = 60;
			else if(jump >= 205) jumpgrade = 50;
			else if(jump >= 200) jumpgrade = 40;
			else if(jump >= 195) jumpgrade = 30;
			else if(jump >= 190) jumpgrade = 20;
			else if(jump >= 185) jumpgrade = 10;
			else jumpgrade = 0;
			/*�����������ϵ÷�*/
			pullup = Double.parseDouble(textpullup.getText());
			if(pullup >= 20) pullupgrade = 100;
			else if(pullup == 19) pullupgrade = 95;
			else if(pullup == 18) pullupgrade = 90;
			else if(pullup == 17) pullupgrade = 85;
			else if(pullup == 16) pullupgrade = 80;
			else if(pullup == 15) pullupgrade = 76;
			else if(pullup == 14) pullupgrade = 72;
			else if(pullup == 13) pullupgrade = 68;
			else if(pullup == 12) pullupgrade = 64;
			else if(pullup == 11) pullupgrade = 60;
			else if(pullup == 10) pullupgrade = 50;
			else if(pullup == 9) pullupgrade = 40;
			else if(pullup == 8) pullupgrade = 30;
			else if(pullup == 7) pullupgrade = 20;
			else if(pullup == 6) pullupgrade = 10;
			else pullupgrade = 0;
			/*����1000�׵÷�*/
			thousandmeters1 = Double.parseDouble(textthousandmeters1.getText());
			thousandmeters2 = Double.parseDouble(textthousandmeters2.getText());
			if(thousandmeters1<=2) thousandmetersgrade = 100;
			else if(thousandmeters1 == 3){
				if(thousandmeters2 <= 15) thousandmetersgrade = 100;
				else if(thousandmeters2 <= 20) thousandmetersgrade = 95;
				else if(thousandmeters2 <= 25) thousandmetersgrade = 90;
				else if(thousandmeters2 <= 32) thousandmetersgrade = 85;
				else if(thousandmeters2 <= 40) thousandmetersgrade = 80;
				else if(thousandmeters2 <= 45) thousandmetersgrade = 78;
				else if(thousandmeters2 <= 50) thousandmetersgrade = 76;
				else if(thousandmeters2 <= 55) thousandmetersgrade = 74;
				else thousandmetersgrade = 72;
			}else if(thousandmeters1 == 4){
				if(thousandmeters2 <= 0) thousandmetersgrade = 72;
				else if(thousandmeters2 <= 5) thousandmetersgrade = 70;
				else if(thousandmeters2 <= 10) thousandmetersgrade = 68;
				else if(thousandmeters2 <= 15) thousandmetersgrade = 66;
				else if(thousandmeters2 <= 20) thousandmetersgrade = 64;
				else if(thousandmeters2 <= 25) thousandmetersgrade = 62;
				else if(thousandmeters2 <= 30) thousandmetersgrade = 60;
				else if(thousandmeters2 <= 50) thousandmetersgrade = 50;
				else thousandmetersgrade = 40;
 			}else if(thousandmeters1 == 5){
				if(thousandmeters2 <= 10) thousandmetersgrade = 40;
				else if(thousandmeters2 <= 30) thousandmetersgrade = 30;
				else if(thousandmeters2 <= 50) thousandmetersgrade = 20;
				else thousandmetersgrade = 10;
			}else if(thousandmeters1 == 6){
				if(thousandmeters2 <= 10) thousandmetersgrade = 10;
				else thousandmetersgrade = 0;
			}else thousandmetersgrade = 0;
			/*��������ܷ�*/
			test = 0.15*BMIgrade + 0.15*lungcontentgrade + 0.2*fiftymetersgrade + 0.1*sittingpushgrade + 0.1*jumpgrade + 0.1*pullupgrade + 0.2*thousandmetersgrade;
			texttest.setText(String.valueOf(test));
			/*�����ܷ�*/
			total = test*0.5 + Double.parseDouble(textmajor.getText())*0.4 + Double.parseDouble(textskippingrope.getText())*0.1;
			texttotal.setText(new java.text.DecimalFormat("#.00").format(total));
		}
	}

}
