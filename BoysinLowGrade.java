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

public class BoysinLowGrade extends JFrame implements ActionListener{
	
	JButton counting;
	JTextField textheight,textweight,textlungcontent,textfiftymeters1,textfiftymeters2,textsittingpush,textjump,textpullup,textthousandmeters1,textthousandmeters2,textmajor,texttotal,texttest,textskippingrope;
	JLabel labelheight1,labelheight2,labelweight1,labelweight2,labellungcontent1,labellungcontent2,labelfiftymeters1,labelfiftymeters2,labelsittingpush1,labelsittingpush2,labeljump1,labeljump2,labelpullup1,labelpullup2,labelthousandmeters1,labelthousandmeters2,labelthousandmeters3,labelmajor1,labelmajor2,labeltotal1,labeltotal2,labeltest1,labeltest2,labelskippingrope1,labelskippingrope2,labelblank;
	JPanel pmain,pleft,pright,pheight,pweight,plungcontent,pfiftymeters,psittingpush,pjump,ppullup,pthousandmeters,pmajor,ptotal,ptest,pskippingrope;
	double height,weight,lungcontent,fiftymeters1,fiftymeters2,sittingpush,jump,pullup,thousandmeters1,thousandmeters2,major,total,test;
    double BMIgrade,lungcontentgrade,fiftymetersgrade,sittingpushgrade,jumpgrade,pullupgrade,thousandmetersgrade,skippingropegrade,BMI;
    String s = new String("");
    Font font = new Font("华文行楷",Font.BOLD,16);
    
	public BoysinLowGrade(){
		super("大一大二男生体测成绩计算");
		setLayout(new FlowLayout());
		/*主界面*/
		pmain = new JPanel();
		pmain.setLayout(new GridLayout(1,2));
		add(pmain);
		
		/*成绩界面*/
		pleft = new JPanel();
		pleft.setLayout(new GridLayout(12,1));
		pmain.add(pleft);
		
		/*计算按钮界面*/
		pright = new JPanel();
		pright.setLayout(new FlowLayout());
		pmain.add(pright);
		
		/*分项成绩*/
		/*身高*/
		pheight = new JPanel();
		pheight.setLayout(new GridLayout(1,3));
		pleft.add(pheight);
		labelheight1 = new JLabel("身高");
		labelheight1.setFont(font);
		textheight = new JTextField(10);
		labelheight2 = new JLabel("m");
		labelheight2.setFont(font);
		pheight.add(labelheight1);
		pheight.add(textheight);
		pheight.add(labelheight2);
		/*体重*/
		pweight = new JPanel();
		pweight.setLayout(new GridLayout(1,3));
		pleft.add(pweight);
		labelweight1 = new JLabel("体重");
		labelweight1.setFont(font);
		textweight = new JTextField(10);
		labelweight2 = new JLabel("kg");
		labelweight2.setFont(font);
		pweight.add(labelweight1);
		pweight.add(textweight);
		pweight.add(labelweight2);
		/*肺活量*/
		plungcontent = new JPanel();
		plungcontent.setLayout(new GridLayout(1,3));
		pleft.add(plungcontent);
		labellungcontent1 = new JLabel("肺活量");
		labellungcontent1.setFont(font);
		textlungcontent = new JTextField(10);
		labellungcontent2 = new JLabel("ml");
		labellungcontent2.setFont(font);
		plungcontent.add(labellungcontent1);
		plungcontent.add(textlungcontent);
		plungcontent.add(labellungcontent2);
		/*50米*/
		pfiftymeters = new JPanel();
		pfiftymeters.setLayout(new GridLayout(1,4));
		pleft.add(pfiftymeters);
		labelfiftymeters1 = new JLabel("50米");
		labelfiftymeters1.setFont(font);
		textfiftymeters1 = new JTextField(1);
		labelfiftymeters2 = new JLabel("秒");
		labelfiftymeters2.setFont(font);
		textfiftymeters2 = new JTextField(1);
		labelblank = new JLabel("");
		labelblank.setFont(font);
		pfiftymeters.add(labelfiftymeters1);
		pfiftymeters.add(textfiftymeters1);
		pfiftymeters.add(labelfiftymeters2);
		pfiftymeters.add(textfiftymeters2);
		pfiftymeters.add(labelblank);
		/*坐位体前屈*/
		psittingpush = new JPanel();
		psittingpush.setLayout(new GridLayout(1,3));
		pleft.add(psittingpush);
		labelsittingpush1 = new JLabel("坐位体前屈");
		labelsittingpush1.setFont(font);
		textsittingpush = new JTextField(3);
		labelsittingpush2 = new JLabel("cm");
		labelsittingpush2.setFont(font);
		psittingpush.add(labelsittingpush1);
		psittingpush.add(textsittingpush);
		psittingpush.add(labelsittingpush2);
		/*立定跳远*/
		pjump = new JPanel();
		pjump.setLayout(new GridLayout(1,3));
		pleft.add(pjump);
		labeljump1 = new JLabel("立定跳远");
		labeljump1.setFont(font);
		textjump = new JTextField(10);
		labeljump2 = new JLabel("cm");
		labeljump2.setFont(font);
		pjump.add(labeljump1);
		pjump.add(textjump);
		pjump.add(labeljump2);
		/*引体向上*/
		ppullup = new JPanel();
		ppullup.setLayout(new GridLayout(1,3));
		pleft.add(ppullup);
		labelpullup1 = new JLabel("引体向上");
		labelpullup1.setFont(font);
		textpullup = new JTextField(10);
		labelpullup2 = new JLabel("个");
		labelpullup2.setFont(font);
		ppullup.add(labelpullup1);
		ppullup.add(textpullup);
		ppullup.add(labelpullup2);
		/*1000米*/
		pthousandmeters = new JPanel();
		pthousandmeters.setLayout(new GridLayout(1,5));
		pleft.add(pthousandmeters);
		labelthousandmeters1 = new JLabel("1000米耐力跑");
		labelthousandmeters1.setFont(font);
		textthousandmeters1 = new JTextField(1);
		labelthousandmeters2 = new JLabel("分");
		labelthousandmeters2.setFont(font);
		textthousandmeters2 = new JTextField(1);
		labelthousandmeters3 = new JLabel("秒");
		labelthousandmeters3.setFont(font);
		pthousandmeters.add(labelthousandmeters1);
		pthousandmeters.add(textthousandmeters1);
		pthousandmeters.add(labelthousandmeters2);
		pthousandmeters.add(textthousandmeters2);
		pthousandmeters.add(labelthousandmeters3);
		/*专项课*/
		pmajor = new JPanel();
		pmajor.setLayout(new GridLayout(1,3));
		pleft.add(pmajor);
		labelmajor1 = new JLabel("专项课得分");
		labelmajor1.setFont(font);
		textmajor = new JTextField(10);
		labelmajor2 = new JLabel("分");
		labelmajor2.setFont(font);
		pmajor.add(labelmajor1);
		pmajor.add(textmajor);
		pmajor.add(labelmajor2);
		/*跳绳得分*/
		pskippingrope = new JPanel();
		pskippingrope.setLayout(new GridLayout(1,3));
		pleft.add(pskippingrope);
		labelskippingrope1 = new JLabel("跳绳得分");
		labelskippingrope1.setFont(font);
		textskippingrope = new JTextField(10);
		labelskippingrope2 = new JLabel("分");
		labelskippingrope2.setFont(font);
		pskippingrope.add(labelskippingrope1);
		pskippingrope.add(textskippingrope);
		pskippingrope.add(labelskippingrope2);
		/*体侧得分*/
		ptest = new JPanel();
		ptest.setLayout(new GridLayout(1,3));
		pleft.add(ptest);
	    labeltest1 = new JLabel("体侧得分");
	    labeltest1.setFont(font);
	    texttest = new JTextField(10);
	    labeltest2 = new JLabel("分");
	    labeltest2.setFont(font);
	    ptest.add(labeltest1);
	    ptest.add(texttest);
	    ptest.add(labeltest2);
		/*总分*/
		ptotal = new JPanel();
		ptotal.setLayout(new GridLayout(1,3));
		pleft.add(ptotal);
		labeltotal1 = new JLabel("总分");
		labeltotal1.setFont(font);
		texttotal = new JTextField(10);
		labeltotal2 = new JLabel("分");
		labeltotal2.setFont(font);
		ptotal.add(labeltotal1);
		ptotal.add(texttotal);
		ptotal.add(labeltotal2);
		/*右侧布局*/
		counting = new JButton("计算得分");
		counting.setFont(font);
		counting.addActionListener(this);
		pright.add(counting);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==counting){
			/*计算BMI得分*/
			height = Double.parseDouble(textheight.getText());
			weight = Double.parseDouble(textweight.getText());
			BMI = weight/(height*height);
			if(BMI>=17.9 & BMI<=23.9) BMIgrade = 100;
			else if( (BMI<=17.8) | (BMI>=24.0&BMI<=27.9)) BMIgrade = 80;
			else if( BMI>=28.0 ) BMIgrade = 60;
			/*计算肺活量得分*/
			lungcontent = Double.parseDouble(textlungcontent.getText());
			if(lungcontent>=5040) lungcontentgrade = 100;
			else if(lungcontent>=4920) lungcontentgrade = 95;
			else if(lungcontent>=4800) lungcontentgrade = 90;
			else if(lungcontent>=4550) lungcontentgrade = 85;
			else if(lungcontent>=4300) lungcontentgrade = 80;
			else if(lungcontent>=4180) lungcontentgrade = 78;
			else if(lungcontent>=4060) lungcontentgrade = 76;
			else if(lungcontent>=3940) lungcontentgrade = 74;
			else if(lungcontent>=3820) lungcontentgrade = 72;
			else if(lungcontent>=3700) lungcontentgrade = 70;
			else if(lungcontent>=3580) lungcontentgrade = 68;
			else if(lungcontent>=3460) lungcontentgrade = 66;
			else if(lungcontent>=3340) lungcontentgrade = 64;
			else if(lungcontent>=3220) lungcontentgrade = 62;
			else if(lungcontent>=3100) lungcontentgrade = 60;
			else if(lungcontent>=2940) lungcontentgrade = 50;
			else if(lungcontent>=2780) lungcontentgrade = 40;
			else if(lungcontent>=2620) lungcontentgrade = 30;
			else if(lungcontent>=2460) lungcontentgrade = 20;
			else if(lungcontent>=2300) lungcontentgrade = 10;
			else lungcontentgrade = 0;
			/*计算50米得分*/
			fiftymeters1 = Double.parseDouble(textfiftymeters1.getText());
			fiftymeters2 = Double.parseDouble(textfiftymeters2.getText());
			if(fiftymeters1<=5) fiftymetersgrade = 100;
			else if(fiftymeters1 == 6){
				if(fiftymeters2<=7) fiftymetersgrade = 100;
				else if(fiftymeters2 == 8) fiftymetersgrade = 95;
				else if(fiftymeters2 == 9) fiftymetersgrade = 90;
				
			}else if(fiftymeters1 == 7){
				if(fiftymeters2 == 0) fiftymetersgrade = 85;
				else if(fiftymeters2 == 1) fiftymetersgrade = 80;
				else if(fiftymeters2 <= 3) fiftymetersgrade = 78;
				else if(fiftymeters2 <= 5) fiftymetersgrade = 76;
				else if(fiftymeters2 <= 7) fiftymetersgrade = 74;
				else if(fiftymeters2 <= 9) fiftymetersgrade = 72;
			}else if(fiftymeters1 == 8){
				if(fiftymeters2 <= 1) fiftymetersgrade = 70;
				else if(fiftymeters2 <= 3) fiftymetersgrade = 68;
				else if(fiftymeters2 <= 5) fiftymetersgrade = 66;
				else if(fiftymeters2 <= 7) fiftymetersgrade = 64;
				else if(fiftymeters2 <= 9) fiftymetersgrade = 62;
			}else if(fiftymeters1 == 9){
				if(fiftymeters2 <= 1) fiftymetersgrade = 60;
				else if(fiftymeters2 <= 3) fiftymetersgrade = 50;
				else if(fiftymeters2 <= 5) fiftymetersgrade = 40;
				else if(fiftymeters2 <= 7) fiftymetersgrade = 30;
				else if(fiftymeters2 <= 9) fiftymetersgrade = 20;
			}else if(fiftymeters1 == 10){
				if(fiftymeters2 <= 1) fiftymetersgrade = 10;
				else fiftymetersgrade = 0;
			}else fiftymetersgrade = 0;
			/*坐位体前屈得分计算*/
			sittingpush = Double.parseDouble(textsittingpush.getText());
			if(sittingpush >= 24.9) sittingpushgrade = 100;
			else if(sittingpush >= 23.1) sittingpushgrade = 95;
			else if(sittingpush >= 21.3) sittingpushgrade = 90;
			else if(sittingpush >= 19.5) sittingpushgrade = 85;
			else if(sittingpush >= 17.7) sittingpushgrade = 80;
			else if(sittingpush >= 16.3) sittingpushgrade = 78;
			else if(sittingpush >= 14.9) sittingpushgrade = 76;
			else if(sittingpush >= 13.5) sittingpushgrade = 74;
			else if(sittingpush >= 12.1) sittingpushgrade = 72;
			else if(sittingpush >= 10.7) sittingpushgrade = 70;
			else if(sittingpush >= 9.3)  sittingpushgrade = 68;
			else if(sittingpush >= 7.9)  sittingpushgrade = 66;
			else if(sittingpush >= 6.5)  sittingpushgrade = 64;
			else if(sittingpush >= 5.1)  sittingpushgrade = 62;
			else if(sittingpush >= 3.7)  sittingpushgrade = 60;
			else if(sittingpush >= 2.7)  sittingpushgrade = 50;
			else if(sittingpush >= 1.7)  sittingpushgrade = 40;
			else if(sittingpush >= 0.7)  sittingpushgrade = 30;
			else if(sittingpush >= -0.3) sittingpushgrade = 20;
			else if(sittingpush >= -1.3) sittingpushgrade = 10;
			else sittingpushgrade = 0;
			/*立定跳远得分*/
			jump = Double.parseDouble(textjump.getText());
			if(jump >= 273) jumpgrade = 100;
			else if(jump >= 268) jumpgrade = 95;
			else if(jump >= 263) jumpgrade = 90;
			else if(jump >= 256) jumpgrade = 85;
			else if(jump >= 248) jumpgrade = 80;
			else if(jump >= 244) jumpgrade = 78;
			else if(jump >= 240) jumpgrade = 76;
			else if(jump >= 236) jumpgrade = 74;
			else if(jump >= 232) jumpgrade = 72;
			else if(jump >= 228) jumpgrade = 70;
			else if(jump >= 224) jumpgrade = 68;
			else if(jump >= 220) jumpgrade = 66;
			else if(jump >= 216) jumpgrade = 64;
			else if(jump >= 212) jumpgrade = 62;
			else if(jump >= 208) jumpgrade = 60;
			else if(jump >= 203) jumpgrade = 50;
			else if(jump >= 198) jumpgrade = 40;
			else if(jump >= 193) jumpgrade = 30;
			else if(jump >= 188) jumpgrade = 20;
			else if(jump >= 183) jumpgrade = 10;
			else jumpgrade = 0;
			/*计算引体向上得分*/
			pullup = Double.parseDouble(textpullup.getText());
			if(pullup >= 19) pullupgrade = 100;
			else if(pullup == 18) pullupgrade = 95;
			else if(pullup == 17) pullupgrade = 90;
			else if(pullup == 16) pullupgrade = 85;
			else if(pullup == 15) pullupgrade = 80;
			else if(pullup == 14) pullupgrade = 76;
			else if(pullup == 13) pullupgrade = 72;
			else if(pullup == 12) pullupgrade = 68;
			else if(pullup == 11) pullupgrade = 64;
			else if(pullup == 10) pullupgrade = 60;
			else if(pullup == 9) pullupgrade = 50;
			else if(pullup == 8) pullupgrade = 40;
			else if(pullup == 7) pullupgrade = 30;
			else if(pullup == 6) pullupgrade = 20;
			else if(pullup == 5) pullupgrade = 10;
			else pullupgrade = 0;
			/*计算1000米得分*/
			thousandmeters1 = Double.parseDouble(textthousandmeters1.getText());
			thousandmeters2 = Double.parseDouble(textthousandmeters2.getText());
			if(thousandmeters1<=2) thousandmetersgrade = 100;
			else if(thousandmeters1 == 3){
				if(thousandmeters2 <= 17) thousandmetersgrade = 100;
				else if(thousandmeters2 <= 22) thousandmetersgrade = 95;
				else if(thousandmeters2 <= 27) thousandmetersgrade = 90;
				else if(thousandmeters2 <= 34) thousandmetersgrade = 85;
				else if(thousandmeters2 <= 42) thousandmetersgrade = 80;
				else if(thousandmeters2 <= 47) thousandmetersgrade = 78;
				else if(thousandmeters2 <= 52) thousandmetersgrade = 76;
				else if(thousandmeters2 <= 57) thousandmetersgrade = 74;
				else thousandmetersgrade = 72;
			}else if(thousandmeters1 == 4){
				if(thousandmeters2 <= 2) thousandmetersgrade = 72;
				else if(thousandmeters2 <= 7) thousandmetersgrade = 70;
				else if(thousandmeters2 <= 12) thousandmetersgrade = 68;
				else if(thousandmeters2 <= 17) thousandmetersgrade = 66;
				else if(thousandmeters2 <= 22) thousandmetersgrade = 64;
				else if(thousandmeters2 <= 27) thousandmetersgrade = 62;
				else if(thousandmeters2 <= 32) thousandmetersgrade = 60;
				else if(thousandmeters2 <= 52) thousandmetersgrade = 50;
				else thousandmetersgrade = 40;
 			}else if(thousandmeters1 == 5){
				if(thousandmeters2 <= 12) thousandmetersgrade = 40;
				else if(thousandmeters2 <= 32) thousandmetersgrade = 30;
				else if(thousandmeters2 <= 52) thousandmetersgrade = 20;
				else thousandmetersgrade = 10;
			}else if(thousandmeters1 == 6){
				if(thousandmeters2 <= 12) thousandmetersgrade = 10;
				else thousandmetersgrade = 0;
			}else thousandmetersgrade = 0;
			/*计算体侧总分*/
			test = 0.15*BMIgrade + 0.15*lungcontentgrade + 0.2*fiftymetersgrade + 0.1*sittingpushgrade + 0.1*jumpgrade + 0.1*pullupgrade + 0.2*thousandmetersgrade;
			texttest.setText(String.valueOf(new java.text.DecimalFormat("#.00").format(test)));
			/*计算总分*/
			total = test*0.5 + Double.parseDouble(textmajor.getText())*0.4 + Double.parseDouble(textskippingrope.getText())*0.1;
			texttotal.setText(new java.text.DecimalFormat("#.00").format(total));
		}
	}
}
