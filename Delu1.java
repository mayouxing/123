package denglu;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




@SuppressWarnings("serial")
public class Delu1 extends JFrame{
	ComputerListener com ;
	public void windows() {
		
		
		
		JLabel jl;
		JPanel jp;
		JButton jb;
		Container con ;
		JTextField jt;
		JComboBox<String> jc;
		
			jb = new JButton("ȷ��");
			JButton jb2 = new JButton("ע��");
			jl = new JLabel("��ѡ�������ݣ�");
			
			con = new JFrame().getContentPane();
			jp = new JPanel(new GridLayout(5,2,20,10));
			jc = new JComboBox<String>();
			
			jc.addItem("��ѡ��");
			jc.addItem("ѧ��");
			jc.addItem("��ʦ");
			jp.add(jl);
			jp.add(jc);
			
			
			JLabel jl2 = new JLabel("��������ı�ţ�");
			JLabel jl3 = new JLabel("���������������");
			JLabel jl4 = new JLabel("������������룺");
			
			jt = new JTextField(10);
			jp.add(jl2);
			JTextField jt1 = new JTextField(10);
			jp.add(jt1);
			jp.add(jl3);
			JTextField jt2 = new JTextField(10);
			jp.add(jt2);
			jp.add(jl4);
			JTextField jt3 = new JTextField(10);
			jp.add(jt3);
			
			jb.addActionListener(com);
			
			com.jc = jc;
			com.number = jt1;
			com.name = jt2;
			com.key = jt3;
			jp.add(jb);
			con.add(jp);
			this.setTitle("����ѡ��ϵͳ");
			this.setVisible(true);
			this.setBounds(0,0,1000,1000);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(new FlowLayout());
			this.add(con);
		
	}
	
}
