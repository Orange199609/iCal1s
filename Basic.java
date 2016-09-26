package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Basic extends JFrame implements ActionListener
{
	double memory;
	double result=0,now=0;         //记录最终答案和过程中的答案
	public double num = 0;                //记录指数以及对数运算的底数
	int nDot=0;			           //总共有多少小数
	int operation=1;               //1~4分别代表加减乘除；
	boolean reBuild=false;         //重新输入数据
	boolean memoried=false;
	boolean wait=false;            //已经有运算符，等待
	boolean input=true;
	boolean opera=false;
	boolean simple=false;
	String str="0";
	String mStr="0";
	private JTextField text,mem;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	private JButton bBackspace,bCe,bC,bSqrt,bPercent,bReciprocal,bEqual,bMul,bDiv,bPlus,bMinus,bDot,bNev,bSin,bCos,bPow,bLog;
	private JButton bMC,bMR,bMS,bM;
	public Basic()
	{
		super("基础计算");
		this.setSize(370,290);
		this.setResizable(false);
		this.setLocation(200,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(java.awt.Color.lightGray);
		this.setLayout(new GridLayout(6,1,5,5));
		Font font=new Font("楷体",0,12);
		text=new JTextField(22);
		text.setHorizontalAlignment(JTextField.RIGHT); 
		text.setEditable(false);
		text.setText("0.");
		JPanel p1=new JPanel(new GridLayout(1,4,3,3));
		JPanel p2=new JPanel(new GridLayout(1,7,3,3));
		JPanel p3=new JPanel(new GridLayout(1,7,3,3));
		JPanel p4=new JPanel(new GridLayout(1,7,3,3));
		JPanel p5=new JPanel(new GridLayout(1,7,3,3));
		//--------实例化所有按钮---------
		
		bBackspace=new JButton("Backspace");
		bBackspace.setForeground(Color.red); 
		bBackspace.setFont(font);
		bBackspace.addActionListener(this);
		
		bCe=new JButton("CE");
		bCe.setForeground(Color.red);
		bCe.setFont(font);
		bCe.addActionListener(this);
		
		bC=new JButton("C");
		bC.setForeground(Color.red);
		bC.setFont(font);
		bC.addActionListener(this);
		
		bDiv=new JButton("/");
		bDiv.setForeground(Color.red);
		bDiv.setFont(font);
		bDiv.addActionListener(this);
		
		bMul=new JButton("*");
		bMul.setForeground(Color.red);
		bMul.setFont(font);
		bMul.addActionListener(this);
		
		bMinus=new JButton("-");
		bMinus.setForeground(Color.red);
		bMinus.setFont(font);
		bMinus.addActionListener(this);
		
		bPlus=new JButton("+");
		bPlus.setForeground(Color.red);
		bPlus.setFont(font);
		bPlus.addActionListener(this);
		
		bEqual=new JButton("=");
		bEqual.setForeground(Color.red);
		bEqual.setFont(font);
		bEqual.addActionListener(this);
		
		bMC=new JButton("MC");
		bMC.setForeground(Color.red);
		bMC.setFont(font);
		bMC.addActionListener(this);
		
		bMR=new JButton("MR");
		bMR.setForeground(Color.red);
		bMR.setFont(font);
		bMR.addActionListener(this);
		
		bMS=new JButton("MS");
		bMS.setForeground(Color.red);
		bMS.setFont(font);
		bMS.addActionListener(this);
		
		bM=new JButton("M+");
		bM.setForeground(Color.red);
		bM.setFont(font);
		bM.addActionListener(this);
		
		b1=new JButton("1");
		b1.setForeground(Color.blue);
		b1.addActionListener(this);
		
		b2=new JButton("2");
		b2.setForeground(Color.blue);
		b2.addActionListener(this);
		
		b3=new JButton("3");
		b3.setForeground(Color.blue);
		b3.addActionListener(this);
		
		b4=new JButton("4");
		b4.setForeground(Color.blue);
		b4.addActionListener(this);
		
		b5=new JButton("5");
		b5.setForeground(Color.blue);
		b5.addActionListener(this);
		
		b6=new JButton("6");
		b6.setForeground(Color.blue);
		b6.addActionListener(this);
		
		b7=new JButton("7");
		b7.setForeground(Color.blue);
		b7.addActionListener(this);
		
		b8=new JButton("8");
		b8.setForeground(Color.blue);
		b8.addActionListener(this);
		
		b9=new JButton("9");
		b9.setForeground(Color.blue);
		b9.addActionListener(this);
		
		b0=new JButton("0");
		b0.setForeground(Color.blue);
		b0.addActionListener(this);
		
		bNev=new JButton("+/-");
		bNev.setForeground(Color.blue);
		bNev.setFont(font);
		bNev.addActionListener(this);
		
		bDot=new JButton(".");
		bDot.setForeground(Color.blue);
		bDot.addActionListener(this);
		
		bSqrt=new JButton("sqrt");
		bSqrt.setForeground(Color.blue);
		bSqrt.setFont(font);
		bSqrt.addActionListener(this);
		
		bPercent=new JButton("%");
		bPercent.setForeground(Color.blue);
		bPercent.setFont(font);
		bPercent.addActionListener(this);
		
		bReciprocal=new JButton("1/x");
		bReciprocal.setFont(font);
		bReciprocal.setForeground(Color.blue);
		bReciprocal.addActionListener(this);
		
		bSin=new JButton("sin");
		bSin.setFont(font);
		bSin.setForeground(Color.blue);
		bSin.addActionListener(this);
		
		bCos=new JButton("cos");
		bCos.setFont(font);
		bCos.setForeground(Color.blue);
		bCos.addActionListener(this);
		
		bPow=new JButton("^");
		bPow.setFont(font);
		bPow.setForeground(Color.blue);
		bPow.addActionListener(this);
		
		bLog=new JButton("log");
		bLog.setFont(font);
		bLog.setForeground(Color.blue);
		bLog.addActionListener(this);
		//---------------------------------------------------------
		mem=new JTextField(4);
		mem.setHorizontalAlignment(JTextField.CENTER); 
		mem.setEditable(false);
		p1.add(mem);
		p1.add(bBackspace);
		p1.add(bCe);
		p1.add(bC);
		p2.add(bMC);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(bDiv);
		p2.add(bSin);
		p2.add(bSqrt);
		p3.add(bMR);
		p3.add(b4);
		p3.add(b5);
		p3.add(b6);
		p3.add(bMul);
		p3.add(bCos);
		p3.add(bPercent);
		p4.add(bMS);
		p4.add(b1);
		p4.add(b2);
		p4.add(b3);
		p4.add(bMinus);
		p4.add(bPow);
		p4.add(bReciprocal);
		p5.add(bM);
		p5.add(b0);
		p5.add(bNev);
		p5.add(bDot);
		p5.add(bPlus);
		p5.add(bLog);
		p5.add(bEqual);
		this.add(text);
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.add(p4);
		this.add(p5);
        this.setVisible(true);	
	}	
	public void actionPerformed(ActionEvent e)//单击事件监听
	{
		//-------------   处理数字1 ~ 9    -------------------
		if(this.input&&e.getActionCommand().length()==1&&e.getActionCommand().compareTo("0")>=0&&e.getActionCommand().compareTo("9")<=0)   //处理1~9之间的数
		{
			if(this.reBuild||this.simple)
			{
				if(this.reBuild)  
					this.reBuild=false;
				if(this.simple)
					this.simple=false;
				this.now=0;
				this.nDot=0;
				this.str="0";				
			}
			if(nDot>0)
			{
				double t=1;
				for(int i=0;i<nDot;i++)t*=0.1;
				this.now+=Double.parseDouble(e.getActionCommand())*t;
				this.nDot++;
			}
			else now=now*10+Double.parseDouble(e.getActionCommand());
			if(str.compareTo("0")==0)
			{str=e.getActionCommand();}
			else this.str=this.str+e.getActionCommand();
			this.text.setText(this.str);
			this.wait=true;
		}
		//--------     处理小数点      --------------
		if(this.input&&!this.simple&&e.getSource()==bDot)
		{
			if(this.nDot==0)
			{
				this.nDot=1;
				this.str+=".";
				if(this.now!=0)this.text.setText(str+"0");
				if(this.now==0)this.text.setText(str);
			}
		}
		//--------- 处 理 倒 数 --------------------
		if(this.input&&e.getSource()==bReciprocal)
		{
			if(!this.reBuild)
			{
				if(this.now==0)
				{
					this.text.setText("错误：除数不能为零  ");
					this.input=false;
				}
				else
				{
					this.now=1/this.now;
					this.str=Double.toString(this.now);
					this.text.setText(this.str);
				}
			}
			else
			{
				if(this.result==0)
				{
					this.text.setText("错误：除数不能为零  ");
					this.input=false;
				}
				else
				{
					this.result=1/this.result;
					this.now=this.result;
					this.str=Double.toString(this.now);
					this.text.setText(this.str);
				}
			}
			this.opera=false;
			this.simple=true;
		}
		//----------处理求平方根-----------------
		if(this.input&&e.getSource()==bSqrt)
		{
			if(!this.reBuild)
			{
				if(this.now>=0)
				{
					this.now=Math.sqrt(this.now);
					this.text.setText(Double.toString(this.now));
				}
				else
				{
					this.text.setText("错误：负数不能开平方根  ");
					this.input=false;
				}
				
			}
			else
			{
				if(this.result>=0)
				{
					this.result=Math.sqrt(this.result);
					this.now=this.result;
					this.str=Double.toString(this.now);
					this.text.setText(this.str);
					this.reBuild=true;
				}
				else
				{
					this.text.setText("错误：负数不能开平方根  ");
					this.input=false;
				}
			}
			this.opera=false;
			this.simple=true;
		}
		//---------- 处 理 正 负 号 ---------------
		if(this.input&&e.getSource()==bNev)
		{
			if(!this.reBuild)
			{
				this.now=0-this.now;
				this.str=Double.toString(this.now);
				this.text.setText(this.str);
			}
			else
			{
				this.result=0-this.result;
				this.now=this.result;
				this.str=Double.toString(this.now);
				this.text.setText(this.str);
			}
			this.opera=false;
			this.simple=true;
		}
		//-----------  处理百分号 ----------------
		if(this.input&&e.getSource()==bPercent)
		{
			if(!this.reBuild)
			{
				this.now/=100;
				this.str=Double.toString(this.now);
				this.text.setText(this.str);
				this.nDot=this.nDot-2;
			}
			else
			{
				this.result/=100;
				this.now=this.result;
				this.str=Double.toString(this.now);
				this.text.setText(this.str);
			}
		}	
		//--------- 处理清除当前  ----------------
		if(this.input&&e.getSource()==bCe)
		{
			this.now=0;
			this.nDot=0;
			this.str="0";
			this.text.setText(str);
		}
		//-------------    处理清除全部  -------------------
		if(e.getSource()==bC)
		{
			this.now=0;
			this.nDot=0;
			this.str="0";
			this.operation=1;
			this.text.setText(str);
			this.reBuild=false;
			this.wait=false;  
			this.input=true;
			this.opera=false;
			this.simple=false;			
		}
		//----------- 处理 MC MR  MS  M+     ----------------
		if(e.getSource()==bMC)
		{
			this.mem.setText(" ");
			this.memory=0;
			this.mStr="0";
			this.memoried=false;
		}
		if(this.memoried&&e.getSource()==bMR)
		{
			this.now=memory;
			this.str=this.mStr;
			this.text.setText(str);
			this.reBuild=true;
		}
		if(this.memoried&&e.getSource()==bMS)
		{
			this.mStr=this.text.getText();
			this.memory=Double.parseDouble(this.mStr);
		}
		if(this.memoried==false&&e.getSource()==bM)
		{
			this.mStr=this.text.getText();
			this.memory=Double.parseDouble(this.mStr);
			this.mem.setText("  M   ");
			this.memoried=true;
		}
		//--------------   处理Backspace  ------------------
		if(this.input&&e.getSource()==bBackspace)
		{
			if(!this.reBuild)
			{
				if(nDot>0)nDot--;
				if(this.str.length()==1)
				{
					this.now=0;
					this.str="0";
				}
				else
				{
					this.str=str.substring(0,this.str.length()-1);
					this.now=Double.parseDouble(this.str);
				}
				this.text.setText(str);
			}
		}
		//------------  处理加减乘除 -----------
		if(this.input&&(e.getSource()==bPlus||e.getSource()==bMinus||e.getSource()==bMul||e.getSource()==bDiv))
		{
			
			if(this.wait&&this.opera)
			{
				switch(this.operation)
				{
					case 1:this.result+=this.now;break;
					case 2:this.result-=this.now;break;
					case 3:this.result*=this.now;break;
					default:
					if(this.now==0)
					{
						text.setText("错误：除数不能为零   ");
						this.input=false;
					}
					else
					{
						this.result/=this.now;break;
					}
				}
				if(this.input)text.setText(Double.toString(this.result));
				this.now=0;
				this.str="0";
                this.nDot=0;
				this.wait=false;
			}
			else
			{
				if(!this.reBuild)this.result=this.now;
				this.now=0;
				this.str="0";
                this.nDot=0;
				this.wait=false;
			}
			if(e.getActionCommand().equals("+"))this.operation=1;
			if(e.getActionCommand().equals("-"))this.operation=2;
			if(e.getActionCommand().equals("*"))this.operation=3;
			if(e.getActionCommand().equals("/"))this.operation=4;
			this.opera=true;
			this.simple=false;
		}
			
		//------------     处理等号  --------------
		if(this.input&&e.getSource()==bEqual)
		{
			if(this.opera)
			{
				switch(this.operation)
				{
					case 1:this.result+=this.now;break;
					case 2:this.result-=this.now;break;
					case 3:this.result*=this.now;break;
					case 4:
					if(this.now==0)
					{
						text.setText("错误：除数不能为零   ");
						this.input=false;
					}
					else
					{
						this.result/=this.now;
					}
					case 5:
					{
						if(this.result == 0)
						{
							text.setText("错误：底数不能为零   ");
							this.input=false;
						}
						else
						{
							this.result = Math.pow(this.result,this.now);
	                        break;
						}
					}
					default:
					{
						if(this.result == 0 || this.now == 0)
						{
							text.setText("错误：底数或真数不能为零");
							this.input=false;
						}
						else 
						{
							this.result = Math.log(this.now)/Math.log(this.result);
			            }
				 
					}
					
				}
				if(this.input)text.setText(Double.toString(this.result));
				this.wait=false;
				this.reBuild=true;
				this.simple=true;
                this.opera=false;
			}
		}
		
		//--------- 处理三角函数 --------------------
		if(this.input&&(e.getSource()==bSin||e.getSource()==bCos))
		{
			double rad = Math.toRadians(this.now);//将角度转换为弧度
			
			if(!this.reBuild)
			{
				if(e.getSource()== bSin) this.result = Math.sin(rad);
				if(e.getSource()== bCos) this.result = Math.cos(rad);
				this.text.setText(Double.toString(this.now));
				if(this.input)text.setText(Double.toString(this.result));
			}
			else
			{
				if(!this.reBuild) this.result=this.now;
			}
			this.opera=true;
			this.simple=false;
	    }
		
		//--------- 处理指数函数 --------------------
		if(this.input&&(e.getSource()== bPow))
		{
			if(this.wait&&this.opera)
			{
				if(this.now == 0)
				{
					text.setText("错误：底数不能为零   ");
					this.input=false;
				}
				else
				{
					this.result = this.now;
				}
				if(this.input)text.setText(Double.toString(this.result));
				this.now=0;
				this.str="0";
				this.nDot=0;
				this.wait=false;
			}
			else
			{
				if(!this.reBuild)this.result=this.now;
				this.now=0;
				this.str="0";
				this.nDot=0;
				this.wait=false;
			}
			if(e.getActionCommand().equals("^"))this.operation=5;
			this.opera=true;
			this.simple=false;
		}

		//--------- 处理对数函数 --------------------
		if(this.input&&(e.getSource()== bLog)){
			if(this.wait&&this.opera)
			{
				if(this.now == 0)
				{
					text.setText("错误：底数不能为零   ");
					this.input=false;
				}
				else
				{
					this.result = this.now;
				}
				if(this.input)text.setText(Double.toString(this.result));
				this.now=0;
				this.str="0";
				this.nDot=0;
				this.wait=false;
			}
			else
			{
				if(!this.reBuild)this.result=this.now;
				this.now=0;
				this.str="0";
				this.nDot=0;
				this.wait=false;
			}
			if(e.getActionCommand().equals("log"))this.operation=6;
			this.opera=true;
			this.simple=false;
		}
	    }

	
}
