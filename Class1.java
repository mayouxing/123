package denglu;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Class1 {
	JFrame jf;
	JLabel jl;
	JComboBox<String> jc;
	JPanel jp;
	JButton jb;
	OperatorListener op ;
	ComputerListener com;
	public void getclass(){
		jp = new JPanel(new GridLayout(3,1,20,10));
		jb = new JButton("确定");
		jf = new JFrame("选课");
		jl = new JLabel("请选择课程：");
		jc = new JComboBox<String>();
		
		
		
		jc.addItem("无");
		jc.addItem("/CHinese/wangping/Friday/");
		jc.addItem("/English/zhangping/Monday/");
		jc.addItem("/Math/Wangting/Sunday/");
		
		jb.addActionListener(com);
		jp.add(jl);
		jp.add(jc);
		jp.add(jb);
		jf.add(jp);
		com.jc_class = jc;
		jf.setVisible(true);
		jf.setBounds(0,0,400,400);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.setLayout(new FlowLayout());
	}
	public String class_name(String s) {
		return s;
	}

}
