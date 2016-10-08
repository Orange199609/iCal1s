package iCalculator;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class MainPage extends JFrame implements ActionListener{
	JPanel p1;                            //新建一个面板
	JButton bc1,bc2,bc3;
	Font font = new Font("华文行楷",Font.BOLD,21);
	JLabel ltitle,lver;
	
	public MainPage(){             //设计界面
		super("iCal");
	    setLocation(32, 32);  
	    setSize(254,350);  
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setResizable(false);
	    show();
		setLayout(null);   //无布局
		
		//--------实例化所有控件---------
		ltitle = new JLabel("iCal1s",JLabel.CENTER);
		ltitle.setFont(new Font("华文行楷",Font.BOLD, 24));
		ltitle.setBounds(0,0,254,62);
		
		bc1 =new JButton("基础计算");
        bc1.setIcon(new ImageIcon("F://软工/iCal图标/计算器.png"));
		bc1.setForeground(Color.black); 
		bc1.setFont(font);
		bc1.addActionListener(this);
		bc1.setBounds(42,62,170,62);
		
		bc2 =new JButton("校园生活");
        bc2.setIcon(new ImageIcon("F://软工/iCal图标/校园.png"));
		bc2.setForeground(Color.black); 
		bc2.setFont(font);
		bc2.addActionListener(this);
		bc2.setBounds(42,134,170,62);
		
		bc3 =new JButton("挂科预测");
        bc3.setIcon(new ImageIcon("F://软工/iCal图标/挂科.png"));
		bc3.setForeground(Color.black); 
		bc3.setFont(font);
		bc3.addActionListener(this);
		bc3.setBounds(42,206,170,62);
		
		lver = new JLabel("版本号:20161009.1",JLabel.CENTER);
		lver.setFont(new Font("宋体",Font.BOLD, 12));
		lver.setBounds(42,280,170,62);
		//---------------------------------------------------------
		
		add(ltitle);
		add(bc1);
		add(bc2);
		add(bc3);
		add(lver);
	}                              //构造主界面完成
	
	public void actionPerformed(ActionEvent e){  //所有按钮的action事件监听器
		if(e.getSource() == bc1){             //bc1按钮被点击
			Basic window = new Basic();
			window.setTitle("基础计算");            //基础计算界面被创建
			window.setFont(font);
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);       //添加关闭按钮
			window.pack();
			window.setVisible(true);
			window.setResizable(false);
			
		} 
		
		if(e.getSource() == bc2){             //bc2按钮被点击
			CampusLife window = new CampusLife();
			window.setTitle("校园生活");           //校园生活界面被创建
			window.setFont(font);
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);       //添加关闭按钮
			window.pack();
			window.setSize(254,350);
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