package iCalculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
import java.awt.FlowLayout;
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
public class MyGPACounting extends JFrame implements ActionListener{
	SimpleDateFormat sdf = new SimpleDateFormat("yyyymmddHHmm");
	JFileChooser load_jfc = new JFileChooser();
	JFileChooser save_jfc = new JFileChooser();
	Boolean IsActived = false;
	JButton bt_add = new JButton("增加");
	JButton bt_cal = new JButton("计算");
	JButton bt_clear = new JButton("清空");
	JButton bt_import = new JButton("导入");
	JButton bt_export = new JButton("导出");
	JLabel lb_cname = new JLabel("课程名称");
	JLabel lb_cpoint = new JLabel("课程学分");
	JLabel lb_cscore = new JLabel("课程得分");
	JTextField tx_cname = new JTextField(15);
	JTextField tx_cpoint = new JTextField(15);
	JTextField tx_cscore = new JTextField(15);
	int row = -1;											//记录课程数量
	double total = 0.0;										//记录平均绩点
	private File file = null;
	JPanel rp = (JPanel)this.getContentPane();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	Object[][] x = new Object [50][3];
	Object[] rows = {"课程名称","课程学分","课程得分"};
	DefaultTableModel tableModel = new DefaultTableModel(x,rows);
	JTable tb1 = new JTable();
	JScrollPane jsp = new JScrollPane(tb1);
	Font font = new Font("华文行楷",Font.BOLD,16);
	
	public MyGPACounting(){
		p1.setLayout(new GridLayout(2,1,10,0));
		p2.setLayout(new GridLayout(1,3,0,0));
		p3.setLayout(new GridLayout(1,5,0,10));
		
		rp.add(p1,BorderLayout.NORTH);
		rp.add(jsp,BorderLayout.CENTER);
		p1.add(p2);p1.add(p3);
		p2.add(p4);p2.add(p5);p2.add(p6);
		p3.add(bt_add);p3.add(bt_cal);
		p3.add(bt_clear);
		p3.add(bt_import);p3.add(bt_export);
		p4.add(lb_cname);p4.add(tx_cname);
		p5.add(lb_cpoint);p5.add(tx_cpoint);
		p6.add(lb_cscore);p6.add(tx_cscore);
		
		bt_add.setFont(font);
		bt_cal.setFont(font);
		bt_clear.setFont(font);
		bt_export.setFont(font);
		bt_import.setFont(font);
		lb_cname.setFont(font);
		lb_cscore.setFont(font);
		lb_cpoint.setFont(font);
		tb1.getTableHeader().setFont(font);
		
		bt_add.addActionListener(this);
		bt_cal.addActionListener(this);
		bt_clear.addActionListener(this);
		bt_export.addActionListener(this);
		bt_import.addActionListener(this);
		
		refreshTable();
		
		this.setVisible(true);
		this.setSize(800, 600);
		this.setTitle("绩点快速计算");
		this.setLocationRelativeTo(null);
		//this.setDefaultLookAndFeelDecorated(true);
		
		
	}
    public void ReadTxtFile(String filePath){
        try {
                File file=new File(filePath);
                if(file.isFile() && file.exists())
                { 			//判断文件是否存在
                	
                    Scanner in = new Scanner(new File(filePath));
                    this.x = new Object[50][3];
                    this.row = -1;
                    refreshTable();
                    while(in.hasNextLine()) {
                    	row++;
                        String str = in.nextLine();
                        splitt(str);
                        SwingUtilities.updateComponentTreeUI(tb1);
                    }
                    in.close();
                }
                else{
                	System.out.println("找不到指定的文件");
                	}
                }
        		catch (Exception e){
        			System.out.println("读取文件内容出错");
        		e.printStackTrace();}
    }
    public void refreshTable(){
    	tableModel = new DefaultTableModel(x,rows);
    	tb1.setModel(tableModel);
    	tb1.repaint();
    	System.out.println("执行刷新指令");
    }
    public void initTable(){
    	x = new Object [50][3];
    	tableModel = new DefaultTableModel(x,rows);
    	tb1.setModel(tableModel);
    	tb1.repaint();
    	System.out.println("执行清空指令");
    }
    public void output(String path){
    	try {
    		FileWriter output = new FileWriter(path);
    		BufferedWriter bf = new BufferedWriter(output);
    		for (int count_op1 = 0;x[count_op1][0]!=null;count_op1++) {
    			for(int count_op2 = 0;count_op2<3;count_op2++){
    				bf.write(x[count_op1][count_op2] + " ");
    			}
    			bf.write("\r\n");
    		}
    		bf.flush();// 此处很关键，如果不写该语句，是不能从缓冲区写到文件里的
    		} catch (FileNotFoundException e) {
    		e.printStackTrace();
    		} catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    		}
    	
    }
    public void outputTest(){
    		for (int count_op1 = 0;x[count_op1][0]!=null;count_op1++) {
    			for(int count_op2 = 0;count_op2<3;count_op2++){
    				System.out.print(x[count_op1][count_op2] + " ");
    			}
    			System.out.println();
    		}
    }
    public double GPAcal(){
    	double cal_sum = 0.0;
    	double cal_total = 0.0;
		double cal_array[] = new double[row+1];
		for(int m = 0;m <= row;m++){
			int z = Integer.parseInt(String.valueOf(x[m][2]));//将得分转换为绩点
			if(z >=90) cal_array[m]=4.0;
			else if(z>=85) cal_array[m]=3.7;
		    else if(z>=82) cal_array[m]=3.3;
			else if(z>=78) cal_array[m]=3.0;
			else if(z>=75) cal_array[m]=2.7;
			else if(z>=72) cal_array[m]=2.3;
			else if(z>=68) cal_array[m]=2.0;
			else if(z>=64) cal_array[m]=1.7;
			else if(z>=60) cal_array[m]=1.0;
			else cal_array[m]=0;
		}
		for(int j = 0;j <= row;j++){
			cal_sum += Double.parseDouble(String.valueOf(x[j][1]));
			cal_total += (cal_array[j])*(Double.parseDouble(String.valueOf(x[j][1])));
		}
		System.out.println(cal_sum);
		System.out.println(cal_total);
		cal_total = cal_total/cal_sum;
		System.out.println("最终结果为"+cal_total);
		rowsCheck();
    	return cal_total;
    
    }
    public void addrows(){
    	if((tx_cname.getText()!=null)&&(tx_cpoint.getText()!=null)&&(tx_cscore.getText()!=null)){
			row++;
			x[row][0] = tx_cname.getText();
			x[row][1] = tx_cpoint.getText();
			x[row][2] = tx_cscore.getText();
			tb1.repaint();
			tx_cname.setText("");
			tx_cpoint.setText("");
			tx_cscore.setText("");
			rowsCheck();
			refreshTable();
		}
    }
    public int rowsCheck(){
    	int current_rows = -1;
    	for(int check_rows = 0;x[check_rows][0]!=null;check_rows++){
    		current_rows++;
    	}
    	System.out.println("current_rows is:"+current_rows);
    	return current_rows;
    }
    public void splitt(String str){
        String strr = str.trim();
        String[] filestrem = strr.split("[\\p{Space}]+");
        String str1 = filestrem[0];
        String str2 = filestrem[1];
        String str3 = filestrem[2];
        if((tx_cname.getText()!=null)&&(tx_cpoint.getText()!=null)&&(tx_cscore.getText()!=null)){
			x[row][0] = str1;
			x[row][1] = str2;
			x[row][2] = str3;
			refreshTable();
			tx_cname.setText("");
			tx_cpoint.setText("");
			tx_cscore.setText("");
		}
        System.out.print(row+" ");
        System.out.print(x[row][0]+" ");
        System.out.print(x[row][1]+" ");
        System.out.print(x[row][2]+" ");
        System.out.println();
    }
	@Override
	public void actionPerformed(ActionEvent e1) {
		// TODO Auto-generated method stub
		if(e1.getSource() == bt_add){
			addrows();
		}
		if(e1.getSource() == bt_clear){
			if(tb1.getValueAt(0, 0)!=null){
				if(JOptionPane.showConfirmDialog(null, "确定清空数据？","提示",JOptionPane.YES_NO_OPTION)==0){
					initTable();
				}
			}
			else
				initTable();
		}
		if(e1.getSource() == bt_cal){
			JOptionPane.showMessageDialog(null, "您的GPA为："+ GPAcal());
		}
		if(e1.getSource()==bt_export){		//导出文件到用户自定义路径
			save_jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
			int intRetVal = save_jfc.showSaveDialog(this);
			if( intRetVal == JFileChooser.APPROVE_OPTION){
				Date time = new Date();
				String str = sdf.format(time);
				String output_filename = save_jfc.getSelectedFile().getPath()
						+"\\"+str+"成绩信息.txt";
				System.out.println("输出文件为"+output_filename);
				file=new File(output_filename);    
				if(!file.exists())    
				{
				    try {    
				        file.createNewFile();
				        output(output_filename);
				    } catch (IOException e) {    
				        // TODO Auto-generated catch block    
				        e.printStackTrace();    
				    }    
				}
				else{
					System.out.println("文件已存在");
				}
		    }
			file = null;
			outputTest();
		}
		if(e1.getSource()==bt_import){
			load_jfc.setFileFilter(new TxtFileFilter());
			if(load_jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {  
				this.file = load_jfc.getSelectedFile();
				System.out.println(this.file.getPath());
				ReadTxtFile(this.file.getPath());
				file = null;
			}
		}
	}
}
