姓名：马有兴  班别：计181 学号：2018310749

一.实验目的:
          
          分析学生选课系统
           使用GUI窗体及其组件设计窗体界面
           完成学生选课过程业务逻辑编程
           基于文件保存并读取数据
            处理异常
            
 二. 实验要求
          
          1.支持学生注册、课程新加、学生选课，打印学生选课列表等操作
          2.基于事件模型对业务逻辑编程，实现在界面上支持上述操作
          3.基于输入/输出编程，支持学生、课程、教师等数据的读写操作
          
  s三.实验过程
          
          1.创建一个学生类，和一个登录类，并且能实现自主注册。
          成功注册之后，成功登录之后，同时能在操作框显示自己现有课程，
          创建一个选课功能，让学生自主选课，并且自己进行测试。选课成功
          自动返回主页，显示在主页上，创建一个查看所有课程的功能，
          并且输出一个文件框，返回主页，选择结束按钮，结束选课。
  五。实验流程图
         
![image](https://github.com/mayouxing/123/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191211140859.png)
  
  六。实验结果

      登录页面
 ![image](https://github.com/mayouxing/123/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191211142542.png)
 
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

      注册页面
      
 ![image](https://github.com/mayouxing/123/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_201912111425421.png)
      
      JLabel jl2 = new JLabel("请输入你的编号：");
			JLabel jl3 = new JLabel("请输入你的姓名：");
			JLabel jl4 = new JLabel("请输入你的密码：");
			
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
                            
      登录页面
      
 ![image](https://github.com/mayouxing/123/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_201912111425421.png)
 
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
        
	 选课操作
	 
![image](https://github.com/mayouxing/123/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_201912111425423.png)
          
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
         选课成功提示
	 
![image]（https://github.com/mayouxing/123/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_201912111425424.png）

         返回选课页面，课程提示
	 
![image](https://github.com/mayouxing/123/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_201912111425425.png)
          
	  打印课表
	
![image](https://github.com/mayouxing/123/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_201912111425426.png)
      
 实验总结
        这次实验总体难度较高，写的时候，出现很多错误，修改起来比较麻烦。自己写代码的时候，感觉很吃力，对一些知识点了解不够，在实现文件读取等等，很长时间才能解决那个问题。自己以后还需要多练习Java。
	
       

