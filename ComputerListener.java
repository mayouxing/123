package denglu;

import java.awt.Button;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;





public class ComputerListener implements ActionListener{
	 
	Delu2 du;
	JTextField name;
	JTextField number;
	JTextField key;
	Class1 cla;
	JTextField delu_number;
	JTextField delu_key;
	JComboBox<String> jc;
	JComboBox<String> jc_class;
	int delu_i  = 0;
	Delu1 de1; 
	String pro;
	String delu_class;
	String delu_name;
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bu = (JButton) e.getSource();
		if(bu.getLabel().equals("确认")) {
		String gu  = number.getText() + "/" + name.getText() + "/" + key.getText() + "/"+"无";
		if(zuizai() == 1) {
			if(pro.equals("学生")) {
				
				try {
					FileWriter f = new FileWriter("Student.txt" , true);
					PrintWriter pw = new PrintWriter(f);
					pw.println(gu);
					f.close();
					pw.close();
					JOptionPane.showMessageDialog(null, "创建成功");
					
					
				} 
				catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				
				
				
				
			}
			
		}
		}
		else if(bu.getLabel().equals("结束")) {
			System.exit(0);
			
		}
		else if(bu.getLabel().equals("返回")) {
			du.con.removeAll();
			du.Deluwindows(delu_i);
			
		}
		else if(bu.getLabel().equals("登录")) {
			int j = 0;
			if(jc.getSelectedItem().toString().equals("学生")){
				try {
					File f = new File("Student.txt");
					FileReader f1 = new FileReader(f);
					BufferedReader read = new BufferedReader( new FileReader(f));
					
					String s;
					while( (s = read.readLine()) != null ){
						String[] strs = s.split( "/" );
						
						if( strs[0].equals(delu_number.getText())){
							if(strs[2].equals(delu_key.getText())) {
								delu_name = strs[1];
								delu_class = strs[3];
								j = 1;
							
							break;
						}
					}
						
				}
					f1.close();
					read.close();
					}
				catch (Exception e1) {
					// TODO: handle exception
				}
			}
			if(j == 0) {
				JOptionPane.showMessageDialog(null, "没有该账号或密码错误");
				
			}
			else {
				delu_i = 1;
				du.con.removeAll();
				du.Deluwindows(delu_i);
				
			}
				
			}
		else if(bu.getLabel().equals("学生选课")) {
			cla.getclass();
			
		}
		else if(bu.getLabel().equals("查看课表")) {
			du.con.removeAll();
			du.get_Class();
		}
		else if(bu.getLabel().equals("注册")) {
			de1.windows();
			
		}
		else if(bu.getLabel().equals("确定")){
			try {
				File f = new File("Student.txt");
				FileReader f1 = new FileReader(f);
				BufferedReader read = new BufferedReader(new java.io.InputStreamReader(new FileInputStream(f),"UTF-8"));
				String s;
				
				File newf = new File("temp.txt");
				FileWriter fw = new FileWriter(newf, true);
				PrintWriter pw = new PrintWriter(newf);
				
				newf.exists();
				while( (s = read.readLine()) != null ){
					String[] strs = s.split( "/" );
					
					if( strs[1].equals(delu_name)){
						
							
						delu_class = strs[3] = jc_class.getSelectedItem().toString();
						
						
						s = strs[0];
					for(int k= 1 ; k< strs.length;k++) {
						s = s + "/" + strs[k];
					}
							pw.println(s);
							break;
						
						
					
						
				}
					
					else {
						pw.println(s);
						
					}
		
			
				}
				f1.close();
				read.close();
				pw.close();
				fw.close();
				f.delete();
				newf.renameTo(f);
				JOptionPane.showMessageDialog(null, "选课成功");
				cla.jf.dispose();
				du.con.removeAll();
				du.Deluwindows(delu_i);
				}
			catch (Exception e1) {
				// TODO: handle exception
			}
			
			
			
		}	
			
				
			
			
		
		// TODO 自动生成的方法存根
		
	}
	
	public int zuizai() {
		int i = 1;
		pro = jc.getSelectedItem().toString();
		if(pro.equals("学生")) {
			File f = new File("Student.txt");
			String s;
			if(!f.exists())
			try {
				
				f.createNewFile();
				
				
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			else {
				try {
					FileReader f1 = new FileReader(f);
					BufferedReader read = new BufferedReader( new FileReader(f));
					while( (s = read.readLine()) != null ){
						String[] strs = s.split( "/" );
						System.out.println(strs[0]);
						System.out.println(number.getText());
						if( strs[0].equals(number.getText())){
							JOptionPane.showMessageDialog(null, "该账号已存在");
							
							i = 0;
							break;
							
						
				}
					
					}
					f1.close();
					read.close();
					} catch (FileNotFoundException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				} catch (HeadlessException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				
			}
			return i;	
			}
		
		else if(jc.getSelectedItem().toString().equals("老师")) {
			File f = new File("Teacher.txt");
			if(!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		}	
		
		return i;
		
		
	}
	public int delu_i() {
		return delu_i;
		
	}
	public String delu_key() {
		return delu_key.getText();
		
	}
	public String delu_number() {
		return delu_number.getText();
		
	}

}
