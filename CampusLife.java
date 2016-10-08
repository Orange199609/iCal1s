package iCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

class CampusLife extends JFrame implements ActionListener{
	JButton bc1,bc2,bc3,bc4,bc5;
	Font font = new Font("华文行楷",Font.BOLD,18);
	
	public CampusLife(){
		super("校园生活");
	    this.setLocation(55,55);  
	    this.setSize(254,350); 
	    this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLayout(null);   //无布局
		
		//--------实例化所有控件---------
		bc1 = new JButton("鞋码换算");
        bc1.setIcon(new ImageIcon("D://iCal图标/鞋子.png"));
		bc1.setForeground(Color.black); 
		bc1.setFont(font);
		bc1.addActionListener(this);
		bc1.setBounds(27,5,200,56);
		
		bc2 = new JButton("绩点快速计算");
        bc2.setIcon(new ImageIcon("D://iCal图标/灯泡.png"));
		bc2.setForeground(Color.black); 
		bc2.setFont(font);
		bc2.addActionListener(this);
		bc2.setBounds(27,66,200,56);
		
		bc3 = new JButton("步数换算卡路里");
        bc3.setIcon(new ImageIcon("D://iCal图标/火.png"));
		bc3.setForeground(Color.black); 
		bc3.setFont(font);
		bc3.addActionListener(this);
		bc3.setBounds(27,127,200,56);
		
		bc4 = new JButton("打车软件价格对比");
        bc4.setIcon(new ImageIcon("D://iCal图标/车.png"));
		bc4.setForeground(Color.black); 
		bc4.setFont(font);
		bc4.addActionListener(this);
		bc4.setBounds(27,188,200,56);
		
		bc5 = new JButton("体育成绩快速计算");
        bc5.setIcon(new ImageIcon("D://iCal图标/足球.png"));
		bc5.setForeground(Color.black); 
		bc5.setFont(font);
		bc5.addActionListener(this);
		bc5.setBounds(27,249,200,56);
		//---------------------------------------------------------
		
		add(bc1);
		add(bc2);
		add(bc3);
		add(bc4);
		add(bc5);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == bc1){
			ShoeSizeConvertion window = new ShoeSizeConvertion();
			window.setTitle("鞋码换算");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
	       }
		
		if(e.getSource() == bc2){
			MyGPACounting window = new MyGPACounting();
			window.setTitle("GPA快速计算");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			//window.pack();
			//window.setVisible(true);
		}
	   
		if(e.getSource() == bc3){
			Calorie window = new Calorie();
			window.setTitle("步数换算卡路里");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setSize(500,300);
			window.setVisible(true);
		}
		
		if(e.getSource() == bc4){
			TaxiAppComparison window = new TaxiAppComparison();
			window.setTitle("打车软件价格对比");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
		
		if(e.getSource() == bc5){
			PEGrading window = new PEGrading();
			window.setTitle("体育成绩快速计算");
			window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			window.pack();
			window.setVisible(true);
			window.setSize(200,200);
		}
		
       }
	
}