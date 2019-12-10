package denglu;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;





@SuppressWarnings("serial")
public class Delu2 extends JFrame{
	//i 记录登陆状态
	ComputerListener com ;
	Container con ;
	public void Deluwindows(int i){
		JLabel jl;
		JPanel jp;
		JButton jb;
		
		JTextField jt;
		JComboBox<String> jc;
		
		if(i == 0) {
			
			
			
			
				jb = new JButton("登录");
				jl = new JLabel("请选择你的身份：");
				JButton jb2 = new JButton("注册");
				con = new JFrame().getContentPane();
				jp = new JPanel(new GridLayout(5,2,20,10));
				jc = new JComboBox<String>();
				
				
				jc.addItem("请选择");
				jc.addItem("学生");
				jc.addItem("老师");
				jp.add(jl);
				jp.add(jc);
				
				
				JLabel jl2 = new JLabel("请输入你的编号：");	
				JLabel jl4 = new JLabel("请输入你的密码：");
				
				jt = new JTextField(10);
				jp.add(jl2);
				JTextField jt1 = new JTextField(10);
				jp.add(jt1);
				jp.add(jl4);
				JTextField jt3 = new JTextField(10);
				jp.add(jt3);
				jb.addActionListener(com);
				jb2.addActionListener(com);
				com.jc = jc;
				com.delu_number = jt1;
				
				com.delu_key = jt3;
				
				jp.add(jb);
				jp.add(jb2);
				con.add(jp);
				
				this.setTitle("自主选课系统");
				this.setVisible(true);
				this.setBounds(0,0,1000,1000);
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				this.setLayout(new FlowLayout());
				this.add(con);
			
		}
		else {
			String stu_number = com.delu_number();
			String stu_name = com.delu_name ;
			String classname = com.delu_class;
			String teacher = "无";
			try {
				File f = new File("Class.txt");
				FileReader f1 = new FileReader(f);
				BufferedReader read = new BufferedReader(new java.io.InputStreamReader(new FileInputStream(f),"UTF-8"));
				String s;
				while( (s = read.readLine()) != null ){
					String[] strs = s.split( "/" );
					
					if( strs[1].equals(classname)){
						
							
							
							teacher = strs[3];
							
						
						break;
					
				}
					else
						System.out.println();
			}
				f1.close();
				read.close();
				}
			catch (Exception e1) {
				// TODO: handle exception
			}
			
			class_name(classname);
			this.repaint();
			con = new JFrame().getContentPane();
			jl = new JLabel("亲爱的" + stu_name + "同学" , JLabel.LEFT);
			JLabel  jl2 = new JLabel("你目前的课程状态:",JLabel.LEFT);
			JLabel jl3 = new JLabel(classname + "   老师:" + teacher);
			JLabel jl4 = new JLabel("");
			JLabel jl5 = new JLabel("");
			JLabel jl6 = new JLabel("");
			jb = new JButton("学生选课");
			JButton jb1 = new JButton("查看课表");
			
			JButton jb2= new JButton("结束");
			jp = new JPanel(new GridLayout(5,2,20,10));
			jb1.addActionListener(com);
			jb2.addActionListener(com);
			jp.add(jl);
			jp.add(jl4);
			jp.add(jl2);
			jp.add(jl5);
			jp.add(jl3);
			jp.add(jl6);
			jp.add(jb);
			jb.addActionListener(com);
			jp.add(jb1);
			jp.add(jb2);
			con.add(jp);
			
			this.add(con);
			
			this.setBounds(0,0,800,800);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			this.setLayout(new FlowLayout());
			
		}
		
	}
	public String class_name(String s) {
		return s;
	}
	public void get_Class() {
		JPanel jp = new JPanel();
		JTextArea jtf = new JTextArea(10,30);
		jtf.setLineWrap(true);
		jtf.setFont(new Font("宋体",Font.PLAIN,30));
		String s1 = "";
		String temp = "";
		try {
			File f = new File("Class.txt");
			FileReader f1 = new FileReader(f);
			BufferedReader read = new BufferedReader(new java.io.InputStreamReader(new FileInputStream(f),"UTF-8"));
			String s;
			
			while( (s = read.readLine()) != null ){
				String[] strs = s.split( "/" );
				temp = get_Student(strs[1]);
				s1 = s1+s+temp +'\n';
				
				
		
		}
			jtf.setText(s1);
			f1.close();
			read.close();
			}
		catch (Exception e1) {
			// TODO: handle exception
		}
		
		jp.add(jtf);
		
		JButton jb = new JButton("返回");
		jb.addActionListener(com);
		jp.add(jb);
		con.add(jp);
		
		this.setTitle("自主选课系统");
		this.setVisible(true);
		this.setBounds(0,0,1000,1000);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(con);
	
		
	}
	private String get_Student(String strs) {
		
		try {
			File f = new File("Student.txt");
			FileReader f1 = new FileReader(f);
			BufferedReader read = new BufferedReader(new java.io.InputStreamReader(new FileInputStream(f),"UTF-8"));
			String s;
			while( (s = read.readLine()) != null ){
				
				String[] strs1 = s.split( "/" );
				if(strs.equals(strs1[3])) {
					return "学生： "+strs1[1];
				}
				}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		return "";
		// TODO 自动生成的方法存根
		
	}
}
