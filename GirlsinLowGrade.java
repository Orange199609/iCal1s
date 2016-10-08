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

public class GirlsinLowGrade extends JFrame implements ActionListener{
	
	JButton counting;
	JTextField textheight,textweight,textlungcontent,textfiftymeters1,textfiftymeters2,textsittingpush,textjump,textpullup,texteighthundredmeters1,texteighthundredmeters2,textmajor,texttotal,texttest,textskippingrope;
	JLabel labelheight1,labelheight2,labelweight1,labelweight2,labellungcontent1,labellungcontent2,labelfiftymeters1,labelfiftymeters2,labelsittingpush1,labelsittingpush2,labeljump1,labeljump2,labelpullup1,labelpullup2,labeleighthundredmeters1,labeleighthundredmeters2,labeleighthundredmeters3,labelmajor1,labelmajor2,labeltotal1,labeltotal2,labeltest1,labeltest2,labelskippingrope1,labelskippingrope2,labelblank;
	JPanel pmain,pleft,pright,pheight,pweight,plungcontent,pfiftymeters,psittingpush,pjump,ppullup,peighthundredmeters,pmajor,ptotal,ptest,pskippingrope;
	double height,weight,lungcontent,fiftymeters1,fiftymeters2,sittingpush,jump,pullup,eighthundredmeters1,eighthundredmeters2,major,total,test;
    double BMIgrade,lungcontentgrade,fiftymetersgrade,sittingpushgrade,jumpgrade,pullupgrade,eighthundredmetersgrade,skippingropegrade,BMI;
    String s = new String("");
    Font font = new Font("华文行楷",Font.BOLD,16);
    
	public GirlsinLowGrade(){
		super("大一大二女生体测成绩计算");
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
		/*仰卧起坐*/
		ppullup = new JPanel();
		ppullup.setLayout(new GridLayout(1,3));
		pleft.add(ppullup);
		labelpullup1 = new JLabel("仰卧起坐");
		labelpullup1.setFont(font);
		textpullup = new JTextField(10);
		labelpullup2 = new JLabel("个");
		labelpullup2.setFont(font);
		ppullup.add(labelpullup1);
		ppullup.add(textpullup);
		ppullup.add(labelpullup2);
		/*800米*/
		peighthundredmeters = new JPanel();
		peighthundredmeters.setLayout(new GridLayout(1,5));
		pleft.add(peighthundredmeters);
		labeleighthundredmeters1 = new JLabel("800米耐力跑");
		labeleighthundredmeters1.setFont(font);
		texteighthundredmeters1 = new JTextField(1);
		labeleighthundredmeters2 = new JLabel("分");
		labeleighthundredmeters2.setFont(font);
		texteighthundredmeters2 = new JTextField(1);
		labeleighthundredmeters3 = new JLabel("秒");
		labeleighthundredmeters3.setFont(font);
		peighthundredmeters.add(labeleighthundredmeters1);
		peighthundredmeters.add(texteighthundredmeters1);
		peighthundredmeters.add(labeleighthundredmeters2);
		peighthundredmeters.add(texteighthundredmeters2);
		peighthundredmeters.add(labeleighthundredmeters3);
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
			if(BMI>=17.2 & BMI<=23.9) BMIgrade = 100;
			else if( (BMI<=17.1) | (BMI>=24.0&BMI<=27.9)) BMIgrade = 80;
			else if( BMI>=28.0 ) BMIgrade = 60;
			/*计算肺活量得分*/
			lungcontent = Double.parseDouble(textlungcontent.getText());
			if(lungcontent>=3400) lungcontentgrade = 100;
			else if(lungcontent>=3350) lungcontentgrade = 95;
			else if(lungcontent>=3300) lungcontentgrade = 90;
			else if(lungcontent>=3150) lungcontentgrade = 85;
			else if(lungcontent>=3000) lungcontentgrade = 80;
			else if(lungcontent>=2900) lungcontentgrade = 78;
			else if(lungcontent>=2800) lungcontentgrade = 76;
			else if(lungcontent>=2700) lungcontentgrade = 74;
			else if(lungcontent>=2600) lungcontentgrade = 72;
			else if(lungcontent>=2500) lungcontentgrade = 70;
			else if(lungcontent>=2400) lungcontentgrade = 68;
			else if(lungcontent>=2300) lungcontentgrade = 66;
			else if(lungcontent>=2200) lungcontentgrade = 64;
			else if(lungcontent>=2100) lungcontentgrade = 62;
			else if(lungcontent>=2000) lungcontentgrade = 60;
			else if(lungcontent>=1960) lungcontentgrade = 50;
			else if(lungcontent>=1920) lungcontentgrade = 40;
			else if(lungcontent>=1880) lungcontentgrade = 30;
			else if(lungcontent>=1840) lungcontentgrade = 20;
			else if(lungcontent>=1800) lungcontentgrade = 10;
			else lungcontentgrade = 0;
			/*计算50米得分*/
			fiftymeters1 = Double.parseDouble(textfiftymeters1.getText());
			fiftymeters2 = Double.parseDouble(textfiftymeters2.getText());
			if(fiftymeters1<=6) fiftymetersgrade = 100;
			else if(fiftymeters1 == 7){
				if(fiftymeters2<=5) fiftymetersgrade = 100;
				else if(fiftymeters2 == 6) fiftymetersgrade = 95;
				else if(fiftymeters2 == 7) fiftymetersgrade = 90;
				else fiftymetersgrade = 85;
			}else if(fiftymeters1 == 8){
				if(fiftymeters2 == 0) fiftymetersgrade = 85;
				else if(fiftymeters2 <= 3) fiftymetersgrade = 80;
				else if(fiftymeters2 <= 5) fiftymetersgrade = 78;
				else if(fiftymeters2 <= 7) fiftymetersgrade = 76;
				else if(fiftymeters2 <= 9) fiftymetersgrade = 74;
			}else if(fiftymeters1 == 9){
				if(fiftymeters2 <= 1) fiftymetersgrade = 72;
				else if(fiftymeters2 <= 3) fiftymetersgrade = 70;
				else if(fiftymeters2 <= 5) fiftymetersgrade = 68;
				else if(fiftymeters2 <= 7) fiftymetersgrade = 66;
				else if(fiftymeters2 <= 9) fiftymetersgrade = 64;
			}else if(fiftymeters1 == 10){
				if(fiftymeters2 <= 1) fiftymetersgrade = 62;
				else if(fiftymeters2 <= 3) fiftymetersgrade = 60;
				else if(fiftymeters2 <= 5) fiftymetersgrade = 50;
				else if(fiftymeters2 <= 7) fiftymetersgrade = 40;
				else if(fiftymeters2 <= 9) fiftymetersgrade = 30;
			}else if(fiftymeters1 == 11){
			    if(fiftymeters2 <= 1) fiftymetersgrade = 20;
				if(fiftymeters2 <= 3) fiftymetersgrade = 10;
				else fiftymetersgrade = 0;
			}else fiftymetersgrade = 0;
			/*坐位体前屈得分计算*/
			sittingpush = Double.parseDouble(textsittingpush.getText());
			if(sittingpush >= 25.8) sittingpushgrade = 100;
			else if(sittingpush >= 24.0) sittingpushgrade = 95;
			else if(sittingpush >= 22.2) sittingpushgrade = 90;
			else if(sittingpush >= 20.6) sittingpushgrade = 85;
			else if(sittingpush >=  19.0) sittingpushgrade = 80;
			else if(sittingpush >= 17.7) sittingpushgrade = 78;
			else if(sittingpush >= 16.4) sittingpushgrade = 76;
			else if(sittingpush >= 15.1) sittingpushgrade = 74;
			else if(sittingpush >= 13.8) sittingpushgrade = 72;
			else if(sittingpush >= 12.5) sittingpushgrade = 70;
			else if(sittingpush >= 11.2)  sittingpushgrade = 68;
			else if(sittingpush >= 9.9)  sittingpushgrade = 66;
			else if(sittingpush >= 8.6)  sittingpushgrade = 64;
			else if(sittingpush >= 7.3)  sittingpushgrade = 62;
			else if(sittingpush >= 6.0)  sittingpushgrade = 60;
			else if(sittingpush >= 5.2)  sittingpushgrade = 50;
			else if(sittingpush >= 4.4)  sittingpushgrade = 40;
			else if(sittingpush >= 3.6)  sittingpushgrade = 30;
			else if(sittingpush >= 2.8) sittingpushgrade = 20;
			else if(sittingpush >= 2.0) sittingpushgrade = 10;
			else sittingpushgrade = 0;
			/*立定跳远得分*/
			jump = Double.parseDouble(textjump.getText());
			if(jump >= 207) jumpgrade = 100;
			else if(jump >= 201) jumpgrade = 95;
			else if(jump >= 195) jumpgrade = 90;
			else if(jump >= 188) jumpgrade = 85;
			else if(jump >= 181) jumpgrade = 80;
			else if(jump >= 178) jumpgrade = 78;
			else if(jump >= 175) jumpgrade = 76;
			else if(jump >= 172) jumpgrade = 74;
			else if(jump >= 169) jumpgrade = 72;
			else if(jump >= 166) jumpgrade = 70;
			else if(jump >= 163) jumpgrade = 68;
			else if(jump >= 160) jumpgrade = 66;
			else if(jump >= 157) jumpgrade = 64;
			else if(jump >= 154) jumpgrade = 62;
			else if(jump >= 151) jumpgrade = 60;
			else if(jump >= 146) jumpgrade = 50;
			else if(jump >= 141) jumpgrade = 40;
			else if(jump >= 136) jumpgrade = 30;
			else if(jump >= 131) jumpgrade = 20;
			else if(jump >= 126) jumpgrade = 10;
			else jumpgrade = 0;
			/*计算仰卧起坐得分*/
			pullup = Double.parseDouble(textpullup.getText());
			if(pullup >= 56) pullupgrade = 100;
			else if(pullup >= 54) pullupgrade = 95;
			else if(pullup >= 52) pullupgrade = 90;
			else if(pullup >= 49) pullupgrade = 85;
			else if(pullup >= 46) pullupgrade = 80;
			else if(pullup >= 44) pullupgrade = 78;
			else if(pullup >= 42) pullupgrade = 76;
			else if(pullup >= 40) pullupgrade = 74;
			else if(pullup >= 38) pullupgrade = 72;
			else if(pullup >= 36) pullupgrade = 70;
			else if(pullup >= 34) pullupgrade = 68;
			else if(pullup >= 32) pullupgrade = 66;
			else if(pullup >= 30) pullupgrade = 64;
			else if(pullup >= 28) pullupgrade = 62;
			else if(pullup >= 26) pullupgrade = 60;
			else if(pullup >= 24) pullupgrade = 50;
			else if(pullup >= 22) pullupgrade = 40;
			else if(pullup >= 20) pullupgrade = 30;
			else if(pullup >= 18) pullupgrade = 20;
			else if(pullup >= 16) pullupgrade = 10;
			else pullupgrade = 0;
			/*计算1000米得分*/
			eighthundredmeters1 = Double.parseDouble(texteighthundredmeters1.getText());
			eighthundredmeters2 = Double.parseDouble(texteighthundredmeters2.getText());
			if(eighthundredmeters1<=2) eighthundredmetersgrade = 100;
			else if(eighthundredmeters1 == 3){
				if(eighthundredmeters2 <= 18) eighthundredmetersgrade = 100;
				else if(eighthundredmeters2 <= 24) eighthundredmetersgrade = 95;
				else if(eighthundredmeters2 <= 30) eighthundredmetersgrade = 90;
				else if(eighthundredmeters2 <= 37) eighthundredmetersgrade = 85;
				else if(eighthundredmeters2 <= 44) eighthundredmetersgrade = 80;
				else if(eighthundredmeters2 <= 49) eighthundredmetersgrade = 78;
				else if(eighthundredmeters2 <= 54) eighthundredmetersgrade = 76;
				else if(eighthundredmeters2 <= 59) eighthundredmetersgrade = 74;
				else eighthundredmetersgrade = 72;
			}else if(eighthundredmeters1 == 4){
				if(eighthundredmeters2 <= 4) eighthundredmetersgrade = 72;
				else if(eighthundredmeters2 <= 9) eighthundredmetersgrade = 70;
				else if(eighthundredmeters2 <= 14) eighthundredmetersgrade = 68;
				else if(eighthundredmeters2 <= 19) eighthundredmetersgrade = 66;
				else if(eighthundredmeters2 <= 24) eighthundredmetersgrade = 64;
				else if(eighthundredmeters2 <= 29) eighthundredmetersgrade = 62;
				else if(eighthundredmeters2 <= 34) eighthundredmetersgrade = 60;
				else if(eighthundredmeters2 <= 44) eighthundredmetersgrade = 50;
				else if(eighthundredmeters2 <= 54) eighthundredmetersgrade = 40;
				else eighthundredmetersgrade = 30;
 			}else if(eighthundredmeters1 == 5){
				if(eighthundredmeters2 <= 4) eighthundredmetersgrade = 30;
				else if(eighthundredmeters2 <= 14) eighthundredmetersgrade = 20;
				else if(eighthundredmeters2 <= 24) eighthundredmetersgrade = 10;
				else eighthundredmetersgrade = 0;
			}else eighthundredmetersgrade = 0;
			/*计算体侧总分*/
			test = 0.15*BMIgrade + 0.15*lungcontentgrade + 0.2*fiftymetersgrade + 0.1*sittingpushgrade + 0.1*jumpgrade + 0.1*pullupgrade + 0.2*eighthundredmetersgrade;
			texttest.setText(String.valueOf(test));
			/*计算总分*/
			total = test*0.5 + Double.parseDouble(textmajor.getText())*0.4 + Double.parseDouble(textskippingrope.getText())*0.1;
			texttotal.setText(new java.text.DecimalFormat("#.00").format(total));
		}
	}

}
